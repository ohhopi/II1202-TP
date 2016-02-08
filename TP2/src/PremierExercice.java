import java.util.Scanner;

public class PremierExercice {

	private static Scanner scan;

	public static void ruler(int length){
		for (int i = 0; i<length ;++i){
			System.out.print("-");
		}
		return;
	}

	public static void ruler(int length, int step){
		for(int i= 0; i < length; ++i){
			if((i % step) == 0){
					System.out.print("|");
					System.out.print("-");
				}else{
					System.out.print("-");
				}
			}
		if (length % step == 0){
			System.out.print("|");
		}
		return;
	}
	public static void main(String[] args){

		  scan = new Scanner(System.in);
		  System.out.print("Longueur de la regle ?");
		  int a = scan.nextInt();
		  System.out.print("Intervalle de graduation de la regle (0 si pas de graduation) ?");
		  int b = scan.nextInt();
		  if (b != 0){
			  ruler(a,b);
		  }else{
			  ruler(a);
		  }
		  return;		
	}
}