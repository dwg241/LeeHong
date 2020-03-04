import RPi.GPIO as GPIO
import time

pin=16
pir_s=25

GPIO.setmode(GPIO.BCM)

GPIO.setup(pin,GPIO.OUT)
GPIO.setup(pir_s,GPIO.IN)

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

