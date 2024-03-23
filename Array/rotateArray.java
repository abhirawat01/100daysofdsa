package IntroToJava;

public class rotateArray {

    public static void main(String[] args) {

        int[] array = { 10, 20, 30, 40, 50 };

        System.out.println("----------Previous Array---------");
        for(int val : array){
            System.out.print(val + " ");
        }
        System.out.println();
        rotate(array, -3);
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        if (k < 0) {
            k = k + n;
        }

        for( int i=0; i<k; i++){
            int temp = arr[n-1];

            for(int j=n-1; j>0; j--){

                arr[j] = arr[j-1];
            }
            arr[0]= temp;
        }

        System.out.println("----------Rotated Array----------");
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}
