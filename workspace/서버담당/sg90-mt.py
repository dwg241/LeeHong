import RPi.GPIO as GPIO
import time

GPIO.setmode(GPIO.BOARD)

SRV = 12
pin = 4

GPIO.setup(SRV, GPIO.OUT)

freq = 100.0

deg_min = 0.0
deg_max = 180.0

dc_min = 5.0
dc_max = 22.0

def convert_dc(deg):
    return((deg-deg_min)*(dc_max-dc_min)/(deg_max-deg_min)+dc_min)

p = GPIO.PWM(SRV, freq)

p.start(0)

dc= convert_dc(float(90))
p.ChangeDutyCycle(dc)

time.sleep(3)

dc= convert_dc(float(90))
p.ChangeDutyCycle(dc)

time.sleep(3)









