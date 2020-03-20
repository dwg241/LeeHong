import sqlite3
import time
from datetime import datetime
now = datetime.now()
con = sqlite3.connect('DB_25.db')
cur = con.cursor()
cur = con.execute("create table test_3(DEVICE_1 text, TURN_1 text, DATA_1 int ,DEVICE_2 text,TURN_2 text, DATA_2 int ,TIME text);")
#cur = con.execute("create table test_1(TEMPERATURE int, HUMANITY int, TIME text);")
#cur = con.execute("create table test_1(DEVICE text, TURN text, GET int, TIME text );")
#cur = con.execute("insert into test_3(DEVICE, TURN, GET ,TIME) VALUES('LED','on',51,'test');")
#Dname='LED sense'
#Dturn='on'
#Dget= '3'           
#Dtime=str(now)
#sql_insert = "insert into test_1(TUR, GET ) values('{}', '{}')".format(Dturn,Dget)
#cur.execute(sql_insert)
con.commit()
con.close()
