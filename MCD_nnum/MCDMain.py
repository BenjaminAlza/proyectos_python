
def Lectura_Cantidad():
        
        while True:
            
            cant_numeros=int(input("Ingrese la cantidad de numeros a evaluar: "))
            
            if(cant_numeros>0):
                
                break
        
        return cant_numeros

def Lectura_Numeros():
    
        global num
        global Valor_Cantidad
        
        Valor_Cantidad=Lectura_Cantidad()
              
        for i in range(0, Valor_Cantidad):
            
            num.append(i)
            
            num[i]=int(input(f"Ingrese numero {i+1}: "))
            
        
def Lectura():
    
    Lectura_Numeros()
    
    
  
def Calculo_Logica():
    
    for j in range(0, Valor_Cantidad):
        
        if(j==0):
          mcd=num[j]
        
        while True:
            
            resto=mcd%num[j]
            mcd=num[j]
            num[j]=resto
            
            if(resto==0):
                break
    
    return mcd
    
    
    
def Interaccion():
    
    global var_retorno
    
    print(f"El maximo comun divisor es: {Valor_mcd}")
    
    while True:
        var_retorno=int(input("DESEA VOLVER: (SI:1  NO:0): "))
        
        if(var_retorno==1 or var_retorno==0):
            break
    
    if(var_retorno==0):
        print("\n")
        print("GRACIAS Runway IS ;)")
        
#
#
#Estructura principal

while True:
    
    num=[]
    
    Lectura()
    
    Valor_mcd=Calculo_Logica()
    
    Interaccion()
    
    if(var_retorno!=1):
         break
