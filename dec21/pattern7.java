package dec21;

public class pattern7 {
    public static void main(String[] args) {
        int rows = 6;
        int space = rows-1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            space--;
            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        space=0;
        rows=rows-1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<=space;j++){
                System.out.print(" ");
            }
            space++;
            for(int k=0;k<2*(rows-i)-3;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
