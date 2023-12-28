package dec26;
import java.util.Scanner;
public class creditvardvalidation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string to check it's valid or not : ");
        String num = s.nextLine();
        String regex = "^4[0-9]{12}(?:[0-9]{3})?$";
        String regex2 = "(\\d{4}[-]\\d{4}[-]\\d{4}[-]\\d{4})";
        String regex3 =  "(\\d{4}\\s\\d{4}\\s\\d{4}\\s\\d{4})";
        if(num.matches(regex3)||num.matches(regex2)||num.matches(regex))
            System.out.println("valid syntax");
        else
            System.out.println("nvalid , the number must start with 4 and the length of the number must be 13 or 16");
    }
}
