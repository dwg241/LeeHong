import sqlite3
con = sqlite3.connect('DB_21.db')
cur1 = con.cursor()
cur1.execute("select * from test_1")
row1 = cur1.fetchall()
cur1.execute("select * from test_2")
row2 = cur1.fetchall()
cur1.execute("select * from test_3")
row3 = cur1.fetchall()
print (row1)
print (row2)
print (row3)
#for row in cur:
  #  print(row[0])
