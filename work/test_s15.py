from flask import Flask, render_template
import sqlite3


app = Flask(__name__)


@app.route("/")

	

def hello():

	conn = sqlite3.connect('DB_10.db')

	conn.row_factory=sqlite3.Row

	c = conn.cursor()

	c.execute("select * from PLANT")

	rows = c.fetchall()
    

	return render_template("test_2.html",rows = rows)

if __name__ == "__main__":

    app.run(host='192.168.0.31', port=5000, debug=True) 

