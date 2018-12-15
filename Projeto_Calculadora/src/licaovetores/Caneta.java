package licaovetores;

public class Caneta {

		private String modelo ;
		private String cor;
		private int ponta; 	
		private boolean tampada;
		
		
	public String getModelo(){
		return this.modelo;
	}
	
	public void setModelo(String m){
		this.modelo = m;
	}
	
	public String getCor(){
		return this.cor;
	}
	
	public void setCor(String c){
		this.cor = c;
	}

	public int getPonta(){
		return this.ponta;
	
	}
	
	public void setPonta(int p){
		this.ponta = p;
	}
	
	public boolean getTampada(){
		return this.tampada;
	}
	
	public void setTampada(boolean t){
		this.tampada = t;
	}


 public void rabiscar(){
	try{
	
			if (this.tampada = true) {
			System.out.println("Destampe a caneta antes.");
				} else {
			System.out.println("Rabiscando.");
					   }
	
		}catch (Exception e) {
		System.out.println("Algo deu errado.");
						     }
	}
 
 public void tampar(){
	 try{
		 
		 if (this.tampada = true) {
			 System.out.println("A caneta ja esta tampada.");
		 	} else {
		 		this.setTampada(true);
			        System.out.println("tampada");
		 		   }
		 
		 
	 }catch(Exception e){
		 System.out.println("Algo deu errad.o");
		 
	 }
 }

}
