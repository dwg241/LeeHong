import RPi.GPIO as GPIO  
from time import sleep



GPIO.setmode(GPIO.BOARD) 

GPIO.setup(21, GPIO.OUT) 

p = GPIO.PWM(21, 50)   

p.start(0)            

p.ChangeDutyCycle(3) 
sleep(1)

p.ChangeDutyCycle(12)
sleep(1) 

p.ChangeDutyCycle(7.5)
sleep(1)




  

p.stop()                

GPIO.cleanup() 