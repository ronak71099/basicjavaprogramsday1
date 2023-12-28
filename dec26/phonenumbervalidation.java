package dec26;
import java.util.Scanner;
public class phonenumbervalidation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter you phone number : ");
        Long phone = s.nextLong();
        String conversionlongtostring = String.valueOf(phone);
//        System.out.println(con);
        String regex1 = "[0-9]{10}||[+]?[0-9]{12}";
//        String indianregex ="[+91\\s].?[7-9][0-9]{9}";

//        String indianreges2 = ""
//        String regex2 = "[0-9]{12}";
        if(conversionlongtostring.matches(regex1)){
            System.out.println("you phone number syntax is valid ");
            System.out.println(conversionlongtostring.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3"));
        }
        else{
            System.out.println("the number you have dialed is invalid the length of the number must be in between 10 to 12 strict");
        }

        long phoneNum = 1234565789L;


    }
}