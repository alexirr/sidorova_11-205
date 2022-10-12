import java.util.Scanner;

public class Task10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String [] array = new String [len];
		for(int i = 0; i < len; i++){
			array[i] = sc.next();
		}
		String str = sc.next();
		for (int i = 0; i < len; i ++){
			if(array[i].lastIndexOf(str) != -1){
				System.out.println(i);
			}
		}
	}
}