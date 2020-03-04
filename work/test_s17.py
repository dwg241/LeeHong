import RPi.GPIO as GPIO
import time
import sqlite3
from flask import Flask,render_template,request
from datetime import datetime


con = sqlite3.connect('DB_20.db')
cur = con.cursor()

pin=16
pir_s=25

GPIO.setmode(GPIO.BCM)

GPIO.setup(pin,GPIO.OUT)
GPIO.setup(pir_s,GPIO.IN)

try:
    while  True:
        now = datetime.now().strftime('%Y-%m-%d %H:%M:%S')
        
        if GPIO.input(pir_s) == True:
            Dname='LED sense'
            Dturn='on'
            Dtime=str(now)

            sql_insert = "insert into PLANT values('{}', '{}','{}')".format(Dname, Dturn,Dtime)
    
            cur.execute(sql_insert)
            con.commit()

    
            
            GPIO.output(pin,True)
            time.sleep(2)\

        else:
            Dname='LED sense'
            Dturn='off'
            Dtime=str(now)

            sql_insert = "insert into PLANT values('{}', '{}','{}')".format(Dname, Dturn,Dtime)
    
            cur.execute(sql_insert)
            
            con.commit()


            time.sleep(2)
            GPIO.output(pin,False)


        
except KeyboardInterrupt:
    GPIO.cleanup()

app= Flask(__name__)



@app.route('/')
def hello():

	conn = sqlite3.connect('DB_20.db')

	conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select * from PLANT")

	rows = c.fetchall()
    

	return render_template("test_2.html",rows = rows)

if __name__=='__main__':
    app.run(host='192.168.0.68',port='5000')

