package modelo;

public abstract class Algoritmos {
	/**
	 * Devuelve el sumatorio del numero especificado
	 * 
	 * @param numero	el numero del que queremos calcular el sumatorio
	 * @return			el sumatorio del numero especificado
	 */
	
	public static int sumatorio (int numero) {
		int resu=0;
		
		for (int i=numero; i>0 ;i--) {
			resu+=i;
			
		}
		return resu;
	}
	
	public static int factorial (int num) {
		int resu=1;
		
		for(int i=1; i<=num; i++) {
			resu*=i;
			
		}
		return resu;
	}
}
