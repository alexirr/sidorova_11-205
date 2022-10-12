import java.util.Scanner;

public class Task05{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int perv = -1;

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n + n-i; j++){
				System.out.print(" ");
			}
			for(int j = 0; j < perv+2; j++){
				System.out.print("*");
			}
			perv = perv+2;
			System.out.println();
		}

		perv = -1;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n - i - 1; j++){
				System.out.print(" ");
			}

			for(int j = 0; j < perv+2; j++){
				System.out.print("*");
			}

			for(int j = 0; j < n - i - 1; j++){
				System.out.print(" ");
			} 

			for(int j = 0; j < n; j++){
				System.out.print(" ");
			}

			for(int j = 0; j < n - i - 1; j++){
				System.out.print(" ");
			} 

			for(int j = 0; j < perv+2; j++){
				System.out.print("*");
			}
			perv = perv+2;
			System.out.println();
		}
	}
}