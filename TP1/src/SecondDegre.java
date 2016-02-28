import java.util.Scanner;

public class SecondDegre {
	private static Scanner scan;

	public static void main(String [] args) {
		scan = new Scanner(System.in);
		double a,b,c;
		System.out.println("Veuillez saisir la valeur de a (aX^2+bX+c) : ");
		a = scan.nextDouble();
		System.out.println("Veuillez saisir la valeur de b (aX^2+bX+c) : ");
		b = scan.nextDouble();
		System.out.println("Veuillez saisir la valeur de c (aX^2+bX+c) : ");
		c = scan.nextDouble();
		double [] solution = solveSecondDegre(a, b, c);
		if (solution != null){
			System.out.println("Soltion(s) : "+ solution[0] + " | " + solution[1]);
		}else{
			System.out.println("Pas de solution reele.");
		}
	}

	public static double [] solveSecondDegre(double a, double b, double c) {
		double discriminant = (b*b) - (4*a*c);
		double [] sortie;
		if( a != 0.0 && discriminant > 0) {
			// 2 Racines Simples
			sortie = new double[2];
			double racineB = Math.sqrt(discriminant);
			sortie[0] = (-b - racineB) / (2*a);
			sortie[1] = (-b + racineB) / (2*a);
		} else if( a !=0.0 && discriminant == 0.0) {
			// Racine Double
			sortie = new double[1];
			sortie[0] = -b / (2*a);
		}
		else {
			// 3e Cas (Racines complexes, non traite)
			sortie = null;
		}
		return sortie;
	}
}