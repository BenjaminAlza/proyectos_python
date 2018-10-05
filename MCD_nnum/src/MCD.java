import java.util.Scanner;

public class MCD
{
	public static void main(String[] ARGS)
	{
		int n;
		int num;
		int r;
		int mcd = 0;
		int varret;
		
		do {
			
		do {
		Scanner cin=new Scanner(System.in);
		System.out.print("Ingrese la cantidad de numeros a evaluar: \n");
		n=cin.nextInt();
		
		}while(n<=0);
		
		int i;
		for(i=0; i<n; i++) {
			do {
				Scanner cinnum= new Scanner(System.in);
				System.out.println("Ingrese numero "+(i+1)+": ");
				num=cinnum.nextInt();
			}while(num<=0);
		
		
		if(i==0) {mcd=num;}
		
		do{
			r=mcd%num;
			mcd=num;
			num=r;
			
			
		}while(r!=0);
		
		}
		
		System.out.println("El Maximo Comun Divisor es:  "+mcd);
		
		do {
		Scanner cinret=new Scanner(System.in);
		System.out.println("\n \n DESEA VOLVER: (SI:1 NO:0): ");
		varret=cinret.nextInt();
		}while(varret!=1 && varret!=0);
		
	}while(varret==1);
	
	if(varret==0) {System.out.println("GRACIAS Runway IS ;) ");}
		
	}
	
}