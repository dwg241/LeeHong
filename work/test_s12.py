import sqlite3
con = sqlite3.connect('DB_11.db')
cur = con.cursor()
cur = con.execute("create table SCORE(STUDENT text, KOREAN int, \
  ENGLISH int, MATH int, MONTH int);")
cur = con.execute("insert into SCORE (STUDENT, KOREAN, ENGLISH, \
  MATH, MONTH) VALUES('3101', 90, 87, 82, 3);")
cur = con.execute("insert into SCORE VALUES('3102', 89, 96, 97, 3);")
cur = con.execute("insert into SCORE VALUES('3103', 79, 69, 75, 3);")
con.commit()
con.close()