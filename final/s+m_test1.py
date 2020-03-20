import RPi.GPIO as GPIO
import time
import spidev

A1A=21

GPIO.setwarnings(False)
GPIO.setmode(GPIO.BCM)
GPIO.setup(A1A,GPIO.OUT)

spi=spidev.SpiDev()
spi.open(0,0)
spi.max_speed_hz=50000
def read_spi_adc(adcChannel):
    adcValue=0
    buff=spi.xfer2([1,(8+adcChannel)<<4,0])
    adcValue=((buff[1]&3)<<8)+buff[2]
    return adcValue


try:
    adcChannel=0
    while True:
        adcValue=read_spi_adc(adcChannel)
        print("토양수분: %d "%(adcValue))
        if adcValue < 600 :
            GPIO.output(A1A,True)
            time.sleep(5)
        else:
            GPIO.output(A1A,False)

        
           

     
        
finally:
    GPIO.cleanup()
    spi.close()