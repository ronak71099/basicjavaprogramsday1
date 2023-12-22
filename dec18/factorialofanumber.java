package dec18;
import java.util.Scanner;
public class factorialofanumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        int mul=1;
        for(int i=1;i<=n;i++){
            mul = mul*i;
        }
        System.out.println("the factorial of the number is : ");
        System.out.print(mul);
    }
}
