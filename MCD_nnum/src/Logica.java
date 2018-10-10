
public class Logica{
	
	public static int Calculo_mcd(int Cantidad_Aux2) {
		
		int numprov;
		int mcd=0;
		int r;
		int j;  
		for(j=0; j<Cantidad_Aux2; j++) {
			
		   numprov=Lectura.Lectura_Numeros();
		   if(j==0) {mcd=numprov;}
		   do{
		   	  r=mcd%numprov;
			  mcd=numprov;
			  numprov=r;
			
		   }while(r!=0);
		 
		}
		
		return mcd;
	}
}
