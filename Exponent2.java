import java.util.Scanner;
public class Exponent2{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    double x = sc.nextDouble();
    double fix = x;
    double n = 1;
    double fuc = 1;
    double exp = 1;
    while( x/fuc > 0.00001){
    	exp = exp + x/fuc;
    	n += 1;
    	x = fix * x;
    	fuc = n * fuc;
    }
		System.out.println(exp);

    }
}