package string;

public class Palindrome{
    
    public static void main(String[] args) {

        String name = "naman";
        
        if(palindrome(name)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        
    }

    public static boolean palindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while( left < right){

            if(str.charAt(left) != str.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}