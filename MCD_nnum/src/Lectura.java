import java.util.Scanner;

public class Lectura {

	public static int Lectura_Cantidad(){
		
		Scanner cin=new Scanner(System.in);
		int n;
		do {
			
			System.out.print("Ingrese la cantidad de numeros a evaluar: ");
			n=cin.nextInt();
		}while(n<=0);
		return n;		
	}
	
	public static int Lectura_Numeros(){
		
		Scanner cinnum= new Scanner(System.in);
		int num;
			do {
				System.out.println("Ingrese Numero: ");
				num=cinnum.nextInt();
			}while(num<=0);

		return num;
		

	}
	
	
	public static int Lectura_Retorno() {
		
		Scanner cinret=new Scanner(System.in);
		int auxret;
		
		do {
		System.out.println("DESEA VOLVER: (SI:1 NO:0): ");
		auxret=cinret.nextInt();
		}while(auxret!=1 && auxret!=0);
		
		return auxret;
	
	}
}
