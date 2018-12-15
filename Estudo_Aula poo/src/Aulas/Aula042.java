package Aulas;

import java.util.*;

public class Aula042 {
	Scanner in = new Scanner (System.in);
	
	public static void main (String [] arg){
		//aula 44/45/46/47/48/49

		// array = arranjo
		//array de arrays
		
		     int [] array; //declaração 
		      array = new int [10]; // cria e reserva o espaço para o array
					System.out.printf("%s%10s\n", " _______", " ________ ");
					System.out.printf("%s%10s\n", "|indice", "|valores|");
					System.out.printf("%s%10s\n", "|------", " |-------|");
					
				for (int i = 0 ; i <= 9 ; i++){
					System.out.printf("|%5d%3s%7d|\n", i, " |",array[i]);
					}
					System.out.printf("%s%10s\n", "|------", " |-------|");
				
					//atribundo valores na criação
   System.out.println("\n ------------------------------- \n Aula 46 \n");
					
					int [] meuarry = {78, 20, 56, 89, 1};
					System.out.printf("%s%8s\n", "indice", "valores");
					
					for (int i = 0; i < meuarry.length; i++){
						System.out.printf("%5d%8d\n", i, meuarry[i]);
					}
						
	System.out.println("\n ------------------------------- \n Aula 47 \n");
					
					//Caracteristicas aray 
					/*
					 * 1) dimenção
					 * 2) indice < sempre começa do zero, são as casas do array
					 * 3) elementos 
					 * 4) tipo
					 * 
					 * Ex
					 * tipo  indice  nome   estanciação   tipo    elementos
					 * int   []      lista    =   new     int     [5]
					 *  <---Declaração---> 
					 * 
					 * lista [0] = 45;
					 * lista [1] = 10;
					 * lista [2] = 1;
					 * lista [3] = 1000;
					 * lista [4] = 45;
					 */
					
					int [] a = new int [10];
					a[0] = 0;
					a[1] = 111;
					a[2] = 222;
					a[3] = 333;
					a[4] = 444;
					a[5] = 555;
					
					for (int i = 0; i< a.length ; i++ )						
	  				   System.out.println(a[5]);
				
					
	System.out.println("\n ------------------------------- \n Aula 48 \n");
	
	    /*int [] arrynovo = new int [10];
	     arrynovo [0] = 10;
	     arrynovo [1] = 20;
	     arrynovo [2] = 30;
					
	     int soma = arrynovo [0] + arrynovo [1] + arrynovo [2];
	     System.out.println(soma);
		     */
			int [] arrynovo = new int [10];
			
		      arrynovo [0] = 10;
		      arrynovo [1] = 20;
		      arrynovo [2] = 30;
		      arrynovo [3] = 12;
		      arrynovo [4] = 89;
		      arrynovo [5] = 55;
		      arrynovo [6] = 10;
		      arrynovo [7] = 1;
		      arrynovo [8] = 9;
		      arrynovo [9] = 78;
		      
		      int soma = 0;
		      
		    for (int i = 0 ; i < arrynovo.length; i++){
		    	soma += arrynovo[i];
		    }
		      System.out.println("A soma dos valores do array são: "+ soma);
		    	
	
					
				}

			}