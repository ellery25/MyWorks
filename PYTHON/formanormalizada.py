#Conversion decimal a binario a partir de una función.
def dectobin (number) :

    entero = int(number)
    decimal = number - entero

    binarioE = bin(entero)[2:]


    binarioD = ""

    while decimal > 0:
        decimal *= 2
        binarioD += str(int(decimal))
        decimal = decimal - int(decimal)

#Condicional que regula el uso del punto en caso de no ser decimal el número dado.
    if(binarioD == ""):
        return binarioE
    else:
        return binarioE + "." + binarioD


print("Forma normalizada de un número flotante")

num = float(input("Ingresa un número: "))
mantisaB = int(input("Ingresa la cantidad de bits de la mantisa: "))
expB = int(input("Ingresa la cantidad de bits que se le asignan al exp: "))

#Definiendo el signo que llevará el número flotante.
if num >= 0:
    signo = 0
else:
    signo = 1

listBin = list(dectobin(num))

position = listBin.index(".")

#Buscando el punto y corriendolo a la izquierda en caso de ser positivo el número.
if listBin[0] == "1":
    temp1 = listBin[1]
    listBin[1] = "."
    for i in range (2, len(listBin)-1):
        if listBin[i] == ".":
            temp2 = listBin[i+1]
            listBin.pop(i)
        else:
            temp2 = listBin[i]
            listBin[i] = temp1
            temp1 = temp2
            e = position - 1
#Corriendo el punto a la derecha en caso de ser negativo el número.
else:
    position1 = listBin.index("1")
    listBin[0] = "1"
    for i in range(1, position1):
        listBin.pop(2)
    e = (position1 - 1) - (position1 - 1)*2


numero = "".join(listBin)
print(f"Forma normalizada de punto flotante es {numero}x2**{e}")


