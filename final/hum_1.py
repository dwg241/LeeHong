import time
import Adafruit_DHT
import sqlite3
from flask import Flask,render_template,request
from datetime import datetime
con = sqlite3.connect('DB_23.db')
cur = con.cursor()
sensor = Adafruit_DHT.DHT11
pin = 20
try:
    while True :
        
        h, t = Adafruit_DHT.read_retry(sensor, pin)
        if h is not None and t is not None :
            now = datetime.now().strftime('%Y-%m-%d %H:%M:%S')
           
            Dtime=str(now)
            sql_insert = "insert into test_4 values('{}', '{}','{}')".format(t, h,Dtime)
            cur.execute(sql_insert)
            
            con.commit()

            
            #print("Temperature = {0:0.1f}*C Humidity = {1:0.1f}%".format(t, h))
        else :
            print('Read error')
        
    
            

except KeyboardInterrupt:
    print("Terminated by Keyboard")
 
finally:
    print("End of Program")


app= Flask(__name__)


@app.route('/')
def home():

	
    

	return render_template("home2.html")
@app.route('/human')
def human():

	conn = sqlite3.connect('DB_23.db')

	conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select * from test_4")

	rows = c.fetchall()
    

	return render_template("human.html",rows = rows)



if __name__=='__main__':
    app.run(host='192.168.0.68',port='5000')