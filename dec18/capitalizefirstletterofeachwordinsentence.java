package dec18;

public class capitalizefirstletterofeachwordinsentence {
    public static void main(String[] args) {
        ///program that capitalize the first letter of each word in a sentence
        String str = "look into my eyes";
        String[] arr = str.split(" ");
        String capitalize = "";
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        for(String s : arr) {
            String first = s.substring(0, 1).toUpperCase();
            String remainingString = s.substring(1);
            capitalize += first + remainingString + " ";
        }


        System.out.println(capitalize);
    }
}
