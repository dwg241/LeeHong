import time
import sqlite3
from flask import Flask,render_template,request
from datetime import datetime

app= Flask(__name__)


@app.route('/')
def home():

	
    

	return render_template("home.html")

@app.route('/test_1')
def test_d1():

	conn = sqlite3.connect('DB_21.db')

	conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select * from test_1")

	row1 = c.fetchall()
    

	return render_template("test_1.html",rows = row1)

@app.route('/test_2')

def test_d2():

	conn = sqlite3.connect('DB_21.db')

	conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select * from test_2")

	row2 = c.fetchall()
    

	return render_template("test_2.html",rows = row2)

@app.route('/test_3')

def test_d3():

	conn = sqlite3.connect('DB_21.db')

	conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select * from test_3")

	row3 = c.fetchall()
    

	return render_template("test_3.html",rows = row3)

def test_d4():

	conn = sqlite3.connect('DB_21.db')

	conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select * from test_1")

	row1 = c.fetchall()
    
    c.execute("select * from test_2")

	row2 = c.fetchall()

    c.execute("select * from test_3")

	row3 = c.fetchall()
    

	return render_template("test_4.html",rows = row3)





if __name__=='__main__':
    app.run(host='192.168.0.31',port='5000')