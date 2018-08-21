/*This program is for finding PrimeNumber in 2D array*/
class PrimeArray{
    public static void main(String a[]){
        int count = 0;
        int k,prime=0;
        //Array for prime
        int primeArray[] = new int[10];

        //2D array is here
        int arrayOne[][] = new int[3][2];

        //Initialize the arra one
        arrayOne[0][0] = 9;
        arrayOne[0][1] = 4;
        arrayOne[1][0] = 7;
        arrayOne[1][1] = 5;
        arrayOne[2][0] = 3;
        arrayOne[2][1] = 6;
        //Here is the logic
        for(int i =0;i<3;i++){
            for(int j=0;j<2;j++){
                    prime = arrayOne[i][j];
                    for(k = 2;k<=prime-1;k++){
                        if(prime % k == 0){
                        break;
                     }
                }
                if(k == prime){
                System.out.println(prime);
                }
            }
        }
        for(int i =0;i<count;i++){
            System.out.println(primeArray[i]);
        }
    }
}