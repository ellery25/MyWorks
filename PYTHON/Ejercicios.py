from random import *

# Realiza una función que sume dos números pasados por parámetros.

def Suma(numero1, numero2):
    return numero1 + numero2

print(Suma(1,2))

# Realiza una función que indique si un número pasado por parámetro es par o impar.

def esPar(numero):
        return numero % 2 == 0

print(esPar(6))

#Hacer una función que nos genere un numero aleatorio entre dos parámetros pasados.

def numeroAleatorio(min, max):
    try:
        if(min > max):
            aux = min
            min = max
            max = aux
            return randint(min, max)
        else:
            return randint(min, max)
    except TypeError:
        print("Debes escribir numeros")
        return -1

print(numeroAleatorio(10, 20))

# Crea una función que calcule el factorial de un número pasado por parámetro
