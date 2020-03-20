import RPi.GPIO as GPIO
import time
pin =5

GPIO.setmode(GPIO.BCM)
GPIO.setup(pin,GPIO.IN)

def soilcall(pin):
    if GPIO.input(pin):
        print("water")
    else:
        print("NO water")

GPIO.add_event_detect(pin,GPIO.BOTH, bouncetime=300)
GPIO.add_event_soilcall(pin, soilcall)

while True:
    time.sleep(1)