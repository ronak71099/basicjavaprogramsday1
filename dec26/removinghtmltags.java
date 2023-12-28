package dec26;
import java.util.Scanner;
public class removinghtmltags {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String result = str.replaceAll("<[^>]*>", "");
        System.out.println(result);

    }
}
