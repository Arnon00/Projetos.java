package Aulas;

public class Aula052 {
	
	public static void main (String[] args){
		
		//atividade : calcular a media aritimetica de um array... 
	
		int [] nums = new int [5];
		nums [0] = 9;
		nums [1] = 10;
		nums [2] = 5;
		nums [3] = 6;
		nums [4] = 7;
		
		int media = 0;
		 for (int i = 0 ; i <nums.length; i++) // Curiosidade: laços que contenham uma unica linha, podem não conter as chaves "{}"
			 media += nums[i];
		 
		              //sobrecarga: converte um valor para outro; detalhe, somente o valor, não a variavel! 
		 float total = (float)media / nums.length;
		 
		 System.out.println("A media é: "+total);
	}

}
