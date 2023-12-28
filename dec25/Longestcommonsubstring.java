package dec25;
import java.util.Scanner;
public class Longestcommonsubstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter string : ");
        String str = s.nextLine();
        int res = 0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){

                if(longestCommonSubstrin(str,i,j)){
                    res = Math.max(res,j-i+1);
                }

            }
        }
        System.out.println("The highest common substring of the given string is : ");
        System.out.println(res);

    }
    public static boolean longestCommonSubstrin(String str,int i,int j){
        boolean[] visited = new boolean[256];

        for (int k = i; k <= j; k++) {
            if (visited[str.charAt(k)])
                return false;

            visited[str.charAt(k)] = true;
        }
        return true;
    }

}
