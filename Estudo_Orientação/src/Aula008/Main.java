package Aula008;

class Retangulo{
	
	public int width, height;
	
	public int areaTotal(){
		return width*height;
	}
	public boolean isQuadrado(){
		if (width == height)
			return true;
		  return false;
	}
}


public class Main {
	
	//retornando valor por funçoes;
	/*
	 * 
	 * Ex:
	 * 
	 *  tipoRetorno nome(){
	 *  
	 *  codigo
	 * 
	 *  return valor;
	 * };
	 * 
	 * O tipo tem que ser o mesmo no valor de entrada e saida
	 *  
	 * 
	 */
	public static void main (String[] args){

		Retangulo quad = new Retangulo();
		  quad.width = 100;
		  quad.height = 120;
		  
		  System.out.println(quad.areaTotal());
		  System.out.println(quad.isQuadrado());
		  
		  Retangulo quad2 = new Retangulo();
		  quad2.width = 100;
		  quad2.height = 100;
		  
		  System.out.println(quad2.areaTotal());
		  System.out.println(quad2.isQuadrado());
	}

}
