package dec26;
import java.util.Scanner;
public class valideipaddress {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String validaterange = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String regex = validaterange+"\\."+validaterange+"\\."+validaterange+"\\."+validaterange;
        System.out.println("Enter the string : ");
        String ip = s.nextLine();
        if(ip.matches(regex))
            System.out.println("Valid IPv4");
        else
            System.out.println("Invalid IPv4");
    }
}
