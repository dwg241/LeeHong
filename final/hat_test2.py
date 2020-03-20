import RPi.GPIO as GPIO
import time
pin_1=5
pin_2=6
GPIO.setwarnings(False)
GPIO.setmode(GPIO.BCM)
GPIO.setup(pin_1,GPIO.OUT)
GPIO.setup(pin_2,GPIO.OUT)


try:
    
    while True:
        GPIO.output(pin_1,True)
        GPIO.output(pin_2,False)
        
        
finally:
    GPIO.cleanup()