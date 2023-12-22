package dec18;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.println("Enter any number : ");
        a = s.nextInt();
        int flag = 0;
        if(a<2){
            System.out.println("non prime");
        }
        if(a==2 || a==3){
            System.out.println("prime number");
        }
        else{

            for(int i=3;i<a/2;i++){
                if(a%i==0){
                    flag = 1;
                    break;
                }
            }
            if(flag==1)
                System.out.println("Non prime");
            else
                System.out.println("prime");

        }
    }
}
