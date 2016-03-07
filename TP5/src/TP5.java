import java.util.Arrays;
import java.util.Scanner;

public class TP5 {
	
	/*
	 * @author : Tristan Muratore
	 * Classe qui regroupe toutes les fonctions pour les parties I et II du TP5 du cours [II.1202] à l'ISEP
	 * On a donc des fonctions pour : 
	 * 	- Tester si une chaîne est un palindrome et renvoyer en console la réponse : palindrome(String mot)
	 *  - Lister les n nombres premiers avec le crible d'Erathostene (récursif ou non) : premiers(int n)
	 */
	
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
		// On Prends la saisie de l'utilisateur
		String mot = scan.nextLine();
		// On enlève tous les espaces vides
		mot = mot.replaceAll("\\s+","");
		//On passe tous les caractères à des majuscules pour pouvoir comparer avec les opérateurs classiques
		mot = mot.toUpperCase();
		//On teste s'il est un palindrome en passant la chain
		boolean palin = isPalindrome(mot);
		//La sortie s'affiche en fonction de la nature de la chaîne testée
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
		erathosteneR_(crible, 2);
	}

	private static void erathosteneR_(boolean[] crible, int i) {
		if(i >= crible.length)
			return;
		
		while(!crible[i] && i < crible.length/2)
			i++;
		
		eliminer(crible, i);
		erathosteneR_(crible, i+1);
	}

	private static void eliminer(boolean[] crible, int i) {
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
