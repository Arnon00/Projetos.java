package Model.Bean;

public class Editora {
	
	private String nome;
	private String sait;
	
	
	public Editora(String nom, String sat){
		
		this.nome = nom;
		this.sait = sat;
		
	}
	
	
	public void setNome (String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setSait (String sait){
		this.sait = sait;
	}
	public String getSait(){
		return this.sait;	
				}
	
	
}
