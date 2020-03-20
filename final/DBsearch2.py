import sqlite3
con = sqlite3.connect('DB_23.db')
cursor = con.cursor()
#cursor.execute("SELECT name FROM sqlite_master WHERE type='table';")
cursor.execute("select*FROM test_4 ")

print(cursor.fetchall())


