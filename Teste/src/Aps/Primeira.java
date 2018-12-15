package Aps;
// -------------------  Importações;
import java.util.Random;
//  -------------------  Classe;
public class Primeira {
// -------------------  Declaração, armazenar numeros;
	int num;

// -------------------  Get's & Set's;
	
	public void setNum(int n){
		this.num = n;
	}
	public int getNum(){
		return this.num;
	}

//  -------------------  instanciando criador aleatorio;
	Random rad = new Random();

//  -------------------  Metodo de criação;
	public int gerador(){
		
		setNum(rad.nextInt(1000));
		
		return this.getNum();
	}
	
	

}
