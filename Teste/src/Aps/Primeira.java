package Aps;
// -------------------  Importa��es;
import java.util.Random;
//  -------------------  Classe;
public class Primeira {
// -------------------  Declara��o, armazenar numeros;
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

//  -------------------  Metodo de cria��o;
	public int gerador(){
		
		setNum(rad.nextInt(1000));
		
		return this.getNum();
	}
	
	

}
