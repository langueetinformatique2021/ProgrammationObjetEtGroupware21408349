package atelier05;

public class Carafe {
	private int  contenu_, capacite_;
	
	/** Création d'une carafe vide
	 * @param capacite capacité en litres de la carafe */

	public Carafe(int capacite) {
		this.capacite_ = capacite;
		Vider();
	}
	
	/** Remplir une carafe complétement*/
	
	public void Remplir() {
		this.contenu_ = capacite_;
	}
	
	/** Vider une carafe complétement*/
	
	public void Vider() {
		this.contenu_ = 0
	}
	
	/** Ascessuer en lecture
	 *@return contenu de la carafe en litre*/
	
	public void Contenu() {
		return this.contenu_;
	}
	
	/** Ascessuer en lecture
	 *@return capacite de la carafe en litre*/
	
	public void Capacité() {
		return  this.capactite_;
	}
	
	public void Transvaser() {}
		
}
