import pymysql
 
conn = pymysql.connect(host='localhost', user='root', password='admin',
                       db='test1', charset='utf8')
 
curs = conn.cursor()
sql = """insert into customer(name,category,region)
         values (%s, %s, %s)"""
curs.execute(sql, ('홍길동', 1, '서울'))
curs.execute(sql, ('이연수', 2, '서울'))
conn.commit()
 
conn.close()