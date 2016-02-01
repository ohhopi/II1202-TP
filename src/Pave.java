import java.util.Scanner;

public class Pave {
	public static void main(String [] args) {
		// Nouveau Scanner
		Scanner scan = new Scanner(System.in);
		//Déclaration des variables (et leur type)
		double a,b,c;
		//Série d'inputs des côtes du parralélipipède
		System.out.println("Hauteur du pave : ");
		a = forcePositiveDouble(scan);
		System.out.println("Largeur du pave : ");
		b = forcePositiveDouble(scan);
		System.out.println("Longueur du pave : ");
		c = forcePositiveDouble(scan);
		//Calcul du Volume
		double volume = a*b*c;
		//Afficher le volume
		System.out.println("Volume total : " + volume);
	}
	public static double forcePositiveDouble(Scanner scan) {
		double d = -1;
		while(d < 0) {
			System.out.print("Veuillez entrer une valeur positive s'il vous plait : ");
			d = scan.nextDouble();
		}
		return d;
	}
}