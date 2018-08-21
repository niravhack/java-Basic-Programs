/*
 This is a program for finding second maximum Number without using array
*/
import java.util.Scanner;
class SecondMax{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);

        int max,secVal,val;
        char flag;
        max = 0;
        secVal = 0;

        System.out.println("You want enter value [y/n]:");
        flag = sc.next().charAt(0);

        if(flag == 'y'){
            for(;flag == 'y';){
                System.out.println("Enter Value:");
                val = sc.nextInt();

                //This is a logic for find second max value
                if(val >= secVal){
                    if(val >= max){
                        secVal = max;
                        max = val;
                    } else {
                    secVal = val;
                    }
                }
                System.out.println("You want enter value [y/n]:");
                flag = sc.next().charAt(0);
            }
        } else if(flag != 'y' && flag != 'n'){
            System.out.println("Please enter value [y/n]:");
            flag = sc.next().charAt(0);
        } else {
            System.out.println("Please enter atleast One time 'y' :");
        }

        //For Printing the second max value
        if(flag == 'n'){
            System.out.println("Second max value is : " + secVal );
        }
    }
}