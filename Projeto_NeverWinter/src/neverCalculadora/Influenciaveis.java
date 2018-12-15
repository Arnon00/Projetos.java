package neverCalculadora;

public class Influenciaveis extends Atributos {
	
	//  --------------------------------------------      Atributos 2ª parte.     ----------------------------
	
	
	//  ------------------- Ofencivo e Cura 2ª--------------------------
	
	/**
	 Atributos do personagem 2ª parte 
	 
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
	 		Atributos do personagem 2ª parte 
	 
	 @metodo scrt Severidade de Critico. 
	 
	 @return  
	 */
			public double scrt(){
		
		return;
	}

	/**
	 Atributos do personagem 2ª parte 
	 
	 @metodo rign Resistenência Ignorada. 
	 
	 @return
	 */
	public double rign(){
		return;
	}

	/**
	 Atributos do personagem 2ª parte 
	 
	 @metodo arv Aumento de Recarga de Velocidade.  
	 
	 @return
	 */
	public double arv(){
		return;
	}
	
	/**
	 Atributos do personagem 2ª parte 
	 
	 @metodo gapc Ganho de Pontos de Ação.  
	 
	 @return
	 */
	public double gapc(){
		return;
	}

	//  ------------------- Defensivo 3ª--------------------------

	
	/**
	 Atributos do personagem 3ª parte 
	 
	 @metodo rad Resistência a dano. 
	 
	 @return
	 */
	public double rad(){
		return;
	}
	
	/**
	 Atributos do personagem 3ª parte 
	 
	 @metodo cdd Chance de Deflexão.
	 
	 @return
	 */
	public double cdd(){
		return;
	}
	
	/**
	 		Atributos do personagem 3ª parte 
	 
	 @metodo sdd Severidade da Deflexão.
	 
	 @return
	 */
			public double sdd(){
	 return;
 }

	/**
	 Atributos do personagem 3ª parte 
	 
	 @metodo rpv Regeneração de Pontos de Vida 
	 
	 @return
	 */
	public double rpv(){
		return;
	}

	/**
	 Atributos do personagem 3ª parte 
	 
	 @metodo bich Bonus Incoming Healing. 
	 
	 @return
	 */
	public double bich(){
		return;
	}

	/**
	 Atributos do personagem 3ª parte 
	 
	 @metodo dgp Dano Ganho como pontos de Vida.
	 
	 @return
	 */
	public double dgp(){
		return;
	}
	
	/**
	 		Atributos do personagem 3ª parte 
	 
	 @metodo lfs Life Steal severity.
	 
	 @return
	 */
			public double lfs(){
		return;
	}
	
	/**
	 Atributos do personagem 3ª parte 
	 
	 @metodo rdv Regeneração de Vigor. 
	 
	 @return
	 */
	public double rdv(){
		return;
	}
	
	/**
	 Atributos do personagem 3ª parte 
	 
	 @metodo evf Everfrost Damage Resistance. 
	 
	 @return
	 */
	public double evf(){
		return;
	}
	
	
	//  ------------------- PVP 4ª--------------------------
	
	/**
	 Atributos do personagem 4ª parte 
	 
	 @metodo pvprad Resistênci a dano (PVP). 
	 
	 @return
	 */
	public double pvprad(){
		return;
	}
	
	/**
	 Atributos do personagem 4ª parte 
	 
	 @metodo pvprac Resistêcia a Acerto Crítico (PVP). 
	 
	 @return
	 */
	public double pvprac(){
		return;
	}
	
	/**
	 Atributos do personagem 4ª parte 
	 
	 @metodo  pvprc Resistência a Controle (PVP). 
	 
	 @return
	 */
	public double pvprc(){
		return;
	}
	
	//  ------------------- Ultilidade 5ª--------------------------
	
	/**
	 Atributos do personagem 5ª parte 
	 
	 @metodo bxp Bônus de XP. 
	 
	 @return
	 */
	public double bxp(){
		return;
	}
	
	/**
	 Atributos do personagem 5ª parte 
	 
	 @metodo bo Bônus Ouro. 
	 
	 @return
	 */
	public double bo(){
		return;
	}
	
	/**
	 Atributos do personagem 5ª parte 
	 
	 @metodo bgl Bônus Glória. 
	 
	 @return
	 */
	public double bgl(){
		return;
	}
	
	/**
	 Atributos do personagem 5ª parte 
	 
	 @metodo bvc Bônus de Velocidade de Corrida. 
	 
	 @return
	 */
	public double bvc(){
		return;
	}
}
