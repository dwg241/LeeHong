import time
import sqlite3
from flask import Flask,render_template,request
from datetime import datetime



app= Flask(__name__)


@app.route('/')
def home():

	
    

	return render_template("home2.html")
if __name__=='__main__':
    app.run(host='192.168.0.31',port='5000')