
public class Main {
	
	public static void main(String[] args) {
		/** On fait pousser l'arbre en partant des racines et en montant vers les feuilles.
		 * Les setter de fils retournent le noeud courant, ce qui permet de chaîner les méthodes.
		 */
		System.out.println("** Arbre simple à 3 noeuds **");
		ArbreBinaire arbre = new ArbreBinaire("A");
		arbre.getRacine().setFilsGauche("B")
						 .setFilsDroit("C");
		
		System.out.println("Parcours préfixé de l'arbre :");
		arbre.parcoursPrefix();
		
		System.out.println("Parcours postfixé de l'arbre :");
		arbre.parcoursPostfix();
		
		System.out.println("Parcours en largeur de l'arbre :");
		arbre.parcoursLargeur();
		
		
		System.out.println("** Arbre plus complexe : figure 1 du sujet **");
		ArbreBinaire arbre2 = new ArbreBinaire("A");
		arbre2.getRacine().setFilsGauche("B", "D", "E")
						  .setFilsDroit("C")
						  .getFilsGauche().getFilsDroit().setFils("G", "H");
		arbre2.getRacine().getFilsDroit().setFilsGauche("F");
		
		System.out.println("Parcours préfixé de l'arbre :");
		arbre2.parcoursPrefix();
		
		System.out.println("Parcours postfixé de l'arbre :");
		arbre2.parcoursPostfix();
		
		System.out.println("Parcours en largeur de l'arbre :");
		arbre2.parcoursLargeur();
		
		
	}
}
