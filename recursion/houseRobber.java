package recursion;

public class houseRobber {
    
    public static void main( String[] args) {

        int[] nums = {3, 9, 1, 9, 10};
        
        System.out.println(maxmoney(nums,0));
    }

    public static int maxmoney( int[] arr, int idx){

        //base case
        if( idx >= arr.length) return 0;

        return Math.max(arr[idx] + maxmoney(arr,idx+2), 0+maxmoney(arr,idx+1));
    }
}
