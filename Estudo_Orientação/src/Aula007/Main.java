package Aula007;

class Calculo {
	void soma (int num1, int num2){
		System.out.println(num1 + num2);
		 
		
	}
}

public class Main {
	//parametors 
	
	/* Declara��o de um parametro
	 * 
	 *  Os dois s�o fun�oes... porem 
	 *  
	 *  essa e um parametro: 
	 *   tipo nome (tipo parametro1; tipo parametro2){
	 *    corpo();
	 *   };
	 * 
	 *  um metodo pode receber parametros;
	 *  
	 *  essa e um argumento:
	 *   nome (argumento1, argumento2);
	 * 
	 */
 
	public static void main (String[] args){
		
		Calculo cal = new Calculo();
		cal.soma(5, 25);
		
	}
}
