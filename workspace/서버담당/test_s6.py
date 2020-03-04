import sys
sys.stdout = open('DB_3.txt','a')
while 1:
    a= int(input('favorite fruit'))    
    if a==1:
        print(" apple")
    if a==2:
        print(" grape")
    if a==3:
        break