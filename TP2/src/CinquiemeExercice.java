import java.util.Scanner;
import java.util.Arrays;

public class CinquiemeExercice {
	private static Scanner scan;
	
	public static int [] calculerTable(int nb, int max){
		int result [] = new int[max +1];
		for (int i = 0; i <= max ; i++ ){
			result[i] = nb*i;
		}
		return result;

	}
	public static void main(String[] args){
		scan = new Scanner(System.in);
		System.out.println("Afficher la table de multiplication de : ");
		int a = scan.nextInt();
		System.out.println("jusqu'a quel multiple ? ");
		int b = scan.nextInt();
		System.out.println(Arrays.toString(calculerTable(a,b)));
	}
}
