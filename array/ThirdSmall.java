/*This program finds third smallest value in 2D*/
class ThirdSmall{
    public static void main(String a[]){

        int small,secSmall,thirdSmall;
        small = 100;
        secSmall = 100;
        thirdSmall = 100;
        //Making an 2D array
        int twoDArray[][] = new int[3][2];
        twoDArray[0][0] = 1;
        twoDArray[0][1] = 46;
        twoDArray[1][0] = 3;
        twoDArray[1][1] = 6;
        twoDArray[2][0] = 50;
        twoDArray[2][1] = 8;
        
        //Hera is the logic
        for(int i = 0;i<3;i++){
            for(int j = 0;j<2;j++){
                if(twoDArray[i][j] < thirdSmall){
                    if(twoDArray[i][j] < secSmall){
                        if(twoDArray[i][j] < small){
                            thirdSmall = secSmall;
                            secSmall = small;
                            small = twoDArray[i][j];
                        } else {
                            thirdSmall = secSmall;
                            secSmall = twoDArray[i][j];
                        }
                    } else {
                        thirdSmall = twoDArray[i][j];
                    }
                }
            }
        }
        System.out.println("Third Small number is " + thirdSmall);
    }
}