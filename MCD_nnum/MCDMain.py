
def Lectura_Datos():
    
    global cant_numeros
    
    while True:
        
        cant_numeros=int(input("Ingrese la cantidad de numeros a evaluar: "))
        
        if(cant_numeros>0):
            break
    
    global num
    for i in range(0, cant_numeros):
        
        num.append(i)
        
        num[i]=int(input(f"Ingrese numero {i+1}: "))
            
           
        
def Calculo_Logica(num, cant_numeros):
    
    global mcd
    for j in range(0, cant_numeros):
        
        if(j==0):
          mcd=num[j]
        
        while True:
            
            resto=mcd%num[j]
            mcd=num[j]
            num[j]=resto
            
            if(resto==0):
                break
    
    
    
def Interaccion(mcd):
    
    print(f"El maximo comun divisor es: {mcd}")
    
    global variable_retorno
    while True:
        variable_retorno=int(input("DESEA VOLVER: (SI:1  NO:0): "))
        
        if(variable_retorno==1 or variable_retorno==0):
            break
    
    if(variable_retorno==0):
        print("\n")
        print("GRACIAS Runway IS ;)")
        
 
#Estructura principal

while True:
    
    num=[]
    
    Lectura_Datos()
    
    Calculo_Logica(num, cant_numeros)
    
    Interaccion(mcd)
    
    if(variable_retorno!=1):
         break
