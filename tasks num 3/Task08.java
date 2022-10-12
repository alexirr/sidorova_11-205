import java.util.Scanner;

public class Task08{
	public static void main(String[] args) {
		int elem = 1;
		int sign = 1;
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int [] arr = new int[len];
		for(int i = 0; i < len; i++){
			arr[i] = sign*elem;
			elem += 2;
			sign*=-1;
		}
		for(int i = 0; i < len; i ++){
			System.out.println(arr[i]);
		}
	}
}