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
	
	public static int partition(int tab[], int gauche, int droite)
	{
	      int i = gauche, j = droite;
	      int tmp;
	      int pivot = tab[(gauche + droite) / 2];
	     
	      while (i <= j) {
	            while (tab[i] < pivot)
	                  i++;
	            while (tab[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = tab[i];
	                  tab[i] = tab[j];
	                  tab[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	 
	public static void quickSort(int tab[], int gauche, int droite) {
	      int index = partition(tab, gauche, droite);
	      if (gauche < index - 1)
	            quickSort(tab, gauche, index - 1);
	      if (index < droite)
	            quickSort(tab, index, droite);
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
	
	public static int dicho(int[] tab, int val, int gauche, int droite) {
	      if (gauche > droite) //Si le rayon de recherche est mal saisi
	            return -1;
	      int milieu = (gauche + droite) / 2; //Indice du mileu
	      if (tab[milieu] == val) // Quand on trouve la valeur
	            return milieu;
	      else if (tab[milieu] > val) // Quand on ne tombe pas sur la valeur, on lance une récursion de dicho sur la bonne moitiée
	            return dicho(tab, val, gauche, milieu - 1);
	      else
	            return dicho(tab, val, milieu + 1, droite);           
	}
/*
 * Au pire ln(tab.lenth = n) itérations.
 * Car la taille de la partie recherchée est divisée par deux à chaque itération et l'algorithme s'arrête quand il n'y a plus d'éléments soit :
 * 2/(2^itérations)>0 soit 
 * itérations <= ln(n) 
 * 
 * Donc on est en O(ln(n))
 */
	
	public static void main(String[] args){
//		int [] tab = saisie2D();
//		System.out.println(Arrays.deepToString(tab));
//		int [] tab = saisie1D();
		int [] tab2 = saisie1D();
//		quickSort(tab2, 0, tab2.length-1);
//		System.out.println(Arrays.toString(tab));
//		System.out.println("Moyenne : " + meanIntTab(tab2));
//		partitionTab(tab2);
		System.out.println(Arrays.toString(tab2));
		
//		System.out.println(search(tab, 3));
		
		System.out.println(dicho(tab2, 5, 0, tab2.length-1));
		System.out.println(dicho(tab2, 6, 0, tab2.length-1));
		System.out.println(dicho(tab2, 25, 0, tab2.length-1));
	}
}
	