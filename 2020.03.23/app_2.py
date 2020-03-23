import time
import sqlite3
import dht11 as dht
from flask import Flask , jsonify,render_template
import hat_test17

#count = 0
con = sqlite3.connect('DB_28.db')
cur = con.cursor()
app = Flask(__name__)

@app.route('/')
def home():
  #  global count
  #  count += 1
    return render_template("home3.html",test=hat_test17.gethum())
@app.route('/dht_db')
def dht_db():
    
	conn = sqlite3.connect('DB_28.db')
    

	conn.row_factory=sqlite3.Row
    

	c = conn.cursor()


	c.execute("select * from test_1")

	rows = c.fetchall()
    

	return render_template("dht_db.html",rows = rows,test1=hat_test17.gethum())




if __name__=='__main__':
    app.run(host='192.168.0.68',port='5000')
