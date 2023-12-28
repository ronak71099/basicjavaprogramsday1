package dec21;

public class pattern4 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            int count=1;
            for(int k=5;k>i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.print(" ");
            System.out.println();
        }
    }
}
