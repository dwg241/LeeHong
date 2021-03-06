import RPi.GPIO as GPIO
import time
import sqlite3
from flask import Flask,render_template,request
from datetime import datetime
import random
import RPi.GPIO as GPIO
import time
import spidev

A1A=21

GPIO.setwarnings(False)
GPIO.setmode(GPIO.BCM)
GPIO.setup(A1A,GPIO.OUT)

spi=spidev.SpiDev()
spi.open(0,0)
spi.max_speed_hz=50000
DB='DB_25.db'
con = sqlite3.connect(DB)
cur = con.cursor()

pin=16
pir_s=25

GPIO.setmode(GPIO.BCM)

GPIO.setup(pin,GPIO.OUT)
GPIO.setup(pir_s,GPIO.IN)





def read_spi_adc(adcChannel):
    adcValue=0
    buff=spi.xfer2([1,(8+adcChannel)<<4,0])
    adcValue=((buff[1]&3)<<8)+buff[2]
    return adcValue



try:
    while  True:
        now = datetime.now().strftime('%Y-%m-%d %H:%M:%S')
        adcChannel=0
        adcValue=read_spi_adc(adcChannel)
        if GPIO.input(pir_s) == True:
            name='LED sense'
            turn='on'
            get=random.randint(1,13)
            #Dtime=str(now)
            sql_insert = "insert into test_1(DEVICE_1,TURN_1,GET ) values('{}', '{}','{}')".format(name, turn,get)

            cur.execute(sql_insert)
            con.commit()
			
            GPIO.output(pin,True)
            time.sleep(2)

        if GPIO.input(pir_s) == False:
            name='LED sense'
            turn='off'
            get=random.randint(1,13)
            #Dtime=str(now)

            sql_insert = "insert into test_1(DEVICE_1,TURN_1,GET ) values('{}', '{}','{}')".format(name, turn,get)
    
            cur.execute(sql_insert)
            
            con.commit()
            GPIO.output(pin,False)
            time.sleep(2)


           
        if adcValue < 600 :
            GPIO.output(A1A,True)
            name2='토양습도'
            sdata=adcValue
            get='on'

            sql_insert = "insert into test_1(DEVICE_2,SOIL,TURN_2 ) values('{}', '{}', '{}')".format(name2,sdata,get)
    
            cur.execute(sql_insert)
            
            con.commit()
            time.sleep(2)



        if adcValue >700 :
            GPIO.output(A1A,False)
            name2='토양습도'
            sdata=adcValue
            get='off'

            sql_insert = "insert into test_1(DEVICE_2,SOIL,TURN_2 ) values('{}', '{}', '{}')".format(name2,sdata,get)
            cur.execute(sql_insert)
            
            con.commit()
            time.sleep(2)
        

except KeyboardInterrupt:
    GPIO.cleanup()



app= Flask(__name__)


@app.route('/')
def home():

	
    

	return render_template("home3.html")
@app.route('/total_1')
def total_1():

	conn = sqlite3.connect(DB)

	conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select * from test_1")

	rows = c.fetchall()
    

	return render_template("total_1.html",rows = rows)



if __name__=='__main__':
    app.run(host='192.168.0.68',port='5000')