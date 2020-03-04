#coding: utf-8

import RPi.GPIO as GPIO
import time
#flask
from flask import Flask

#request
from flask import request


pin=16
pir_s=25


GPIO.setmode(GPIO.BCM)

GPIO.setup(pin,GPIO.OUT)
GPIO.setup(pir_s,GPIO.IN)


def send():
    try:
        while  True:
            if GPIO.input(pir_s) == True:
                print('on')
                GPIO.output(pin,True)
                time.sleep(2)
            else:
                print('off')
                time.sleep(2)
                GPIO.output(pin,False)
    except KeyboardInterrupt:
        GPIO.cleanup()

a=send()

app= Flask(__name__)

@app.route('/')
def index():
    
    return send()


if __name__=='__main__':
    app.run(host='192.168.0.68',port='5000')
    