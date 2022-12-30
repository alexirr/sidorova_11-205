import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularData {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("([1,2,0][1,2,3,4,5,6,7,8,9]|3[0,1]).(0[1,2,3,4,5,6,7,8,9]|1[0,1,2]).[1,2,3,4,5,6,7,8,9][1,2,3,4,5,6,7,8,9,0][1,2,3,4,5,6,7,8,9,0][1,2,3,4,5,6,7,8,9,0]");
        Matcher matcher = pattern.matcher("12.02.2020");
        System.out.println(matcher.matches());
    }
}