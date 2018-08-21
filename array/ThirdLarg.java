/*This program is to find third largest value in the 2D array*/
class ThirdLarg{
    public static void main(String a[]){

        int max,secMax,thirdMax;
        max = 0;
        secMax = 0;
        thirdMax = 0;
        //Making an 2D array
        int twoDArray[][] = new int[3][2];
        twoDArray[0][0] = 4;
        twoDArray[0][1] = 46;
        twoDArray[1][0] = 34;
        twoDArray[1][1] = 6;
        twoDArray[2][0] = 50;
        twoDArray[2][1] = 8;

        //Hera is the logic
        for(int i = 0;i<3;i++){
            for(int j = 0;j<2;j++){
                if(twoDArray[i][j] > thirdMax){
                    if(twoDArray[i][j] > secMax){
                        if(twoDArray[i][j] > max){
                            thirdMax = secMax;
                            secMax = max;
                            max = twoDArray[i][j];
                        } else {
                            thirdMax = secMax;
                            secMax = twoDArray[i][j];
                        }
                    } else {
                        thirdMax = twoDArray[i][j];
                    }
                }
            }
        }
        System.out.println("Third larg number is " + thirdMax);
    }
}