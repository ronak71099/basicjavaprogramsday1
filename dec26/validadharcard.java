package dec26;
import java.util.Scanner;
public class validadharcard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = s.nextLine();
        String regex = "((\\d{4}\\s\\d{4}\\s\\d{4})|(\\d{4}[-]\\d{4}[-]\\d{4})|\\d{12})";
        String ex = "((a-f){2})";
        String let = "aa";

      String regexuuid = "([0-9a-f]{8}[-][0-9a-f]{4}[-][0-9a-f]{4}[-][0-9a-f]{4}[-][0-9a-f]{12})";


        if(let.matches(ex))
            System.out.println("valid Adhaar number");
        else
            System.out.println("invalid Adhaar number");
    }
}
