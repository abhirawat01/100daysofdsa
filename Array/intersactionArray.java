package IntroToJava;

import java.util.ArrayList;
public class intersactionArray {
    
    public static void main(String[] args) {

        int[] array1 = { 4, 15, 19, 20, 22, 35, 45};
        int[] array2 = { 5, 10, 15, 16, 20, 35, 40};

        System.out.println(intersaction(array1, array2));
    }

    public static ArrayList<Integer> intersaction( int[] one, int[] two) {
        
        int ptr1 , ptr2;
        ptr1 = ptr2 = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while( ptr1<one.length && ptr2<two.length){

            if( one[ptr1] < two[ptr2]){
                ptr1++;
            }
            else if( one[ptr1] > two[ptr2]){
                ptr2++;
            }
            else{
                ans.add(one[ptr1]);
                ptr1++;
                ptr2++;
            }
        }

        return ans;

    }
}
