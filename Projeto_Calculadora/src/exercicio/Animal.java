package exercicio;

public abstract class Animal {

	protected double peso;
	protected int idade;
	protected int membros;
	

	public double getPeso(){
		return this.peso;
	}
	
	public void setPeso(double p){
		this.peso = p;
		
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public void setIdade (int s){
		this.idade = s;
	}
	
	public int getMembros(){
		return this.membros;
	}
	
	public void setMembros(int m){
		this.membros = m;
	}
	
	public abstract void locomover();
	
	public abstract void alimentar();
	
	public abstract void emitirsom();

}
