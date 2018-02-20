import mysql.connector    
cnx = mysql.connector.connect(user='root', password='root123',
                              host='127.0.0.1',
                              database='qconductor')

try:
   cursor = cnx.cursor()
   cursor.execute("""
      select * from student
    """)
   result = cursor.fetchall()
   print result
finally:
    cnx.close()
