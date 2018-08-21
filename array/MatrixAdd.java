/*This programm demonstrate the addition of two matrix*/
class MatrixAdd{
    public static void main(String a[]){
        
        //Making the two array
        int arrayOne[][] = new int[3][2];
        int arrayTwo[][] = new int[3][2];
        int arrayAns[][] = new int[3][2];

        //Initialize the arra one
        arrayOne[0][0] = 1;
        arrayOne[0][1] = 4;
        arrayOne[1][0] = 2;
        arrayOne[1][1] = 5;
        arrayOne[2][0] = 3;
        arrayOne[2][1] = 6;

        //Initialize the array two
        arrayTwo[0][0] = 1;
        arrayTwo[0][1] = 4;
        arrayTwo[1][0] = 2;
        arrayTwo[1][1] = 5;
        arrayTwo[2][0] = 3;
        arrayTwo[2][1] = 6;
        System.out.println("Array 1:");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<2-1;j++){
                System.out.println(arrayOne[i][j] + " " + arrayOne[i][j+1]);
            }
        }
        System.out.println("Array 2:");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<2-1;j++){
                System.out.println(arrayTwo[i][j] + " " + arrayTwo[i][j+1]);
            }
        }

        System.out.println("Here is the answer:");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<2;j++){
                arrayAns[i][j] =  arrayTwo[i][j] + arrayTwo[i][j];
            }
        }

        for(int i = 0;i<3;i++){
            for(int j = 0;j<2-1;j++){
                System.out.println(arrayAns[i][j] + " " + arrayAns[i][j+1]);
            }
        }
    }
}