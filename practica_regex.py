import re

def validar_email(email):
    patron = r'^[\w\.-]+@[\w\.-]+\.\w+$'
    if re.match(patron, email):
        return True
    else:
        return False

# Pedir al usuario que ingrese su correo electrónico
correo = input("Por favor, ingrese su correo electrónico: ")

# Verificar si el correo electrónico ingresado es válido
if validar_email(correo):
    print(f"{correo} es un correo electrónico válido.")
else:
    print(f"{correo} no es un correo electrónico válido.")


    
    