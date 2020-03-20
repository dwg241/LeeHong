import sqlite3
import time
from datetime import datetime
now = datetime.now()
con = sqlite3.connect('DB_24.db')
cur = con.cursor()
cur.execute("select TURN, avg(GET)  FROM test_3 group by TURN")
row1=cur.fetchall()
print(row1)
con.commit()
con.close()