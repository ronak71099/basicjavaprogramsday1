package dec25;

public class Atoifunction {
    public static void atoi(String str){
        int neg = 1;
        if(str.charAt(0) == '-'){
            neg = -1;
        }
        int ans = 0;
        int i = 0;
        // if the number is the negative number than start from the next index
        if(neg  == -1){
            i++;
        }
        for(; i < str.length(); i++){
            // checking for the base conditions
            // if the current character is not a digit return the invalid answer
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                System.out.println("The given string represents the invalid number");
                return;
            }
            else if( (ans > Integer.MAX_VALUE / 10) || (ans == Integer.MAX_VALUE / 10  && str.charAt(i) - '0' > 7)){
                // overflow condition correct
                System.out.println("The given string represents the number not in range of integer");
                return;
            }

            ans = ans * 10 + str.charAt(i) - '0';
        }
        ans =  ans* neg;
        // printing the answer
        System.out.printf("The value of the current number is %d", ans);
    }
    // main function
    public static void main(String []args){
        String str = "    -7895";
        String str2 =str.trim();
        // given string
        // calling the function
        atoi(str2);
    }
}
