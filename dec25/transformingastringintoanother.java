package dec25;

import java.util.Scanner;
public class transformingastringintoanother {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first string : ");

        String str1 = s.nextLine();
        System.out.println("Enter second string : ");
        String str2 = s.nextLine();
        int count=0,diff=0;
        if(str1.length()==str2.length()){
            for(int i=0;i<str2.length();i++){
                if(str1.charAt(i)!=str2.charAt(i)){
                    count++;
                }
            }
        }
        else{
            int max1 = Math.max(str1.length(),str2.length());
            int min = Math.min(str1.length(),str2.length());
            if(max1==str1.length()){
                diff = str1.length()-str2.length();
            }
            else{
                diff = str2.length()-str1.length();
            }

//        System.out.println(diff);
            count = diff;
            for(int i=0;i<min;i++){
                if(str1.charAt(i)!=str2.charAt(i)){
                    count++;
                }
            }
        }
        System.out.println("from changing string 1 to string 2 the total number of implements are : ");
        System.out.println(count);


    }
}