package dec18;

public class multiplication {
    public static void main(String[] args) {
        int n=10;
        while(n>0) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(n+"*"+i+" = ");
                System.out.print(n*i+" "+",");
            }
            n--;
            System.out.println();
        }
    }
}
