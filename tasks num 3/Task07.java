import java.util.Scanner;

public class Task07{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();

		double disc = b*b - 4*a*c;

		double x1 = (-1*b + sqrt(disc))/(2*a);
		double x2 = (-1*b - sqrt(disc))/(2*a);
		System.out.println(a + "*x^2 + " + b + "*x + " + c);
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
	}



	public static double sqrt(double square){
		final double EPS = 0.00000000000001;
		double start = 0.0;
		double end = square;
		double center = square/2;
		while(end != start){
			center = (start + end)/2;
			if (square - center * center < -EPS){
				end = center;
			}else if (square - center * center > EPS){
				start = center;
			}else{
				return center;			
			}
		}
		return 0;
	}
}