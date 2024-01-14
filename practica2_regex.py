import re

def validar_numero_mexicano(numero):
    patron = r'^[1-9][0-9]{1,2} [0-9]{4}-[0-9]{6}$'
    if re.match(patron, numero):
        return True
    else:
        return False

# Solicitar al usuario que ingrese un número de teléfono mexicano
numero_telefono = input("Ingrese un número de teléfono mexicano en el formato 55 3318-215997: ")

# Verificar si el número de teléfono ingresado es válido
if validar_numero_mexicano(numero_telefono):
    print(f"{numero_telefono} es un número de teléfono mexicano válido.")
else:
    print(f"{numero_telefono} no es un número de teléfono mexicano válido.")

