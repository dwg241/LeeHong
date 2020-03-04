import sqlite3
import time
from datetime import datetime
now = datetime.now()
con = sqlite3.connect('DB_17.db')
cur = con.cursor()
#cur = con.execute("create table PLANT(DEVICE text, TURN text, TIME text);")
cur = con.execute("insert into PLANT (DEVICE, TURN, TIME) VALUES('lamp','off','test');")
Dname='led'
Dturn='good'
Dtime= str(now)
sql_insert = "insert into PLANT values('{}', '{}','{}')".format(Dname, Dturn,Dtime)
cur = con.execute(sql_insert)
con.commit()
con.close()