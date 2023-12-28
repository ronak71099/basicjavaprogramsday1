package dec22;
import java.util.Arrays;
import java.util.Scanner;
public class duplicatecharacter {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String str  = s.nextLine();

        char[] beforesorted = str.toCharArray();
        Arrays.sort(beforesorted);

//        System.out.println(beforesorted);
        String aftersorted = new String(beforesorted);
        System.out.println(aftersorted);
        StringBuilder answer = new StringBuilder();
        int count =1;
        for(int i=1;i<aftersorted.length()-1;i++){
            if(aftersorted.charAt(i)==aftersorted.charAt(i-1)){
                count++;
            }
            else{
                answer.append(aftersorted.charAt(i-1));
                answer.append(count);
                count=1;
            }
        }
        if(aftersorted.length()>1){
            if(aftersorted.charAt(aftersorted.length()-1)==aftersorted.charAt(aftersorted.length()-2)){
                count++;
            }
            else{
                answer.append(aftersorted.charAt(aftersorted.length()-2));
                answer.append(count);
                count=1;
            }

            answer.append(aftersorted.charAt(aftersorted.length()-1));
            answer.append(count);
        }
        String ans = answer.toString();
        System.out.println(ans);
    }
}
