package recursion;


public class findElement {

    public static int find(int[] arr, int idx, int x) {
        
        //base case
        if( idx == arr.length) return -1;

        return arr[idx] == x ? idx : find(arr, idx+1, x);    
    }
    
    public static void main(String[] args) {
        
        int[] arr = { 3,4, 2,56,4,7,31,2,45};

        System.out.println(find(arr,0, 2));
    }
}
