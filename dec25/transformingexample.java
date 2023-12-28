package dec25;
import java.util.*;
import java.util.Scanner;
public class transformingexample {
    static int compute_Levenshtein_distance(String str1, String str2) {

        if (str1.isEmpty())
        {
        return str2.length();
        }

        if (str2.isEmpty())
        {
        return str1.length();
        }

    // calculate the number of distinct characters to be
    // replaced in str1
    // by recursively traversing each substring


    int replace = compute_Levenshtein_distance(
            str1.substring(1), str2.substring(1))
            + NumOfReplacement(str1.charAt(0),str2.charAt(0));
//        System.out.print(replace+"");
    // calculate the number of insertions in str1
    // recursively
    int insert = compute_Levenshtein_distance(
            str1, str2.substring(1))+ 1;
    // calculate the number of deletions in str1
    // recursively
    int delete = compute_Levenshtein_distance(
            str1.substring(1), str2)+ 1;
    // returns minimum of three operations
//        System.out.println();
        return minm_edits(replace, insert, delete);
}

static int NumOfReplacement(char c1, char c2)
{
    // check for distinct characters
    // in str1 and str2

    return c1 == c2 ? 0 : 1;
}
static int minm_edits(int a1,int b1,int c1){
//    System.out.println(a1+" "+b1+" "+c1);
        int min1 = Math.min(a1,b1);
        int min2 = Math.min(min1,c1);
        return min2;
}
//static int minm_edits(int... nums)
//{
//    // receives the count of different
//    // operations performed and returns the
//    // minimum value among them.
//
//    return Arrays.stream(nums).min().orElse(
//            Integer.MAX_VALUE);
//}

// Driver Code
public static void main(String args[])
{
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the first string : ");
    String s1 = s.nextLine();
    System.out.println("Enter the second string : ");
    String s2 = s.nextLine();
    int result = (compute_Levenshtein_distance(s1, s2));
    System.out.println("the total of operation to convert "+s1+" to "+s2+" is : "+result);
}

    }
//}
