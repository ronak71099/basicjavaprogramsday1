package dec26;
import java.util.Scanner;
public class passwordchecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String regex2 ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        System.out.println("Enter the password : ");
        String password = s.nextLine();
        if(password.matches(regex2)){
            System.out.println("strong password");
        }
        else
            System.out.println("weak password");
    }
}
