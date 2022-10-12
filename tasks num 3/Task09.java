import java.util.Scanner;

public class Task09{
    public static void main(String [] args){
        int ans = 0;
        int reversAns = 0;
        int pos = 1;
        for(int i = 0; i < args.length; i++){
            ans += Integer.parseInt(args[i]);
            ans *= 10;
            reversAns += Integer.parseInt(args[i]) * pos;
            pos *= 10;
        }
        ans/=10;
        System.out.print("Число: ");
        System.out.println(ans);
        System.out.print("Обратное число: ");
        System.out.println(reversAns);
    }
}