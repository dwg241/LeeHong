import sqlite3
import time
from datetime import datetime
now = datetime.now()
con = sqlite3.connect('DB_36.db')
cur = con.cursor()
cur = con.execute("create table test_1(time text, humanity int, temperature int);")
#cur = con.execute("create table test_1(TEMPERATURE int, HUMANITY int, TIME text);")
#cur = con.execute("create table test_1(DEVICE text, TURN text, GET int, TIME text );")


#Dname='LED sense'
#Dturn='on'
#Dget= '3'           
#Dtime=str(now)
#sql_insert = "insert into test_1(TUR, GET ) values('{}', '{}')".format(Dturn,Dget)
#cur.execute(sql_insert)
con.commit()
con.close()