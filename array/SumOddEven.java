/*This Programm is for finding the odd and even Number from 2D array*/
class SumOddEven{
    public static void main(String a[]){

        //Making the odd array
        int oddArray[] = new int[10];
        //Making the even array
        int evenArray[] = new int[10];

        //Making the 2D array
        int twoDArray[][] = new int[4][2];
        twoDArray[0][0] = 1;
        twoDArray[0][1] = 5;

        twoDArray[1][0] = 2;
        twoDArray[1][1] = 6;

        twoDArray[2][0] = 3;
        twoDArray[2][1] = 7;

        twoDArray[3][0] = 4;
        twoDArray[3][1] = 8;

        //Hera is the main logic to find out odd and even numbers.
        int countrEven = 0;
        int countrOdd = 0;
        for(int i = 0;i<4;i++){
            for(int j = 0;j < 2;j++){
                if(twoDArray[i][j] % 2 == 0){
                    evenArray[countrEven] = twoDArray[i][j];
                    countrEven++;
                } else {
                    oddArray[countrOdd] = twoDArray[i][j];
                    countrOdd++;
                }
            }
        }

        int ans = 0;
        //Printing the arrays
        for(int i = 0;i < countrOdd;i++){
            ans = ans + oddArray[i];
        }
        System.out.println("Sum of Odd Numbers is " + ans);

        ans = 0;
        for(int d=0;d<countrEven;d++){
            ans = ans + evenArray[d];
        }
        System.out.println("Sum of Odd Numbers is " + ans);
    }
}