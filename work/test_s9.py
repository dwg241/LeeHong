import RPi.GPIO as GPIO
import time
from flask import Flask,render_template,request
from datetime import datetime
now = datetime.now()

import sys
sys.stdout = open('DB_8.txt','a')

pin=16
pir_s=25

GPIO.setmode(GPIO.BCM)

GPIO.setup(pin,GPIO.OUT)
GPIO.setup(pir_s,GPIO.IN)

try:
    while  True:
        if GPIO.input(pir_s) == True:
            print('[on('+str(now)+')]     ')
            GPIO.output(pin,True)
            time.sleep(2)
        else:
            print('[off('+str(now)+'])    ')
            time.sleep(2)
            GPIO.output(pin,False)

        
except KeyboardInterrupt:
    GPIO.cleanup()

app= Flask(__name__)



@app.route('/')
def student():
    f = open('DB_8.txt', 'r')
    return render_template('test.html',datatwo="\n".join(f.readlines()))

if __name__=='__main__':
    app.run(host='192.168.0.68',port='5000')

