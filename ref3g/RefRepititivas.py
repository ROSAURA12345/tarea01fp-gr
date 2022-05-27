print(f"Holas")
def serieFibonaci():
    nI=0
    nS=1
    n=int(input("Introduce el N numero:"))
    cont=1
    print(nI)
    while(cont<n):
        print(nS)
        nT=nS+nI
        nI=nS
        nS=nT
        cont=cont+1

#serieFibonaci()


def FibonaciN():
    nI=0
    nS=1
    n=int(input("Introduce el N numero:"))
    cont=1
    #print(nI)
    if(n>1):
        while(cont<n):
            #print(nS)
            nT=nS+nI
            nI=nS
            nS=nT
            cont=cont+1
    else:        
        nS=n
    print(f"si fibonasi de {n} es {nS}")
#serie fibonasi()
FibonaciN()

def siNumeroPrimo():
    num=int(input("Ingrese un numero:"))
    cont=1
    cantDiv=0
    while(cont<=num):
        if(num%cont==0):
            cantDiv=cantDiv+1
        cont=cont+1
    if(cantDiv==2):
        print(f"El numero {num} es primo")
    else:
        print(f"El numero {num} no es primo")


siNumeroPrimo()
def numerosPrimos():
    num=int(input("Ingrese el limite maximo:"))
    numX=1
    
    while(numX<=num):
        cont=1
        cantDiv=0
    while (cont<=numX):   
        #if cantDiv>2:
        #    break
        cont=cont+1
    if(numXcont==0):
        cont=cont+1
    if(cantDiv==2):
        print(f"{numX}")    
        numX=numX+1

        
numerosPrimos()

