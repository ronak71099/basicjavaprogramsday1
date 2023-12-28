package dec22;

public class subsequencesofastring {
    public static void main(String[] args) {
        String str = "xyz";
        printsubstring(str);
    }
    public static void printsubstring(String str){
        printsubstring(str,"");
    }
    public static void printsubstring(String str,String output){
        if(str.length()==0){
            System.out.println(output);
            return;
        }
        printsubstring(str.substring(1),output);
        printsubstring(str.substring(1),output+str.charAt(0));
    }
}
