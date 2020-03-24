import time
import sqlite3
from flask import Flask, jsonify,render_template
import hat_test17


app = Flask(__name__)

@app.route('/')
def home():
  
    return render_template("hello.html",dht11=hat_test17.gethum()) # hello.html 우리가 보여줄 페이지!!,dht11은 실시간 센서 값 받는 변수 hello.html에 {{dhtll}}이라는 값이 있음!!!

@app.route("/graph") #그래프 주소
def graph(): 
    
    conn = sqlite3.connect('DB_35.db') #db연결하는 함수

	#conn.row_factory=sqlite3.Row
    c = conn.cursor()
    c.execute("select * from test_1")
    rows = c.fetchall()  #db에 있는값 데이터들을 rows로 가져온다.
    return render_template('graph_2.html',max=30, values=rows, dhtnow=hat_test17.gethum()) 
	#max는 y값 크기, row값을 values로 받아온다. 현재창 업데이트를 위해 dhtnow가 필요

	


if __name__=='__main__':
    app.run(host='192.168.0.68',port='5000')
