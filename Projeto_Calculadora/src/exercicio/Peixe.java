package exercicio;

public class Peixe extends Animal{
	
	private String corEscama;

	public String getCorEscama(){
		return corEscama;
	}
	
	public void setcorEscama(String c){
		this.corEscama = c;
	}
	
	@Override
	public void locomover(){
		try{
			
			System.out.println("Peixe nadando.");
			
		}catch(Exception e){
			System.out.println("Algo peixe não esta nadando.");
		}
	}
	
	@Override
	public void alimentar(){
		try{
			
			System.out.println("Comendo substancias.");
			
		}catch(Exception e){
			System.out.println("Algo de errado com a alimentação.");
		}
	}
	
	@Override
	public void emitirsom(){
		try {
			
			System.out.println("Peixe não emite som.");
			
		}catch(Exception e){
			System.out.println("Algo deu errado, seu peixe fala!");
		}
	}
	
	public void soltarbolha(){
		try{
			
			System.out.println("Soltando bolhas.");
			
		}catch(Exception e){
			System.out.println("Seu peixe morreu.");
		}
	}

}
