package exercicio;

public class Mamifero extends Animal {
	
	private String Cordopelo;
	
	
	public String getCordopelo(){
		return this.Cordopelo;
	}
	
	public void setCordopelo(String c){
		this.Cordopelo = c;
	}
	
	@Override 
	public void locomover(){
		try{
			
			System.out.println("Correndo.");
			
		}catch(Exception e){
			System.out.println("Algo deu errado na locomoção.");
		}
	}
	
	@Override
	public void alimentar(){
		try{
			
			System.out.println("Mamando.");
			
		}catch(Exception e){
			System.out.println("Algo deu errado na alimentação.");
		}
	}
	
	@Override
	public void emitirsom(){
		try{
			
			System.out.println("Som de mamifero.");
			
		}catch(Exception e){
			System.out.println("Algo deu errado em emitir som.");
		}
		
	};

}
