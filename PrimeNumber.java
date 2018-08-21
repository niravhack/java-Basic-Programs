//This program is for generateing the prime numbers
class PrimeNumber{
    public static void main(String a[]){
        int number,prime,i,j;
        number = 100;
        prime = 3;

        //Here is the logic of the Prime Number
        for(i = 2; i < 100;i++){
            for(j = 2;j<=prime-1;j++){
                if(prime % j == 0){
                    break;
                }
            }
            if(j == prime){
                System.out.println(prime);
            }
            prime++;
        }
    }
}