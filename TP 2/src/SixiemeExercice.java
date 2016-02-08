
public class SixiemeExercice {

		public static int recherche(int val, int [] tab){
			int cout = 4;
			for (int i = 0; i < tab.length; i++){
				if(tab[i]==val){
					System.out.println("Coût : " + cout);
					return i;
				}
				cout = cout + 3;
			}
			System.out.println("Coût : " + cout);
			return -1;
		}
		
		public static void main(String[] args){
			int [] tab1 = {1,2,3,4,5};
			int [] tab2 = {9,8,7,6,5,4,3,2,1,0};
			System.out.println("Position : " + recherche(55, tab1));
			System.out.println("Position : " + recherche(5, tab1));
			System.out.println("Position : " + recherche(9, tab2));
			System.out.println("Position : " + recherche(5, tab2));
		}
}

/**
* Le nombre d'instructions est affiché avec le calcul
* 
* Ce nombre va dépendre de la position du chiffre recherché dans le tableau.
* Tableau trié : en log n
* Tableau non trié : en n
* Avec n : taille du tableau
*
**/
