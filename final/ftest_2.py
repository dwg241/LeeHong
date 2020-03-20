import time
import sqlite3
from flask import Flask,render_template,request
from datetime import datetime



app= Flask(__name__)


@app.route('/')
def home():

	
    

	return render_template("home2.html")
@app.route('/ftest_1')
def ftest_1():

	conn = sqlite3.connect(DB)

	conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select * from test_3")

	rows = c.fetchall()
    

	return render_template("ftest_1.html",rows = rows)
@app.route('/ftest_1avg')
def ftest_1avg():

	conn = sqlite3.connect(DB)

	conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select TURN, avg(GET)  FROM test_3 group by TURN")

	rows = c.fetchall()
    

	return render_template("ftest_1avg.html",rows = rows)

@app.route('/ftest_1sp')
def ftest_1sp():

	conn = sqlite3.connect(DB)

	conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select*FROM test_3 WHERE get > 10")

	rows = c.fetchall()
    

	return render_template("ftest_1sp.html",rows = rows)

if __name__=='__main__':
    app.run(host='192.168.0.31',port='5000')