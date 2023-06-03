from tkinter import dialog


print("Hola mundo")
# Definición de variables 
x = "El valor de (a+b) es:"
a, b, c = 4, 3, 2
d = (a + b) * c
mostrar = True 
if mostrar:
    print (x,d)

# Esto es un comentario xd 

'''
Otro comentario 
en varias líneas 
de código 
''' 

# Identación de bloques de código 

'''
Normalmente se usan una tabulación o cuatro espacios
''' 

if True:
    print("True")
# No es necesario usar ";" para terminar una línea de código

# Podemos usar ";" para tener dos sentencias en una misma línea 

m = 5; n = 10

# Multiples Líneas 

'''
En la especificación PEP8 
se recomienda 
que las líneas 
no excedan los 
79 caracteres
'''

'''
Haciendo uso de "\" se puede romper el código en varias líneas,
lo que en determinados casos hace que el código sea mucho más legible
'''

e = 1 + 2 + 3 + 4 +\
    5 + 6 + 7 + 8

'''
Si estamos dentro de un bloque rodeado con paréntesis (),
bastaría con saltar a la siguiente línea.
'''

f = (1 + 2 + 3 + 4 +
     5 + 6 + 7 + 8 )

# CREANDO VARIABLES
'''
Podemos asignar el mismo valor a diferentes variables con el siguiente 
codigo:
'''
x = y = z = 10

'''
También podemos asignar varios valores separados por coma 
'''
x, y = 4, 2
x, y , z = 1, 2, 3

# NOMBRANDO VARIABLES
'''
Las mayúsculas y las minúsculas son importantes.
Las variables x y X son distintas.
'''

'''
Normas a la hora de nombrar variables:
-El nombre no puede empezar por un número
-No se permite el uso de guiones -
-Tampoco se permite el uso de espacios.
'''

'''
Comando para ver todas las palabras clave que no se pueden usar
'''
import keyword 
print(keyword.kwlist)

# VARIABLES Y ALCANCE
'''
Al definir una variable es muy importante saber el alcance o scope
que tiene.
'''
x = 10
def funcion():
    x = 5

funcion()
print(x) 

# PRINT
x = 10
y = 20
print ("Los valores x, y son ", x , y)
#Salida: Los valores x, y son: 10 20