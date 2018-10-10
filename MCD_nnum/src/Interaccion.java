public class Interaccion {
	
	
	public static void ImprimirDato() {
		
		int AuxCant, mensajemcd;
		
		AuxCant=Lectura.Lectura_Cantidad();
		mensajemcd=Logica.Calculo_mcd(AuxCant);
		
		System.out.println("\n El Maximo Comun Divisor es:  "+mensajemcd);
		
	}
	
	public static void MenuRetorno() {
		
		int retorno;
		retorno=Lectura.Lectura_Retorno();
		if(retorno==0) {System.out.println("\n \n \n GRACIAS Runway IS ;) ");}
		else{MCD.main(null);}
		
	}

}