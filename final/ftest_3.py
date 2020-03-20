import RPi.GPIO as GPIO
import time
import sqlite3
from flask import Flask,render_template,request
from datetime import datetime
import random

con = sqlite3.connect('DB_23.db')
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
            Dget=random.randint(1,13)
            Dtime=str(now)
            sql_insert = "insert into test_1 values('{}', '{}','{}','{}')".format(Dname, Dturn,Dget,Dtime)

            cur.execute(sql_insert)
            con.commit()
            
            GPIO.output(pin,True)
            time.sleep(3)

        else:
            Dname='LED sense'
            Dturn='off'
            Dget=random.randint(1,13)
            Dtime=str(now)

            sql_insert = "insert into test_1 values('{}', '{}','{}','{}')".format(Dname, Dturn,Dget,Dtime)
    
            cur.execute(sql_insert)
            
            con.commit()
            GPIO.output(pin,False)
            time.sleep(3)
			
			


        
except KeyboardInterrupt:
    GPIO.cleanup()

app= Flask(__name__)


@app.route('/')
def home():

	
    

	return render_template("home2.html")
@app.route('/ftest_1')
def ftest_1():

	conn = sqlite3.connect('DB_23.db')

	conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select * from test_1")

	rows = c.fetchall()
    

	return render_template("ftest_1.html",rows = rows)
@app.route('/ftest_1avg')
def ftest_1avg():

	conn = sqlite3.connect('DB_23.db')

	conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select TURN,  avg(GET)  FROM test_1 group by TURN")

	rows = c.fetchall()
    

	return render_template("ftest_1avg.html",rows = rows)
@app.route('/ftest_1sp')
def ftest_1sp():

	
	conn = sqlite3.connect('DB_23.db')

	conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select*FROM test_1 WHERE get > 10")

	rows = c.fetchall()
    

	return render_template("ftest_1sp.html",rows = rows)

@app.route('/ftest_1fiter')
def ftest_1fiter():

	conn = sqlite3.connect('DB_23.db')

	conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select*FROM test_1 WHERE get < 11")

	rows = c.fetchall()
    

	return render_template("ftest_1fiter.html",rows = rows)
if __name__=='__main__':
    app.run(host='192.168.0.68',port='5000')
