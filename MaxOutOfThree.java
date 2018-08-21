/* This programm is for finding the max value out 
** of three values using Conditional Operetor
*/
import java.util.Scanner;
class MaxOutOfThree{
    public static void main(String a[]){
        //This is a object of scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value 1:");
        int val1 = sc.nextInt();

        System.out.println("Enter value 2:");
        int val2 = sc.nextInt();

        System.out.println("Enter value 3:");
        int val3 = sc.nextInt();

        int max;

        //This is a logic of Conditional operator
        max = (val1 > val2 && val1 > val3) ? val1 : (val2 > val3) ? val2 : val3;

        //Printing
        System.out.println("Max value is : " + max);
    }
}