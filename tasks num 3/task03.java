import java.util.Scanner;

public class Task03{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        final double EPS = 0.000001;
        double sq = sc.nextDouble();
        double del = 1;
        double ans = 0;
        
        while(sq - ans*ans > EPS && ans*ans - sq != 0){
            for(double i = 1/del; i <= 10/del; i+=1/del){
                if ((ans + i)*(ans+i) - sq > 0){
                    ans += i - (1/del);
                    break;
                }
            }
            del *= 10;
        }
        System.out.print("Ans: ");
        System.out.println(ans);
    }
}