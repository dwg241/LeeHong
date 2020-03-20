import time
import grovepi
# Connect the Grove Moisture Sensor to analog port A0
# SIG,NC,VCC,GND
sensor = 0
while True:
    try:
        soil= grovepi.analogRead(sensor)
        print(soil)
        time.sleep(1)
    except KeyboardInterrupt:
        break
    except IOError:
        print ("Error")