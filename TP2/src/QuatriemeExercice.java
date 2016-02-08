import java.util.Scanner;

public class QuatriemeExercice {
	
	private static Scanner scan;
	
	public static void alignForTable(int a){
		System.out.print(a);
		if ( a < 10){
			System.out.print(' ');
		}
	}
	
	public static void mulGrid (int n){
		for (int i = 0 ; i <= n; ++i){
			for (int y = 0 ; y <= n; ++y){
				alignForTable(i * y);
				System.out.print(' ');
			}
			System.out.println("");
		}
	}
	public static void main(String[] args){
		scan = new Scanner(System.in);
		System.out.println("Afficher la table de multiplication jusqu'a quel multiple : ");
		int a = scan.nextInt();
		mulGrid(a);
	}
}
