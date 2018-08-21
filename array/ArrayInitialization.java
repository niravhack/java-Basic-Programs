/*This is for initialization of 1D 2D 3D array */
class ArrayInitialization{
    public static void main(String a[]){

        /*This is a 1D array */
        int oneDArray[] = new int[3];
        oneDArray[0] = 1;
        oneDArray[1] = 2;
        oneDArray[2] = 3;
        //Printing 1D array
        System.out.println("*****1D array is*****");
        for(int i = 0;i<3;i++){
            System.out.println(oneDArray[i]);
        }


        /*This is a 2D array */
        int twoDArray[][] = new int[3][2];
        twoDArray[0][0] = 1;
        twoDArray[0][1] = 4;
        twoDArray[1][0] = 2;
        twoDArray[1][1] = 5;
        twoDArray[2][0] = 3;
        twoDArray[2][1] = 6;

        //Printing 2D array
        System.out.println("*****2D Array is*****");
        
        //This loop for rows 
        for(int i = 0;i<3;i++){
            //This loop for columns
            for(int j = 0;j<2-1;j++){
                System.out.println(twoDArray[i][j] + " " + twoDArray[i][j+1]);
            }
        }

        /*This is 3D array */
        int threeDArray[][][] = new int[2][3][2];
        threeDArray[0][0][0] = 1;
        threeDArray[0][0][1] = 4;
        threeDArray[0][1][0] = 2;
        threeDArray[0][1][1] = 5;
        threeDArray[0][2][0] = 3;
        threeDArray[0][2][1] = 6;

        threeDArray[1][0][0] = 11;
        threeDArray[1][0][1] = 14;
        threeDArray[1][1][0] = 12;
        threeDArray[1][1][1] = 15;
        threeDArray[1][2][0] = 13;
        threeDArray[1][2][1] = 16;

        //Printing the 3D array.
        for(int i = 0;i < 2;i++){
            System.out.println("Plane " + i);
            for(int j = 0;j < 3;j++){
                for(int k = 0; k < 2-1; k++){
                    System.out.println(threeDArray[i][j][k] + " " + threeDArray[i][j][k+1]);
                }
            }
        }
    }
}