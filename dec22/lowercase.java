package dec22;
import java.util.Scanner;
public class lowercase {
    public static void main(String[] args) {
        String str;
        System.out.println("enter any string which you want to convert in lowercase");
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        String answer="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = ch;
            if(ascii>=65 && ascii<=90){
                ascii = ascii+32;
                char character = (char) ascii;
                answer+=character;
            }
            else{
//                ascii = ascii+32;
//                char character = (char) ascii;
                answer+=ch;
            }
//            System.out.println(ascii);
        }
        System.out.println(answer);
    }
}
