package Aulas;

public class Aula056 {
	
	public static void main (String [] args){
		// aulas 56/57/
		
		// foreach(paracada) é uma estrutura de repção especializada;
		
		/*
		 * ( <variavel> : <array> )
		 * (  int item  :  lista )
		 * 
		 * 
		 * Exemplo 
		 * 
		 * int [] lista = new int [2];
		 * 
		 * lista [0] = 10;
		 * lista [1] = 20;
		 * lista [3] = 30;
		 * 
		 * for (int item : lista){
		 *      item
		 * }
		 * 
		 */
		
		
		int [] nums = new int [10];
		
		nums [0] =125;
		nums [1] =5487;
		nums [2] =45;
		nums [3] =457;
		nums [4] =887;
		nums [5] =1;
		nums [6] =4087;
		nums [7] =1287;
		nums [8] =5456;
		nums [9] =789841;
		
		int soma= 0;
		float media = 0;
		
		//imprime a media aritmetica 
		
		for (int item : nums){
			soma += item;
		}
		
		media = (float) soma / nums.length;
		
		System.out.println("A media aritimetica é: "+media);
		
		//imprime o menoe e o maior valor da lista
		
		int menor = 0;
		int maior = 0;
		
		for (int item : nums){
			if (item < menor || menor == 0)
//para descobrir o maior, pode-se negar a operação Ex: if (!(item < menor) || menor ==0)				
				menor = item;
			if (item > maior)
				maior = item;
		}
		System.out.println("\n\n O menor item no array é: "+menor);
		System.out.println("\n\n O maior item no array é: "+maior);
	}

}
