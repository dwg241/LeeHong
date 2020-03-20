from hum import h,t
import time


try:

    while True :

        if h is not None and t is not None :

            print("Temperature = {0:0.1f}*C Humidity = {1:0.1f}%".format(t, h))

        else :

            print('Read error')

        time.sleep(1)
except KeyboardInterrupt:

    print("Terminated by Keyboard")

   
finally:

    print("End of Program")
    
