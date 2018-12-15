package exercicio;

public class Répil extends Animal{
	
	private String corescama;
	
	public String getcirescama(){
		return this.corescama;
	}

	public void setCordopelo(String c){
		this.corescama = c;
	}
	@Override
	public void locomover(){
		try {
			
			System.out.println("Rastejando.");
			
		}catch(Exception e){
			System.out.println("Algo deu errado em rastejar.");
		}
	}
	
	@Override 
	public void alimentar(){
		try {
			
			System.out.println("Comendo insetos");
			
		}catch(Exception e){
			System.out.println("Algo deu errado na alimentação do reptil");
		}
		
	}
	
	@Override
	public void emitirsom(){
		try{
			
			System.out.println("som de reptil");
			
		}catch(Exception e){
			System.out.println("Algo deu errado e o repitil não emite som.");
		}
		
	}

}
