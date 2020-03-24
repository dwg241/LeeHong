import time
import sqlite3
import json
from flask import Flask,render_template,request,Markup
app= Flask(__name__)

labels = [
    'JAN', 'FEB', 'MAR', 'APR',
    'MAY', 'JUN', 'JUL', 'AUG',
    'SEP', 'OCT', 'NOV', 'DEC'
]
values = [
    967.67, 1190.89, 1079.75, 1349.19,
    2328.91, 2504.28, 2873.83, 4764.87,
    4349.29, 6458.30, 9907, 16297
]


@app.route('/data.lee')
def ftest_1():

	conn = sqlite3.connect('DB_31.db')

	#conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select * from test_1")

	rows = c.fetchall()
    

	return json.dumps(rows)
@app.route("/graph") 
def graph(): 
    
    conn = sqlite3.connect('DB_33.db')

	#conn.row_factory=sqlite3.Row
    c = conn.cursor()
    c.execute("select * from test_1")
    rows = c.fetchall()
    return render_template('graph_2.html',max=30, labels=rows, values=rows) 
if __name__=='__main__':
    app.run(host='192.168.0.31',port='5000')