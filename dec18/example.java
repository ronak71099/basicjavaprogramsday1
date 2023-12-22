package dec18;

//import java.util.ArrayList;

public class example {
    public static void main(String[] args) {
        ///this program print *****
        ///                   *   *
        ///                   *   *
        ///                   *   *
        ///                   *****
//        int rows = 5;
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < rows; j++) {
//                if (i == 0 || j == 0 ||i==rows-1 || j == rows - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


        ///this program print *  diamond pattern
        ///                  * *
        ///                 * * *
        ///                  * *
        ///                   *

//        int rows = 5;
//        int space = rows-1;
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<space;j++){
//                System.out.print(" ");
//            }
//            space--;
//            for(int k=0;k<2*i-1;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        space=0;
//        rows=rows-1;
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<=space;j++){
//                System.out.print(" ");
//            }
//            space++;
//            for(int k=0;k<2*(rows-i)-3;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        ///print downward star triangle pattern
//        for(int i=0;i<9;i++){
//            for(int j=9;j>i;j--){
//                System.out.print("*");
//            }
//            System.out.print("");
//            System.out.println();
//        }


        ///print mirrored of right angle triangle
//            for(int i=0;i<5;i++){
//                for(int j=5-i;j>0;j--){
//                    System.out.print(" ");
//                }
//                for(int k=0;k<=i;k++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

        ///print right down star pattern    *****
                                        //   ****
                                        //    ***
                                        //     **
                                        //      *
//            for(int i=0;i<5;i++){
//                for(int k=0;k<=i;k++){
//                    System.out.print(" ");
//                }
//                for(int j=5;j>i;j--){
//                    System.out.print("*");
//                }
//
//                System.out.println();
//            }

        ///print right pascal triangle
//        int rows =15;
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.print(" ");
//            System.out.println();
//        }
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<rows-i-1;j++){
//                System.out.print("*");
//            }
//            System.out.print(" ");
//            System.out.println();
//        }
        ///print triangle

        int i, j, k, rows=9;
        for (i=1; i<= rows ; i++)
        {
            for (j = i; j < rows ; j++)
            {
                System.out.print(" ");
            }
            for (k = 1; k <= (2*i -1) ;k++)
            {
                if(k==1 || i == rows || k==(2*i-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
