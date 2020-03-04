import RPi.GPIO as GPIO
import time
import datetime as dt
import paho.mqtt.client as mqtt

 

count = 0

# mqtt publisher

broker_address="192.168.0.31"

client2 = mqtt.Client("ClientPublisher")

client2.connect(broker_address)


while True:

 

    count += 1

    dist = send()

   

    pub_data = "{0},{1}".format(count, dist)

 

    # mqtt publisher

    client2.publish("vds1/data", pub_data)


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

        
