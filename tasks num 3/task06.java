import java.util.Scanner;

public class Task06{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double powForX = x;
		double fact = 1;
		final double EPS = 1e-9;
		double elem = x;
		int sign = 1;
		int counter = 1;
		double sum = 0;
		while ((powForX/fact) > EPS){
			sum += sign*powForX/fact;
			powForX = powForX * x * x;
			counter += 2;
			fact = fact * (counter-1) * counter;
			sign *= -1;
		}
		System.out.println(sum);
	}
}