package dec22;
import java.util.Arrays;
import java.util.*;

public class removingduplicates {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter any string from which you want to remove duplicates don't put spaces : ");
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        StringBuilder sb = new StringBuilder();
        if(!str.isEmpty()) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            sb.append(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] != chars[i - 1]) {
                    sb.append(chars[i]);
                }
            }
        }
        System.out.print(sb);
    }

}
