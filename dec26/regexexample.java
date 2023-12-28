package dec26;

import java.util.Scanner;


public class regexexample {
    public static void main(String[] args) {
        System.out.println("Enter any string : ");
        Scanner s = new Scanner(System.in);
        String str =s.nextLine();
        String regex = "[a-z/sA-Z]+";
        if(str.matches(regex))

            System.out.println("yes it's a valid syntax");

        else
            System.out.println("invalid syyntax");
//        int n = Integer.parseInt(str);
//        System.out.println(n);
    }
}
