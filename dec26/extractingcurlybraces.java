package dec26;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractingcurlybraces {
    public static void main(String[] args) throws IOException {

        Path file = Path.of("C:\\Users\\balajee\\Desktop\\helloworld.txt");
        String regex = "\\{([\\s\\S]*)\\}";
        String name = Files.readString(file);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(name);
        while(matcher1.find()){
            System.out.println(matcher1.group());
        }
//        System.out.println(name);
    }
}
