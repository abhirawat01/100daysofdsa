package string;

public class Substrings {
    
    public static void main(String[] args) {
        
        String str = "Code";
        Substring(str);
    }

    public static void Substring( String str){

        for( int i=0; i<str.length(); i++){
            
            for( int j=i; j<str.length() + 1; j++){

                System.out.print(str.substring(i, j) + " ");
            }
            System.out.println();
        }
    }
}
