package Model.Bean;

public class Capitulo_manga {

	private int id;
	private String titulo;
	private String serie;
	private String autor;
	private int numero;
	private String ano;
	private int editora_id;
	private int qtd_pag;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public int getEditora_id() {
		return editora_id;
	}
	public void setEditora_id(int editora_id) {
		this.editora_id = editora_id;
	}
	
	public int getQtd_pag() {
		return qtd_pag;
	}
	public void setQtd_pag(int qtd_pag) {
		this.qtd_pag = qtd_pag;
	}
	
	
	
}
