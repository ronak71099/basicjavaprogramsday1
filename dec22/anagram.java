package dec22;
import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        String str,str2;
        System.out.println("enter any string which you want to convert in lowercase");
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        str2 = s.nextLine();
        char[] an = str.toLowerCase().toCharArray();
//        char[] an = result.toCharArray();
        char[] an2 = str2.toLowerCase().toCharArray();
        Arrays.sort(an);
        Arrays.sort(an2);
        int flag = 1;
        for(int i=0;i<an.length;i++){
            if(an[i]!=an2[i]){
                flag=0;
                break;
            }
        }
        if(flag==1)
            System.out.println("anagram");
        else
            System.out.println("not anagram");
    }

}
