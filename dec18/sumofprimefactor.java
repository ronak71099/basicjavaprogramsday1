package dec18;
import java.util.Scanner;
public class sumofprimefactor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int n = s.nextInt();
        int sum = 0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                int flag=0;
                if(i==2 || i==3){
                    sum+=i;
                    System.out.print(i+" ");
                }
                else{
                    for(int k = 2;k<=i/2;k++){
                        if(i%k==0){
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0) {
                        sum += i;
                        System.out.print(i+" ");
                    }
                }
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
