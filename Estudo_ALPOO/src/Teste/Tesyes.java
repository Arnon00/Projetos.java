package Teste;
import model.Pessoa;
import dao.DaoPessoa;
public class Tesyes {


	public static void main(String[] args){
		
		Pessoa pessoa = new Pessoa();
		DaoPessoa dpessoa = new DaoPessoa();
		
		// --------------- inserir pessoa.
		/*
		  pessoa.setNome("José da Silva");        
		  pessoa.setRg("12345678X");        
		  pessoa.setIdade(20);        
		  pessoa.setEstado("SP");        
		  pessoa.setCidade("São Paulo");  
		  dpessoa.insere(pessoa);
		  
		  pessoa.setNome("Carlos Eduardo");        
		  pessoa.setRg("12346895X");        
		  pessoa.setIdade(12);        
		  pessoa.setEstado("BH");        
		  pessoa.setCidade("Salvador");  
		  dpessoa.insere(pessoa);
		  
		  pessoa.setNome("Alana LockHeart");        
		  pessoa.setRg("12264178X");        
		  pessoa.setIdade(32);        
		  pessoa.setEstado("PR");        
		  pessoa.setCidade("Invernal");  
		  dpessoa.insere(pessoa);
		*/
		
		// ----------------- Busca.
	  
		dpessoa.buscarTodos();
		
		
	}
}
