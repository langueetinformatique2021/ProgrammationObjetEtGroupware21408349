package atelier05;

public class testCarafe {
	/** point d'entrée d'un exécutable */
	public static void main(String[] args) { 
		Carafe c1 = new Carafe(5);
		Carafe c2 = new Carafe(7);
		
		System.out.println("capacité de la carafe 1 : " + c1.Capacité());
		System.out.println("capacité de la carafe 2 : " + c2.Capacité());
		
		System.out.println("ccontenu de la carafe 1 : " + c1.Contenu());
		System.out.println("capacité de la carafe 2 : " + c2.Contenu());
	}

}
