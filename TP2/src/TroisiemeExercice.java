import java.util.Scanner;

public class TroisiemeExercice {
	
	private static Scanner scan;

	// Dans le cas de cet exercice il est plus judicieux d'utiliser des booléens que des int en sortie.
	
	public static boolean isPrime(int x){
		for (int i = 2 ; i < x ; ++i){
			if ((x % i) == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrime2(int x){
		if((x % 2)==0){ return false; }
		
		for(int i=3; i <= (int)Math.sqrt(x); i= i+2){
			if((x % i)==0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		scan = new Scanner(System.in);
		System.out.println("Teste si le nombre est premier : ");
		int a = scan.nextInt();
		System.out.println("Resultat : " + isPrime(a));
		System.out.println("Resultat : " + isPrime2(a));
	}
}
