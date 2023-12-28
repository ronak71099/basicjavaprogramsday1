package dec18;
public class exceptionhandling {
    public static void main(String[] args){
        int a,b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number : ");
        a = s.nextInt();
        System.out.print("Enter second number : ");
        b = s.nextInt();
        try{
            int result;
            result=a/b;
            System.out.print(result);
        }
        catch (Exception e){
            System.out.print(e);
        }
    }
}
