package licaovetores;

public class Principal {
	
	public static void main(String[] args){
		
		Caneta c1 = new Caneta();
	
		c1.setCor("Azul");
		c1.setModelo("BIC Astral");
		c1.setPonta(1);
		c1.setTampada(true);

		c1.tampar();
		c1.rabiscar();
		
	}

}
