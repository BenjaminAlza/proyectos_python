def Lectura_Cantidad():
    
    while True:
        
        cant_numeros=int(input("Ingrese la cantidad de numeros a evaluar: "))
        
        if(cant_numeros>0):
            break
    
    return cant_numeros



def Mcd_f():
    
    for i in range(0,Lectura_Cantidad()):
        
        while True:
            
            num=int(input(f"Ingrese numero {i+1}: "))
            
            if(num>0):
                break
        
        
        if(i==0):
            mcd=num
        
        while True:
            
            resto=mcd%num
            mcd=num
            num=resto
            
            if(resto==0):
                break
            
    
    return mcd


def ImprimirResultado_mcd():
    print(f"El maximo comun divisor es: {almacen_resultado_mcd}")
    


def Menu_Retorno():
    
    while True:
        variable_retorno=int(input("DESEA VOLVER: (SI:1  NO:0): "))
        if(variable_retorno==1 or variable_retorno==0):
            break
    
    return variable_retorno
    


def Mensaje_despedida():
    
    if(almacen_retorno==0):
        print("\n")
        print("GRACIAS Runway IS ;)")
        
    
#
#
#    
#Estructura principal

while True:
    
    almacen_resultado_mcd=Mcd_f()
    
    ImprimirResultado_mcd()
    
    almacen_retorno=Menu_Retorno()
    
    if(almacen_retorno!=1):
         break

Mensaje_despedida()


            
            
        
        