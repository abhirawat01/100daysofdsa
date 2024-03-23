package IntroToJava;

public class pattern6 {
    public static void main(String[] args) {
        
        int n = 15;
        int spaces = n-2;
        int stars = 1;

        for(int row = 0; row < n; row++){

            if(row == n/2){
                for(int col = 0; col < n; col++){
                    System.out.print("*");
                }
            }
            else{
                for(int col = 0; col < stars; col++){
                    System.out.print("*");
                }
    
                for(int col = 0; col < spaces; col++){
                    System.out.print(" ");
                }
    
                for(int col = 0; col < stars; col++){
                    System.out.print("*");
                }
            }

            System.out.println();
            if(row >= n/2){
                spaces+=2;
                stars--;
            }
            else{
                spaces-=2;
                stars++;
            }
        }
    }
}
