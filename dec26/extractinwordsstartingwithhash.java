package dec26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractinwordsstartingwithhash {
    public static List<String> extractUrls(String string) {
        List<String> urls = new ArrayList<>();
        Pattern pattern2 = Pattern.compile("<([^>]+)>(.*)</([^>]+)>");
        Pattern pattern1 = Pattern.compile("(^#\\w+|\\s#\\w+)|(^@\\w+|\\s@\\w+)");


       Matcher matcher = pattern2.matcher(string);


        while (matcher.find()) {
            urls.add(matcher.group());
        }

        return urls;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string ");
        String string =s.nextLine();

        List<String> urls = extractUrls(string);
        if(urls.isEmpty()){
            System.out.println("There is not any website inside the string");
        }
        else {
            System.out.println("The website inside the string is : ");
            for (String url : urls) {
                System.out.println(url);
            }
        }
    }
}
