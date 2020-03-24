import time
import Adafruit_DHT
import sqlite3
from datetime import datetime


def gethum():
    
    sensor = Adafruit_DHT.DHT11
    pin = 5
    h, t = Adafruit_DHT.read_retry(sensor, pin)
    result = ''
   
    while True:
        
    
        if h is not None and t is not None :
            now = datetime.now().strftime('%H:%M:%S')    #시간
            Dtime=str(now)
          
            con = sqlite3.connect('DB_35.db') # db연결
            cur = con.cursor() 
            sql_insert = "insert into test_1 values('{}', '{}','{}')".format(Dtime,t,h) #센서값 DB에 삽입 삽입
            cur.execute(sql_insert)
            con.commit()
            time.sleep(2)

      
            result="Tempearture " "{}℃, " " humanity " "{}%".format(t, h)

        else :

            result='Read error'
    
        return result

    