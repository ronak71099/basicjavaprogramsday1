package dec25;

import java.util.Scanner;

public class permutationofstring {
    static void printPermutn(String str, String ans)
    {
        if (str.isEmpty()) {
            System.out.println(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            // ith character of str
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);

//            System.out.print(ros+" ");
            printPermutn(ros, ans + ch);
        }
    }

    // Driver code
    public static void main(String[] args)
    {
//        int count = 0;

        System.out.println("Enter the string : ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        printPermutn(str, "");
    }
}
