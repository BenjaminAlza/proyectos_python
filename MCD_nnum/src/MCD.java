
public class MCD
{
	public static void main(String[] ARGS)
	{
		int num[]= new int[50];
		int Cantidad_Num;
		int Resultado_mcd;
		int Variable_Ret;
		
		do {
			
		Lectura myclase1= new Lectura();
		Cantidad_Num=myclase1.Lectura_Cantidad();
		myclase1.Lectura_Numeros(Cantidad_Num, num);
		
		Logica myclase2= new Logica();
		Resultado_mcd=myclase2.Calculo_mcd(Cantidad_Num, num);
		
		Interaccion myclase3= new Interaccion();
		myclase3.ImprimirResultado(Resultado_mcd);
		Variable_Ret=myclase3.MenuRetorno();
		
		
	}while(Variable_Ret==1);
	
	}
	
}