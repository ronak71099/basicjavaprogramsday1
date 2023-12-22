package dec18;
import java.util.Scanner;
public class fabonacciseries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = s.nextInt();
        int a=0;
        int b=1,c;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=3;i<=n;i++){
            c=a+b;
            System.out.print(c+" ");
//            System.out.print(b+" ");
            a=b;
            b=c;
//            a=c;

        }
//        System.out.println(c);
    }
}
