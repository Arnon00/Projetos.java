package Model.Bean;

public class Capitulo_livro {

	private int id;
	private String titulo;
	private int pagina;
	private int livro_id;
	
	
	public Capitulo_livro(){
		
	}
	
	
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
	
	public int getPagina() {
		return pagina;
	}
	public void setPagina(int pagina) {
		this.pagina = pagina;
	}
	
	public int getLivro_id() {
		return livro_id;
	}
	public void setLivro_id(int livro_id) {
		this.livro_id = livro_id;
	}
	
}
