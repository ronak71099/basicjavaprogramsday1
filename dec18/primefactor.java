package dec18;
import java.util.Scanner;
import java.util.ArrayList;
public class primefactor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int n = s.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                int flag=0;
//                for(int j=0;j<=i/2;j++){
                    if(i==2 || i==3){
                        System.out.println(i);
                    }
                    else{
                      for(int k = 2;k<=i/2;k++){
                          if(i%k==0){
                              flag=1;
                              break;
                          }
                      }
                      if(flag==0)
                          System.out.println(i);
                    }
//                }
            }
        }
//        System.out.println(arr);
//
//        ArrayList<Integer> arr1 = new ArrayList<>();
//        int a;
//
////        System.out.println("Enter any number : ");
//        for(int i=0;i<arr.size();i++) {
//            a = arr.get(i);
//            int flag = 0;
////            if (a < 2) {
////                System.out.println("");
////            }
//            if (a == 2 || a == 3) {
////                System.out.print(a+" ");
//                arr1.add(a);
////                arr1.add(a);
//            } else {
//
//                for (int j = 2; j <=a / 2; j++) {
//                    if (a % j == 0) {
//                        flag = 1;
//                        break;
//                    }
//                }
//                if (flag == 0) {
////                    System.out.print(a + " ");
//                    arr1.add(a);
//                }
////                else
////                    System.out.println(a+" ");
////                arr1.add(a);
//
//            }
//        }
//        System.out.print(arr1);
    }
}
