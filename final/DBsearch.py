import sqlite3
con = sqlite3.connect('DB_25.db')
cursor = con.cursor()
cursor.execute("SELECT name FROM sqlite_master WHERE type='table';")
#cursor.execute("select*FROM test_1 ")

print(cursor.fetchall())


