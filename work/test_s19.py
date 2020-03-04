import sqlite3
import time
from datetime import datetime
now = datetime.now()
con = sqlite3.connect('DB_21.db')
cur = con.cursor()
#cur = con.execute("create table test_1(DEVICE text, TURN text, TIME text);")
cur = con.execute("insert into test_1 (DEVICE, TURN, TIME) VALUES('LED','on','test');")
con.commit()
con.close()