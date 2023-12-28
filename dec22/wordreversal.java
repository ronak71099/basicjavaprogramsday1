package dec22;
import java.util.Scanner;
import java.util.ArrayList;

public class wordreversal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any sentence to reverse");
        String str = s.nextLine();
        ArrayList<String> name = new ArrayList<>();
        String[] an = str.split(" ");
        for(int i=an.length-1;i>=0;i--){
            System.out.print(an[i]+" ");
        }
    }

}
