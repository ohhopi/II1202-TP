import java.util.Arrays;
import java.util.Scanner;

public class main {
	
	public static boolean isPalindrome(String phrase){
		if((phrase.length() == 2 && (phrase.charAt(0) == phrase.charAt(1))) || phrase.length() == 1) {
			//Dans le cas élementaire on renvoie le booleen true si c'est vérifié
			return true;
		}
		if(phrase.charAt(0) != phrase.charAt(phrase.length() -1)){
			//Si le premier et le dernier element sont différents renvoyer false pour arrêter les vérifications
			return false;
		}	
		// Si l'on n'a pas renvoyé true ou false, continuer la recherche mais dans le mot sans son premier et dernier caractère (appel récursif)
		return isPalindrome(phrase.substring(1, phrase.length() -1));
	}
	
	static public void palindrome(Scanner scan) {
		String mot = scan.nextLine();
		mot = mot.replaceAll("\\s+","");
		boolean palin = isPalindrome(mot.toUpperCase());
		if (palin) {
			System.out.println("C'est un palindrome.");
		}else{
			System.out.println("Ce n'est pas un palindrome.");
		}
	}
	
	public static void erathostene(boolean [] crible) {
		Arrays.fill(crible, true);
		
		for(int i = 2; i < crible.length;i++) {
			if(crible[i]) {
				for(int j =2; (j * i) < crible.length; j++)
					crible[i*j] = false;	
			}
		}
	}
	
	public static void erathosteneR(boolean [] crible) {
		// Fonction d'initialisation du crible d'erathotene récursif
		Arrays.fill(crible,true);
		erathosteneRec(crible, 2);
	}

	public static void erathosteneRec(boolean[] crible, int i) {
		if(i >= crible.length)
			return;
		
		while(!crible[i] && i < crible.length/2)
			i++;
		
		elimininate(crible, i);
		erathosteneRec(crible, i+1);
	}

	private static void elimininate(boolean[] crible, int i) {
		for(int j =2; (j * i) < crible.length; j++)
			crible[i*j] = false;
		
	}
	
	public static  void premiers(int n) {
		boolean [] crible = new boolean[n+1];
		
		System.out.println("Les nombres premiers jusqu'à "+ n +" sont : ");
		erathosteneR(crible);
		
		for(int i = 2; i< crible.length ; i++)
			if(crible[i])
				System.out.println(i);
		
	}

	public static void main(String[] args) {
		System.out.print("Entrez une phrase : ");
		Scanner scan = new Scanner(System.in);
		
		palindrome(scan);
		
		premiers(20);
		
		
		
	}

}
