package Aulas;

public class Aula053 {
	
	public static void main (String [] args){
		//Arrays multimencionais
		//aula 53/54/55
		/* 
		 * 
		 * <tipo> [] [] <nome> = new <tipo> [lina] [coluna]
		 * 
		 * int [] [] matriz = new int [2] [2]
		 * 
		 * int [] vetor = new int [5]; 
		 *
		 * int [] [] matriz = new int [5] [5];
		 *
		 * //para atribuir valor, deve-se colocar a linha, e a coluna
		 *
		 * matriz [0] [0] = 25;
		 * matriz [3] [2] = 2;
	     

	
		int [] [] mat = new int [2] [9];
		
		
		  mat [0] [0] = 1000;
		  mat [1] [0] = 5;
				
				System.out.println(mat [0] [0]);
				System.out.println(mat [1] [0]);
				
				System.out.println(mat [0].length);
				
				// forma interesante de pensar... uma matriz e um array de arrays;
		
		mat [0] [0] = 1;
		mat [0] [1] = 2;
		mat [0] [2] = 3;
		mat [0] [3] = 4;
		mat [0] [4] = 5;
		mat [0] [5] = 6;
		mat [0] [6] = 7;
		mat [0] [7] = 8;
		mat [0] [8] = 9;
		
				for (int a = 0 ; a < mat [0].length ; a++){
					System.out.println(mat [0] [a]);
					}
		  */	
		
		// Atribuindo valores ja na declaração 
		
		int [] [] nums = {{1,2,3},  // Aqui o primeiro numero de cada linha se refere a coluna.
				          {4,5,6},
				          {7,8,9}}; // pode ser igualmente declarado assim:
		                            // int [] [] nums = new nums [2] [2];
		                            // uma matriz de 3x3

		/*for (int b = 0 ; b < 3 ; b++){
			System.out.println(nums[0] [b]);
		}*/
		
		// para inprimir todos os valores e preciso 2 laços...
		
		for (int c = 0 ; c < 3 ; c++){
			for (int d = 0 ; d < 3 ; d++)
				
				System.out.print(nums [c] [d]+" ");
				System.out.println();

	}
		
	//Observe que...
		/*
		 *  x = 0; 
		 *     y = 0; (0,0)
		 *     y = 1; (0,1)
		 *     y = 2; (0,2)
		 *  x = 1;
		 *     y = 0; (1,0)
		 *     y = 1; (1,1)
		 *     y = 2; (1,2)
		 *  x = 2;
		 *     y = 0; (2,0)
		 *     y = 1; (2,1)
		 *     y = 2; (2,2) 
		 */
		
		
 }	
}
