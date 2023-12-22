package dec18;
import java.util.Arrays;
import java.util.regex.*;
import java.util.ArrayList;
public class regexexample {
    public static void main(String[] args) {
//        System.out.println("ram".compareTo("ronak"));
        System.out.println(Pattern.matches("(.+)begining$","from the begining"));
        String str = "abcd";
        int n = str.length();
        for (int i = 0; i < n; i++)
            for (int j = i+1; j <= n; j++)
                System.out.println(str.substring(i, j));
//        System.out.println(Pattern.matches("","from"));
        System.out.println(Pattern.matches("(from)","from"));
        String regex1 = "^[a-z]";
////        System.out.println(Pattern.matches("^[a-z]","from"));
//        System.out.println();
        ArrayList<String > arr = new ArrayList<>();
        arr.add("naem");
        arr.add("b");
        arr.add("neam");
        arr.add("name");
        arr.add("mean");
        for(String s:arr){
//            System.out.println(s);
            boolean val = true;
            val = Pattern.compile(regex1).matcher(s).matches();
            System.out.println(val);
        }

//        Pattern pattern = Pattern.compile("W3scHools", Pattern.CASE_INSENSITIVE);
//        System.out.println(pattern);
//        Matcher matcher = pattern.matcher("Visit W3Schools!");
//        System.out.println(matcher);
//        boolean matchFound = matcher.find();
//        if(matchFound) {
//            System.out.println("Match found");
//        } else {
//            System.out.println("Match not found");
//        }

    }
}
