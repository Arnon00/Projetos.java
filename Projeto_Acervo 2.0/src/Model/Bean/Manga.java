package Model.Bean;

public class Manga {

	private int id;
	private String titulo;
	private String autor;
	private  int numero;
	private String ano;
	private int editora_id;
	private int qtd_pag;
	private float preco_unitario;
	
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
			
	public float getPreco_unitario() {
		return preco_unitario;
	}
	public void setPreco_unitario(float preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	
	
}
