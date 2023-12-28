package dec22;

public class substring {
    public static void main(String[] args) {
        String str = "name";
        String sString = "a";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String result = (str.substring(i,j));
//                System.out.println(result);
                if(result.equals(sString)){
                    System.out.println("matched");
                    break;
                }
//                else
//                    System.out.println("unmatched");
            }
        }
    }
}
