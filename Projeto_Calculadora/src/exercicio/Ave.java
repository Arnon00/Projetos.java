package exercicio;

public class Ave extends Animal {
	
	private String corpenas;

	public String getCorpenas(){
		return this.corpenas;
	}
	
	public void setCorpenas(String p){
		this.corpenas = p;
	}
	
	@Override 
	public void locomover(){
		try{
			
			System.out.println("voando");
			
		}catch(Exception e){
			System.out.println("algo deu errado no voou");
		}
	}
	@Override
	public void alimentar(){
		try{
			
			System.out.println("comendo incetos.");
			
		}catch(Exception e){
			System.out.println("Algo deu errado na alimenta��o.");
		}
	}
	@Override
	public void emitirsom(){
		try{
			
			System.out.println("Cantando");
			
		}catch(Exception e){
			System.out.println("Ave n�o esta cantando");
			
		}
	}
	
	public void fazerninho(){
		try{
			
			System.out.println("fazendo ninho.");
			
		}catch(Exception e){
			System.out.println("N�o n�o feito por erro.");
		}
	}
}
