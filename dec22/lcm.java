package dec22;
import java.util.Arrays;
public class lcm {
    public static void main(String[] args) {
        String str1 = "floer";
        String str2 = "flowers";
//        char[] arr = str1.toCharArray();
//        Arrays.sort(arr);

//        char[] arr1 = str2.toCharArray();
//        Arrays.sort(arr1);


        int min = Math.min(str2.length(),str1.length());
        System.out.println(min);
        System.out.println(str1.charAt(0));
        for(int i=0;i<min;i++){
            if(str1.charAt(i)==str2.charAt(i))
                System.out.print(str1.charAt(i));
        }
    }
}
