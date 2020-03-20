import math
import sys
import time
from grove.adc import ADC
import Adafruit_DHT



__all__ = ["GroveMoistureSensor"]

class GroveMoistureSensor:
    '''
    Grove Moisture Sensor class\
    Args:
        pin(int): number of analog pin/channel the sensor connected.
    '''
    def __init__(self, channel):
        self.channel = channel
        self.adc = ADC()

    @property
    def moisture(self):
        '''
        Get the moisture strength value/voltage
        Returns:
            (int): voltage, in mV
        '''
        value = self.adc.read_voltage(self.channel)
        return value

Grove = GroveMoistureSensor

sensor_1 = Adafruit_DHT.DHT11
pin=5
    
   
try:
    sensor = GroveMoistureSensor(0)
    h, t = Adafruit_DHT.read_retry(sensor_1, pin)
    while True:
        m = sensor.moisture
        

        if 0 < m:
            result = 'Wet'
            print('Moisture value: {0}, {1}'.format(m, result))
            time.sleep(1)
        if h is not None and t is not None :

            print("Temperature = {0:0.1f}*C Humidity = {1:0.1f}%".format(t, h))
        

except KeyboardInterrupt:

    print("Terminated by Keyboard")

   

finally:

    print("End of Program")