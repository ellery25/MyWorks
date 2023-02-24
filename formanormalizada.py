def dectobin (number) :

    entero = int(number)
    decimal = number - entero

    binarioE = bin(entero)[2:]


    binarioD = ""

    while decimal > 0:
        decimal *= 2
        binarioD += str(int(decimal))
        decimal = decimal - int(decimal)

    if(binarioD == ""):
        return binarioE
    else:
        return binarioE + "." + binarioD


print("Forma normalizada de un número flotante")

num = float(input("Ingresa un número: "))
mantisaB = int(input("Ingresa la cantidad de bits de la mantisa: "))
expB = int(input("Ingresa la cantidad de bits que se le asignan al exp: "))

if num >= 0:
    signo = "0"
else:
    signo = "1"

listBin = list(dectobin(num))

position = listBin.index(".")

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
else:
    position1 = listBin.index("1")
    listBin[0] = "1"
    for i in range(1, position1):
        listBin.pop(2)
    e = (position1 - 1) - (position1 - 1)*2


numero = "".join(listBin)
print(f"Forma normalizada de punto flotante es {numero}x2**{e}")

exp = dectobin(position)


#Rellena con ceros el número de bits de el exp.
if len(exp) < expB:
    for i in range(0, expB - len(exp)):
        exp = list(exp)
        exp.insert(0,"0")
    exp = "".join(exp)


#Eliminar el entero de la mantisa.
mantisaList = []
numero  = list(numero)
for i in range (2,len(numero)):
    mantisaList.append(numero[i])
mantisa = "".join(mantisaList)


#Rellenar con ceros la mantisa.
if len(mantisa) < mantisaB:
    for i in range(0, mantisaB - len(mantisa)):
        mantisa = list(mantisa)
        mantisa.insert(0,"0")
    mantisa = "".join(mantisa)

#limita las cifras de la mantisa a la cantidad ingresada.
if(len(mantisa) > mantisaB):
    ret = len(mantisa) - mantisaB
    ret = ret - (ret*2)
    mantisa = mantisa[:ret]


#Calcular el exponente en binario.
exp = dectobin(int((2**expB - 1) / 2) + e)

NF = signo + " " + exp + " " + mantisa
print(NF)