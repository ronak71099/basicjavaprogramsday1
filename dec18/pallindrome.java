package dec18;
import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any number : ");
        int n = s.nextInt();
        int val=n;
        int reverse1=0;
        while(val>=1){
            int rem = val%10;
            reverse1 =reverse1*10+ rem;
            val = val/10;
        }
        System.out.println(reverse1);
        if(n==reverse1) {
            System.out.println("pallindrome");
        }
        else {
            System.out.println("not pallindrome");
        }
    }
}
