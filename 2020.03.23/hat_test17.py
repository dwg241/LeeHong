import time
import Adafruit_DHT
import sqlite3



def gethum():
    sensor = Adafruit_DHT.DHT11
    pin = 5
    h, t = Adafruit_DHT.read_retry(sensor, pin)
    result = ''
   
    while True:
    
        if h is not None and t is not None :
            con = sqlite3.connect('DB_28.db')
            cur = con.cursor()
            sql_insert = "insert into test_1 values('{}', '{}')".format(t,h)
            cur.execute(sql_insert)
            con.commit()
            time.sleep(2)

      
            result="{},{}".format(t, h)

        else :
            

            result='Read error'
    
        return result

    
