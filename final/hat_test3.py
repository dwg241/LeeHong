import RPi.GPIO as GPIO
import time
pin_1=16

GPIO.setwarnings(False)
GPIO.setmode(GPIO.BCM)
GPIO.setup(pin_1,GPIO.OUT)



try:
    
    while True:
        GPIO.output(pin_1,True)
       
        
        
finally:
    GPIO.cleanup()