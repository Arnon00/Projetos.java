package neverCalculadora;

public class Influenciaveis extends Atributos {
	
	//  --------------------------------------------      Atributos 2� parte.     ----------------------------
	
	
	//  ------------------- Ofencivo e Cura 2�--------------------------
	
	/**
	 Atributos do personagem 2� parte 
	 
	 @metodo ccrit Chance Critica. 
	 
	 @return chacrit Retorno porcentagem da chance critica.
	 */
	public double ccrit(){
		
	double chacrit = 0;
	double cont = this.getCrit();	
	int porc = 0;
	
	for (int a = 1; cont >= 400; a++){
		
		if (cont >= 400){
		cont = cont - 400; 
						}else{ 
							 }
			
		porc =+ a;
			
	}
	
	chacrit = porc + 5 + 3;
	
	return chacrit;
	
}
	
	/**
	 		Atributos do personagem 2� parte 
	 
	 @metodo scrt Severidade de Critico. 
	 
	 @return  
	 */
			public double scrt(){
		
		return;
	}

	/**
	 Atributos do personagem 2� parte 
	 
	 @metodo rign Resisten�ncia Ignorada. 
	 
	 @return
	 */
	public double rign(){
		return;
	}

	/**
	 Atributos do personagem 2� parte 
	 
	 @metodo arv Aumento de Recarga de Velocidade.  
	 
	 @return
	 */
	public double arv(){
		return;
	}
	
	/**
	 Atributos do personagem 2� parte 
	 
	 @metodo gapc Ganho de Pontos de A��o.  
	 
	 @return
	 */
	public double gapc(){
		return;
	}

	//  ------------------- Defensivo 3�--------------------------

	
	/**
	 Atributos do personagem 3� parte 
	 
	 @metodo rad Resist�ncia a dano. 
	 
	 @return
	 */
	public double rad(){
		return;
	}
	
	/**
	 Atributos do personagem 3� parte 
	 
	 @metodo cdd Chance de Deflex�o.
	 
	 @return
	 */
	public double cdd(){
		return;
	}
	
	/**
	 		Atributos do personagem 3� parte 
	 
	 @metodo sdd Severidade da Deflex�o.
	 
	 @return
	 */
			public double sdd(){
	 return;
 }

	/**
	 Atributos do personagem 3� parte 
	 
	 @metodo rpv Regenera��o de Pontos de Vida 
	 
	 @return
	 */
	public double rpv(){
		return;
	}

	/**
	 Atributos do personagem 3� parte 
	 
	 @metodo bich Bonus Incoming Healing. 
	 
	 @return
	 */
	public double bich(){
		return;
	}

	/**
	 Atributos do personagem 3� parte 
	 
	 @metodo dgp Dano Ganho como pontos de Vida.
	 
	 @return
	 */
	public double dgp(){
		return;
	}
	
	/**
	 		Atributos do personagem 3� parte 
	 
	 @metodo lfs Life Steal severity.
	 
	 @return
	 */
			public double lfs(){
		return;
	}
	
	/**
	 Atributos do personagem 3� parte 
	 
	 @metodo rdv Regenera��o de Vigor. 
	 
	 @return
	 */
	public double rdv(){
		return;
	}
	
	/**
	 Atributos do personagem 3� parte 
	 
	 @metodo evf Everfrost Damage Resistance. 
	 
	 @return
	 */
	public double evf(){
		return;
	}
	
	
	//  ------------------- PVP 4�--------------------------
	
	/**
	 Atributos do personagem 4� parte 
	 
	 @metodo pvprad Resist�nci a dano (PVP). 
	 
	 @return
	 */
	public double pvprad(){
		return;
	}
	
	/**
	 Atributos do personagem 4� parte 
	 
	 @metodo pvprac Resist�cia a Acerto Cr�tico (PVP). 
	 
	 @return
	 */
	public double pvprac(){
		return;
	}
	
	/**
	 Atributos do personagem 4� parte 
	 
	 @metodo  pvprc Resist�ncia a Controle (PVP). 
	 
	 @return
	 */
	public double pvprc(){
		return;
	}
	
	//  ------------------- Ultilidade 5�--------------------------
	
	/**
	 Atributos do personagem 5� parte 
	 
	 @metodo bxp B�nus de XP. 
	 
	 @return
	 */
	public double bxp(){
		return;
	}
	
	/**
	 Atributos do personagem 5� parte 
	 
	 @metodo bo B�nus Ouro. 
	 
	 @return
	 */
	public double bo(){
		return;
	}
	
	/**
	 Atributos do personagem 5� parte 
	 
	 @metodo bgl B�nus Gl�ria. 
	 
	 @return
	 */
	public double bgl(){
		return;
	}
	
	/**
	 Atributos do personagem 5� parte 
	 
	 @metodo bvc B�nus de Velocidade de Corrida. 
	 
	 @return
	 */
	public double bvc(){
		return;
	}
}
