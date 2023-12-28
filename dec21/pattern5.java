package dec21;

public class pattern5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {

                // for left spacing
                System.out.print(" ");
            }

            // used to represent C(line, i)
            int C = 1;
            for (int k = 1; k <= i; k++) {

                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (i - k) / k;
            }
            System.out.println();
        }
        System.out.println(" "+7+2+3+" ");
    }
}
