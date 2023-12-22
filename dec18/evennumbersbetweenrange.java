package dec18;
import java.util.Scanner;
public class evennumbersbetweenrange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the starting number : ");
        int a = s.nextInt();
        System.out.println("enter the last number : ");
        int b = s.nextInt();
        do{
            if(a%2==0){
                System.out.print(a+" ");
                a++;
            }
            a++;
        }while(a<=b);
    }
}
