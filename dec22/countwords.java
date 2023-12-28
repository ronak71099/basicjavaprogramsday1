package dec22;
import java.util.Scanner;
public class countwords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        System.out.println("enter any sentence and we count the number of words");
        str=s.nextLine();
        String[] answer = str.split(" ");
        System.out.println(answer.length);
    }
}
