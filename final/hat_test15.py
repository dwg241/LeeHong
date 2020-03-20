from hat_test14 import sensor, humi,temp
import time

while True:
    
    if not humi is None:
        print('DHT{0}, humidity {1:.1f}%, temperature {2:.1f}*'.format(sensor.dht_type, humi, temp))
    else:
        print('DHT{0}, humidity & temperature: {1}'.format(sensor.dht_type, temp))
    time.sleep(1)