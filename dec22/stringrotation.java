package dec22;
import java.util.Scanner;
public class stringrotation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        System.out.println("enter any string : ");
        str = s.nextLine();
        int n;
        System.out.println("enter the number where you want to rotate the string : ");
        n = s.nextInt();
        String[] answer = str.split(" ");
        if(n>=answer.length){
            for(int i=0;i<answer.length;i++){
                System.out.print(answer[i]+" ");
            }
        }
        else{
            for(int i=n;i<answer.length;i++){
                System.out.print(answer[i]+" ");
            }
            for(int i=0;i<n;i++){
                System.out.print(" "+answer[i]+" ");
            }
        }
    }
}
