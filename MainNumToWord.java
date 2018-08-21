import java.util.Scanner;
class NumTOWord{
    int val,temp;
    String ans="";

    void setVal(int x){
        temp = x;
    }

    /*Here is the main logic to convert number to word */
    void getWord(){
        val = temp;
        String myArray[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int rem=0,revNum=0;
        while(temp != 0){
            rem = temp % 10;
            revNum = (rem + revNum * 10);
            temp = temp / 10;
        }
        
        //re reverce for get original digits
        val = revNum;
        revNum = 0;
        rem = 0;
        while(val != 0){
            rem = val % 10;
            switch(rem){
                case 0 :
                    ans = ans + " " + myArray[0];
                    break;
                case 1 :
                    ans = ans + " " + myArray[1];
                    break;
                case 2 :
                    ans = ans + " " + myArray[2];
                    break;
                case 3 :
                    ans = ans + " " + myArray[3];
                    break;
                case 4 :
                    ans = ans + " " + myArray[4];
                    break;
                case 5 :
                    ans = ans + " " + myArray[5];
                    break;
                case 6 :
                    ans = ans + " " + myArray[6];
                    break;
                case 7 :
                    ans = ans + " " + myArray[7];
                    break;
                case 8 :
                    ans = ans + " " + myArray[8];
                    break;
                case 9 :
                    ans = ans + " " + myArray[9];
                    break;                    
            }
            val = val / 10;
        }
        System.out.println(ans);
    }
}
class MainNumToWord{
    public static void main(String a[]){
        NumTOWord objMy = new NumTOWord();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int myVal; 
        myVal = sc.nextInt();
        objMy.setVal(myVal);
        objMy.getWord();
    }
}