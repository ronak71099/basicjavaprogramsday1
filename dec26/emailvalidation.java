package dec26;

import java.util.Scanner;

public class emailvalidation {
    public static void main(String[] args) {


    Scanner s = new Scanner(System.in);
        System.out.println("Enter any string");
    String str = s.nextLine();
        if(str.isEmpty()) {
        System.out.print("String is empty");
        return;
    }
    String regs ="[\\w_\\-\\.]+[@]+[a-z]+[\\.]+[a-z]{3}";

        if(str.matches(regs))
            System.out.println("valid");
        else
                System.out.println("Invalid");
}
}
