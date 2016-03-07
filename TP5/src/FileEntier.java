import java.util.LinkedList;
import java.util.Queue;

public class FileEntier {
	
	/*
	 * @author : Tristan Muratore
	 * Classe qui regroupe toutes les fonctions pour la partie III du TP5 du cours [II.1202] à l'ISEP.
	 * Elle simplifie en réalité les "Queue" pour ne proposer que les fonctions demandées par le sujet (take et add).
	 */
	 
	//Initialisation d'un Queue (liste) qui ne prends que des entiers
	static Queue<Integer> file = new LinkedList<Integer>();
	private static FileEntier instanceFile = null;
	
	//Permet la création d'une instance de FileEntier
	public static FileEntier getInstance() {
		//Si l'instance n'existe pas, l'initialiser.
		if (instanceFile == null) {
			instanceFile = new FileEntier();
		}
		return instanceFile;
	}
	
	//Fonctio get() classique pour afficher la file
	public Queue<Integer> get() {
		return file;
	}
	
	//Fonction add() reprise sur les Queue qui rajoute un élement à la fin
	public void add(int n) {
		file.offer(n);
	}
	
	//Fonction take() reprise sur les Queue qui prends un élément du début
	public int take() {
		int data = file.poll();
		return data;
	}

	public static void main(String args[]) {
		FileEntier file = FileEntier.getInstance();
	
		file.add(45);
		file.add(20);
		file.add(2);
		file.add(42);
		System.out.println("File Initiale: " + file.get());
	
		System.out.println("Le take() prends : " + file.take());
		System.out.println("Après le Take: " + file.get());
	}
}
