package dec18;

public class pyramidpattern {
    public static void main(String[] args) {
        int i,j;
        for(i=5;i>=0;i--){
            for(j=i;j<5;j++){
                System.out.print(" ");
            }
            int x=5-i;
            for(int l=0;l<=x;l++){
                System.out.print("*");
            }
            System.out.println();
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }

//            System.out.print("*");
            System.out.println();
        }
    }
}
