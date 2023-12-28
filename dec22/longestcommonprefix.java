package dec22;
import java.util.Scanner;
import java.util.Arrays;
public class longestcommonprefix {
    public static void main(String[] args) {
        Scanner s  =new Scanner(System.in);
        int n;
        System.out.println("enter the number of elemnets you want to store inside a string array : ");
        n = s.nextInt();
        System.out.println("enter the string ");
            String[] strs = new String[n];
            for(int i=0;i<n;i++){
                strs[i] = s.next();
            }

            String longestCommonPrefix = longestCommonPrefix(strs);
            if(!longestCommonPrefix.isEmpty()) {
                System.out.println(longestCommonPrefix);
            }
            else{
            System.out.println("no matched");
        }

    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);
//        for(int i=0;i<strs.length;i++) {
//            System.out.print(strs[i]);
//        }
        String shortest = strs[0];
        String longest = strs[strs.length - 1];

        int i = 0;
        while (i < shortest.length() && i < longest.length() && shortest.charAt(i) == longest.charAt(i)) {
            i++;
        }

        return shortest.substring(0, i);
    }
}
