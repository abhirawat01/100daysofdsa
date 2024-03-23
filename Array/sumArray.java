package IntroToJava;

import java.util.ArrayList;

public class sumArray {
    
    public static void main(String[] args) {
        int[] array1 = { 9, 9};
        int[] array2 = { 9, 9, 9};

        System.out.println(sum(array1, array2));
    }

    public static ArrayList<Integer> sum( int[] array1, int[] array2) {

        ArrayList<Integer> ans = new ArrayList<>();
        
        int carry = 0;
        int i = array1.length -1;
        int j = array2.length -1;

        while( i>=0 || j>=0){

            int sum = 0;

            if( i >=0 ){
                sum += array1[i];
            }

            if( j>= 0){
                sum += array2[j];
            }

            sum += carry;

            int rem = sum % 10;
            carry = sum/10;

            ans.add(0, rem);
            i--;
            j--;
        }

        if( carry > 0){
            ans.add(0, carry);
        }

        return ans;
        
    }
}
