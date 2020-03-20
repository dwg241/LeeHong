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
        
        adcChannel=0
        adcValue=read_spi_adc(adcChannel)
        if GPIO.input(pir_s) == True:
            led_name='LED sense'
            led_turn='on'
            led_get=random.randint(1,13)
           
            GPIO.output(pin,True)
            time.sleep(2)

        elif GPIO.input(pir_s) == False:
            led_name='LED sense'
            led_turn='off'
            led_data=random.randint(1,13)
            GPIO.output(pin,False)
            time.sleep(2)
            

        if adcValue < 600 :
            GPIO.output(A1A,True)
            soil_name='토양습도'
            soil_data=adcValue
            soil_turn='on'
            time.sleep(2)

        elif adcValue >700 :
            GPIO.output(A1A,False)
            soil_name='토양습도'
            soil_data=adcValue
            soil_turn='off'
            time.sleep(2)
        
        now = datetime.now().strftime('%Y-%m-%d %H:%M:%S')
        Dtime=str(now)
        sql_insert = "insert into test_3(DEVICE_1,TURN_1,DATA_1,DEVICE_2,TURN_2,DATA_2,TIME )\
        values('{}', '{}','{}', '{}','{}', '{}','{}')".format(led_name,led_turn,led_data,soil_name,soil_turn,soil_data,Dtime)
        cur.execute(sql_insert)            
        con.commit()


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

	c.execute("select * from test_3")

	rows = c.fetchall()
    

	return render_template("total_1.html",rows = rows)



if __name__=='__main__':
    app.run(host='192.168.0.68',port='5000')