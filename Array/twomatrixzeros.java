package IntroToJava;

public class twomatrixzeros {
    public static void main(String[] args) {

        int[][] matrix = {
            {0,1,2,0},
            {3,4,5,2},
            {4,3,1,5}
        };

        int row = matrix.length;
        int col = matrix[0].length;

        boolean iscol;
        boolean isrow;

        if( matrix[0][0] !=0){
            iscol = isrow = false;
        }
        else{
            iscol = isrow = true;
        }
        
        for( int i=0; i<row; i++){
            for(int j=0; j<col; j++){

                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(i==0){
                        isrow = true;
                    }
                    matrix[0][j] = 0;
                    if(j==0){
                        iscol = true;
                    }
                }
            }
        }

        for( int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println(iscol);
        System.out.println(isrow);
        
        if (iscol) {
            for(int i =0 ; i< row; i++){
                matrix[i][0] = 0;
            }
        }
        if(isrow){
            for(int i=0; i< col; i++){
                matrix[0][i] = 0;
            }
        }

        for(int[] val : matrix){
            for(int temp : val){
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}
