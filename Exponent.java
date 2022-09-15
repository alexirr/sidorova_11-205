import java.util.Scanner;

public class Exponent{
    private static double exponent(double x){
        double pow = x;
        double n = 1;
        double exp = 1;
        double fac = 1;
        while(true){
            exp = exp + (x / fac);
            if(x / fac < 0.00001){
                break;
            }
            x *= pow;
            n += 1;
            fac*=n;
        }
        return exp;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println(exponent(x));
    }
}