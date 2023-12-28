package dec26;

import java.util.regex.Pattern;

public class validatedate {
    public static void main(String[] args) {
        // the regex for the valid uuid is

//        String regexmac1 = "([0-9a-fA-F]{2}[:][0-9a-fA-F]{2}[:][0-9a-fA-F]{2}[:][0-9a-fA-F]{2}[:][0-9a-fA-F]{2}[:][0-9a-fA-F]{2})";
        //   mm/dd/yyyy
        String regex1 = "(0[0-9]|1[0-2][/]([012][0-9]|[3][0-1])[/](\\d{4}))";
        // dd-mm-yyyy
        String regex2 = "([012]\\d|[3][0-1][-](0[0-9]|1[0-2])[-](\\d{4}))";

        String month = "(0[0-9]|1[0-2])";
        String date =  "([012]\\d|^3[0-1])" ;
        String year =   "(\\d{4})";
        String str = "00-1B-63-84-45-E6";
        if(str.matches(regex2))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
