import sqlite3
con = sqlite3.connect('DB_14.db')
cur = con.cursor()

#cur = con.execute("create table PLANT(DEVICE text, TURN text);")
cur = con.execute("insert into PLANT (DEVICE, TURN) VALUES('lamp','on');")
cur = con.execute("insert into PLANT (DEVICE, TURN) VALUES('lamp','off');")
Dname='조도 센서'
Dturn='good'
sql_insert = "insert into PLANT values('{}', '{}')".format(Dname, Dturn)
cur = con.execute(sql_insert)
con.commit()
con.close()