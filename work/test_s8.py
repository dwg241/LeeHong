from flask import Flask,render_template,request

app= Flask(__name__)



@app.route('/')
def student():
    f = open('DB.txt', 'r')
    return render_template('test.html',datatwo="\n".join(f.readlines()))

if __name__=='__main__':
    app.run(host='192.168.0.31',port='5000',debug=True)