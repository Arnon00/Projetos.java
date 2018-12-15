package Aulas;

import java.util.Scanner;

public class Aula023 {
	
	public static void main (String [] args){
		//operadores associativos 
		
		int x,
		    a,
		    y, 
		    z;
        
		x = y = z = 0;// para atribuição o java trabalha da direita para a esquerda
                     //adiciona o 0 ao z, depois ao y, e po ultimo chega ao x
        a = x + y + z; // O java resolvera isso somando primeiro o a+y depois o resultado 
                      // com o z e so ai, jogaria garia a valor resultante na variavel a
        
		/*ordem de associatividade
		 * 
		 * Da direita para a esquerda 
		 * 
		 * 1) () (Parenteses)
		 * 2) * (Multiplicação), / (Divisão), % (Modulo)
		 * 3) + (Mais), - (Menos)
		 * 4) < (Menor), <= (Menor ou igual), > (Maior), >= (Mior ou igual) 
		 * 5) == (Igual), != (Diferente)
		 */
        
        /*Da esquerda para a direita 
         * 
         * 1) = (Atribuição)
         * 
         */
	}

}
