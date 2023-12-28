package dec25;
import java.util.Scanner;
public class longestcommonsubstringpallindrom {


    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);

        System.out.println("enter any string ");
        str = s.nextLine();
        int n=str.length();


        String[] strArr = new String[(n*(n+1))/2];
        int val=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                strArr[val]=str.substring(i,j+1);
                val++;
            }
        }
        int res = 0;
        for(int i=0;i<strArr.length;i++){
            if(checkPallindrome(strArr[i])){
                res = Math.max(res,strArr[i].length());
            }
        }
        System.out.println("The highest length of a string which is a substring and also a pallindrom of the string : ");
        System.out.println(res);
    }
    public static boolean checkPallindrome(String str){
        String nstr = "";
        char ch;
        for (int i=str.length()-1; i>=0; i--)
        {
            ch= str.charAt(i); //extracts each character
            nstr += ch; //adds each character in front of the existing string
        }
        if(nstr.equals(str)){
            return true;
        }
        return false;
    }
}
