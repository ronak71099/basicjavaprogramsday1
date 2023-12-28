package dec26;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.ArrayList;
import java.util.List;
public class Urlextraction {

    public static List<String> extractUrls(String string) {
        List<String> urls = new ArrayList<>();



        Pattern pattern = Pattern.compile("((http|https)://)?(www.)?" +
                "[a-zA-Z0-9@:%._\\+~#?&//=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%._\\+~#?&//=]*)");
        Matcher matcher = pattern.matcher(string);


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
