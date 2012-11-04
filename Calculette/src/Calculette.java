
public class Calculette {
	private Double operande1 = 0.0;
	private Double operande2 = 0.0;
	private Double resultat = 0.0;
	private String operateur;

	public Double getResultat() {
		this.effectueOperation();
		return this.resultat;
	}

	public void effectueOperation() {
		if ("+".equals(this.operateur)) {
			this.resultat = this.effectueAddition();	
			return;
		}
		
		if ("-".equals(this.operateur)) {
			this.resultat = this.effectueSoustraction();
			return;
		} 
		
		this.resultat = this.operande2;
	}
	
	public Double effectueSoustraction() {
		return this.operande1 - this.operande2;	
	}
	
	public Double effectueAddition() {
		return this.operande1 + this.operande2;	
	}

	public Calculette click(int i) {
		this.operande2 = this.operande2 * 10 + i;
		return this;
	}

	public Calculette click(String operateur) {
		this.effectueOperation();
		this.operateur = operateur;
		this.operande1 = this.resultat;
		this.operande2 = 0.0;
		return this;
	}

}
