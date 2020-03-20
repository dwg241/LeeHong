import RPi.GPIO as GPIO
import time
A1A=21

GPIO.setwarnings(False)
GPIO.setmode(GPIO.BCM)
GPIO.setup(A1A,GPIO.OUT)


try:
    
    while True:
        GPIO.output(A1A,True)
        
        
finally:
    GPIO.cleanup()
    