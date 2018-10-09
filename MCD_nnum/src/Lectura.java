import java.util.Scanner;

public class Lectura {
	
	public int Lectura_Cantidad(){
		
		int n;
		
		do {
			Scanner cin=new Scanner(System.in);
			System.out.print("Ingrese la cantidad de numeros a evaluar: \n");
			n=cin.nextInt();
		}while(n<=0);
		
		return n;
			
	}
	
	public void Lectura_Numeros(int Cantidad_Num, int num[]){
			
		int i;
		Scanner cinnum= new Scanner(System.in);
		for(i=0; i<Cantidad_Num; i++) {
			do {
				System.out.println("Ingrese numero "+(i+1)+": ");
				num[i]=cinnum.nextInt();
			}while(num[i]<=0);
				
		}
	}
	
}
