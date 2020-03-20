import RPi.GPIO as GPIO
import time
import spidev



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
     
        time.sleep(0.5)
finally:
    GPIO.cleanup()
    spi.close()