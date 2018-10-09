import java.util.Scanner;

public class Interaccion {
	
	public void ImprimirResultado(int Resultado_mcd) {
		
		System.out.println("El Maximo Comun Divisor es:  "+Resultado_mcd);
		
	}
	
	public int MenuRetorno() {
		
		int varret;
		Scanner cinret=new Scanner(System.in);
		do {
			System.out.println("\n \n DESEA VOLVER: (SI:1 NO:0): ");
			varret=cinret.nextInt();
		}while(varret!=1 && varret!=0);
		
		if(varret==0) {System.out.println("\n \n \n GRACIAS Runway IS ;) ");}
		
		return varret;
		
	}

}
