package recursion;

public class maxEle {

    public static int maximum( int[] arr, int idx) {
        
        //base case
        if( idx == arr.length - 1){
            return arr[idx];
        }

        return Math.min(arr[idx], maximum(arr, idx+1));
    }
    
    public static void main(String[] args) {
        
        int[] arr = { 3,4, 2,56,4,7,31,45};

       int result =  maximum(arr,0);

       System.out.println(result);
    }
}
