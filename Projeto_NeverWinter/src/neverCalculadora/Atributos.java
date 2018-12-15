package neverCalculadora;

public class Atributos {
	
    //  --------------------------------------------      Atributos 1ª parte.     ----------------------------
	
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel pw Força. Power.
	 */
	private double pw;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel crit Golpe Crítico. Critical Strike. 
	 */
	private double crit;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel penArm Penetração de Armadura. Armor Penetration.
	 */
	private double penArm;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel rec Recuperar. To recover.
	 */
	private double rec;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel ganDA Ganho de Pontos de Ação. Gain Action Points.
	 */
	private double ganDA;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel bVC Bônus de Vantagem de em combate. Bonus Combat bonus.
	 */
	private double bVC;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel bC Bônus de Controle. Control Bonus.
	 */
	private double bC;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel def Defesa. Defense.
	 */
	private double def;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel deflex Defletir. Deflect.
	 */
	private double deflex;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel rege Regeneração. Regeneration.
	 */
	private double rege;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel fV Furto de vida. Theft of life.
	 */
	private double fV;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel sFV Severidade no Furto de vida. - Life Steal Severity.
	 */
	private double sFV;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel tenPVP Tenacidade PVP. Tenacity PVP.
	 */
	private double TenPVP;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel gV Ganho de Vigor. Gain of Vigor.
	 */
	private double gV;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel cB Cura Bônus Recebida. Cure Bonus Received.
	 */
	private double cB;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel rADE Resistencia à AdE. Resistance to AdE.
	 */
	private double rAdE;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel resC Resistencia a Controle. Resistance to Control.
	 */
	private double resC;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel mov Movimento. Movement.
	 */
	private double mov;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel cInf Influência de Companheiro. Influence of Companion.
	 */
	private double cInf;
	/**
	 Atributos do personagem 1ª parte
	 
	 @Variavel gO Ganho de ouro. Gold Gain
	 */
	private double gO;
	
	// --------------------------------------------       Getr's and Set's       ------------------------
	
	//Power.
	public void setPw (double pw){
		this.pw = pw;
	}
	public double getPw(){
		return this.pw;
	}
	
	//Critical Strike. 
	public void setCrit(double crit){
		this.crit = crit;
	}
	public double getCrit(){
		return this.crit;
	}
	
	//Armor Penetration.
	public void setPenArm(double pen){
		this.penArm = pen;
	}
	public double getPenArm(){
		return this.penArm;
	}
	
	//To recover.
	public double getRec() {
		return this.rec;
	}
	public void setRec(double rec) {
		this.rec = rec;
	}
	
	//Gain Action Points.
	public double getGanDA() {
		return this.ganDA;
	}
	public void setGanDA(double ganDA) {
		this.ganDA = ganDA;
	}
	
	//Combat bonus.
	public double getbVC() {
		return this.bVC;
	}
	public void setbVC(double bVC) {
		this.bVC = bVC;
	}
	
	//Control Bonus.
	public double getbC() {
		return this.bC;
	}
	public void setbC(double bC) {
		this.bC = bC;
	}
	
	//Defense.
	public double getDef() {
		return this.def;
	}
	public void setDef(double def) {
		this.def = def;
	}
	
	//Deflect.
	public double getDeflex() {
		return this.deflex;
	}
	public void setDeflex(double deflex) {
		this.deflex = deflex;
	}
	
	//Regeneration.
	public double getRege() {
		return this.rege;
	}
	public void setRege(double rege) {
		this.rege = rege;
	}
	
	//Theft of life.
	public double getfV() {
		return this.fV;
	}
	public void setfV(double fV) {
		this.fV = fV;
	}
	
	//Gain of Vigor.
	public double getsFV() {
		return this.sFV;
	}
	public void setsFV(double sFV) {
		this.sFV = sFV;
	}
	
	//Tenacity PVP.
	public double getTenPVP() {
		return this.TenPVP;
	}
	public void setTenPVP(double tenPVP) {
		TenPVP = tenPVP;
	}
	
	//Cure Bonus Received.
	public void setGv(double gv){
		this.gV = gv;
	}
	public double getGv(){
		return this.gV;
	}
	//Cure Bonus Received.
	public double getcB() {
		return this.cB;
	}
	public void setcB(double cB) {
		this.cB = cB;
	}
	
	//Resistance to AdE.
	public double getrAdE() {
		return this.rAdE;
	}
	public void setrAdE(double rAdE) {
		this.rAdE = rAdE;
	}
	
	//Resistance to Control.
	public double getResC() {
		return this.resC;
	}
	public void setResC(double resC) {
		this.resC = resC;
	}
	
	//Movement.
	public double getMov() {
		return this.mov;
	}
	public void setMov(double mov) {
		this.mov = mov;
	}
	
	//Influence of Companion.
	public double getCInf() {
		return this.cInf;
	}
	public void setCInf(double cinf) {
		this.cInf = cinf;
	}
	
	//Gold Gain.
	public double getgO() {
		return this.gO;
	}
	public void setgO(double gO) {
		this.gO = gO;
	}

}
