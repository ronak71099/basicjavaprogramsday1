package dec26;
import java.util.Scanner;

class Validgivenstring{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = s.nextLine();
        if(str.isEmpty()) {
            System.out.print("String is empty");
            return;
        }
        String regs = "[a-zA-Z\\s]+";
        if(str.matches(regs))
            System.out.println("valid");
        else
            System.out.println("Invalid");
    }
}