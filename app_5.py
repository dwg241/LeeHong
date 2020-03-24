import time
import sqlite3
from flask import Flask,render_template,request
app= Flask(__name__)


@app.route('/')
def ftest_1():

	conn = sqlite3.connect('DB_31.db')

	#conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select * from test_1")

	rows = c.fetchall()
    

	return render_template("ftest_1.html",rows = rows)
@app.route("/graph") 
def graph(): 
    return render_template('graph.html') 
if __name__=='__main__':
    app.run(host='192.168.0.31',port='5000')