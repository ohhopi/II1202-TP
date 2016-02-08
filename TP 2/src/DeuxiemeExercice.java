import java.util.Scanner;

public class DeuxiemeExercice {
	
	private static Scanner scan;

	// Complexity in n
	public static long power (int a, int n){
		long result = 1;
		for (int i = 0; i != n ; ++i){
			result = result * a;
		}
		return result;
	}
	// Complexity in n
	public static long powerRecursive (int a, int n){
		if ( n == 0){return 1;}
		return powerRecursive(a, n-1) * a;
	}
	
	// Square-and-multiply, complexity in log n
	public static long powerExponentiation (int a, int n){
		long result = 1;
		while (n != 0){
			if( (n % 2) == 1){
				result= result * a;
			}
			n = (int)(n/2);
			a = a * a;
		}
		return result;
	}
	
	// We can always use Math.pow.
	
	
	public static void main(String[] args){
		scan = new Scanner(System.in);
		System.out.println("Calcul de x^y : ");
		System.out.print("Saisir x : ");
		int a = scan.nextInt();
		System.out.print("Saisir y : ");
		int b = scan.nextInt();
		System.out.println("Calcul classique : " + power(a,b));
		System.out.println("Calcul récursif : " + powerRecursive(a,b));
		System.out.println("Calcul par exponeniation rapide : " + powerExponentiation(a,b));
	}
}
