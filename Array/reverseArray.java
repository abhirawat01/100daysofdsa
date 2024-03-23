package IntroToJava;

public class reverseArray {
    
    public static void main(String[] args) {
        
        int[] array = {10,20,30,40,50,60,70,80};

        System.out.println("---------Previous Array----------");
        for(int val : array){
            System.out.print(val + " ");
        }
        System.out.println();

        int lastIndex= array.length-1;

        for(int i=0; i<array.length; i++){

            if (i<lastIndex) {
                int temp = array[i];
                array[i] = array[lastIndex];
                array[lastIndex] = temp;
                lastIndex--;
            }
        }
        System.out.println("---------Reversed Array----------");
        for(int val : array){
            System.out.print(val + " ");
        }
    }
}
