
import mysql.connector
con = mysql.connector.connect(host='localhost',database='Gerenciamento_PSS',user='root',password='')
if con.is_connected():
    db_info = con.get_server_info()
    print("Conectado ao servidor MySQL versão ",db_info)
    cursor = con.cursor()
    linha = cursor.fetchone()
    print("Conectado ao banco de dados ")

mycursor = con.cursor()

mycursor.execute ("Select * from instituicao")




myresult = mycursor.fetchall()


for x in myresult:
    print( "Os Dados encontrados foram: ")