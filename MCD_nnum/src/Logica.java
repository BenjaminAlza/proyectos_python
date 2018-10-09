
public class Logica {
	
	public int Calculo_mcd(int Cantidad_Num, int num[]) {
		
		int mcd=0;
		int r;
		int j;
		for(j=0; j<Cantidad_Num; j++) {
		
		if(j==0) {mcd=num[j];}
		do{
			r=mcd%num[j];
			mcd=num[j];
			num[j]=r;
			
		}while(r!=0);
		
		}
		
		return mcd;
	}

}
