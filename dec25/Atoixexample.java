package dec25;
import java.util.Scanner;
public class Atoixexample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter any string : ");
        String str1 = s.nextLine();
        String str = str1.trim();
        int neg = 1,i=0,ans=0;
//        String str= "-123f54.43";

        if(str.charAt(0)=='-'){
            neg=-1;
            i=1;
        }
        for(;i<str.length();i++){
            if((str.charAt(i)>'9'&&str.charAt(i)!='.')||(str.charAt(i)<'0'&&str.charAt(i)!='.')){
                System.out.println("Invalid syntax");
                return;
            }
            if(str.charAt(i)=='.') {
                System.out.println(ans*neg);
                return;
            }
            ans = ans*10+str.charAt(i)-'0';

        }
        System.out.println(ans*neg);
    }

}
