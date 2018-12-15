package model;

public class Pessoa {
	
	private String rg; 
	private String nome;
	private int idade;
	private String estado;
	private String cidade;
	
	
	public void setRg(String rg){
		this.rg = rg;
	}
	public String getRg(){
		return this.rg;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setIdade(int idad){
		this.idade = idad;
	}
	public int getIdade(){
		return this.idade;
	}
	
	public void setEstado(String est){
		this.estado = est;
	}
	public String getEstado(){
		return this.estado;
	}
	
	public void setCidade(String cid){
		this.cidade = cid;
	}
	public String getCidade(){
		return this.cidade;
	}
}