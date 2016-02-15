import java.util.Arrays;
import java.util.Scanner;

public class TP3 {
	private static Scanner scan;
	
	public static int [] saisie1D() {
			
		scan = new Scanner(System.in);
		System.out.println("Nombre d'elements ? ");
		int lignes = scan.nextInt();
		
		int [] tab = new int[lignes];
		
		for (int i = 0; i < lignes; i++){
				System.out.println( (i+1) + "e valeur ? ");
				tab[i] = scan.nextInt();
			}
		return tab;
		}

	public static int [][] saisie2D() {
		
		scan = new Scanner(System.in);
		System.out.println("Nombre de lignes ? ");
		int lignes = scan.nextInt();
		System.out.println("Nombre de colones ? ");
		int colones = scan.nextInt();
		
		int [][] tab = new int[lignes][colones];
		
		for (int i = 0; i < lignes; i++){
			for (int j = 0; j < colones; j++ ){
				System.out.println( "Valeur de ["+ i +","+ j +"] ? ");
				tab[i][j] = scan.nextInt();
				}
			}
		return tab;
		}
	
	
	public static int meanIntTab(int tab []){
		int moy = 0;
		for (int i = 0; i < tab.length; i++){
					moy += tab[i];
			}
		moy = moy/tab.length;
		for (int s =0; s < tab.length; s++){
			if (tab[s] == moy){
				System.out.println("Indice de la moyenne : " + s);
				return  moy;
			}
		}
		return  moy;
	}
	
	public static void partitionTab(int tab []){
		
		int debut = 0, fin = tab.length -1;
		int moyenne = meanIntTab(tab);
		
		while(debut < fin) {
			while(tab[debut] < moyenne) debut++;
			while(tab[fin] >= moyenne) fin--;
			
			if(tab[debut] >= moyenne) {
				int tmp = tab[debut];
				tab[debut] = tab[fin];
				tab[fin] = tmp;
			}
		}
		
	}
	
	public static void quicksort(int [] tab, int debut, int fin){
		if (debut < fin) {
			int index_pivot = partition(tab, debut, fin);
			quicksort(tab, debut, index_pivot-1);
			quicksort(tab, index_pivot+1, fin);
		}
	}
	
	public static int partition(int [] tab, int debut, int fin){
		int index_pivot = tab[debut];
		int d = debut+1;
		int f = fin;
		while (d < f){
			//Détermine la valeur à permuter
			while(d < f && tab[f] >= index_pivot) f--;
			while(d < f && tab[d] <= index_pivot) d++;
			
			//Effectue la permutation
			int temp = tab[d];
	        tab[d]= tab[f];
	        tab[f] = temp;
	        System.out.println(Arrays.toString(tab));
	        
		}
        //Renvoi du nouveau pivot pour l'appel récursif de quicksort
        if (tab[d] > index_pivot) d--;
        tab[debut] = tab[d];
        tab[d] = index_pivot;
        return d;
	}
	
	public static int search(int [] t, int v){
		for (int i = 0; i < t.length; i++){
			if (t[i] == v){
				return i;
			}
		}
		return -1;
	}
	/* Itérations : 
	 * 	- si v est au début ? 1 itération de la boucle for.
	 * 	- si v est à la fin ? autant d'itérations qu'il y a d'éléments dans le tableau.
	 *  - en moyenne ? si la taille du tableau est n, le nombre d'iterations en moyenne est n/2.
	 */

	
	public static void main(String[] args){
//		int [] tab = saisie2D();
//		System.out.println(Arrays.deepToString(tab));
		int [] tab = saisie1D();
		System.out.println(Arrays.toString(tab));
//		System.out.println("Moyenne : " + meanIntTab(tab));
//		partitionTab(tab);
//		System.out.println(Arrays.toString(tab));
		
//		quicksort(tab, 0, tab.length-1);
//		System.out.println(Arrays.toString(tab));
		
		System.out.println(search(tab, 3));
	}
}
