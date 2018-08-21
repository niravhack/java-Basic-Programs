/*This is a Programm for digital calc */
import java.util.Scanner;
class CalcNirav{
    public static void main(String args[]){
        System.out.println("########## Well-Come To Calculator ##########\n\n");
        System.out.println("This is developed By Nirav Patel");

        //declaring the scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Would You Want To Perform an Operation [Y/N] :");
        char flag = sc.next().charAt(0);
        char opr;
        int ans = 0;

        while(flag != 'n'){
            System.out.println("Please Enter Number 1:");
            int val1 = sc.nextInt();
            System.out.println("Please Enter Numbet 2:");
            int val2 = sc.nextInt();    
            System.out.println("Enter The oprtator Which You want to Perform:");
            opr = sc.next().charAt(0);

            switch (opr){
                case '+':
                    ans = val1 + val2;
                    break;
                case '-':
                    ans = val1 - val2;
                    break;
                case '*':
                    ans = val1 * val2;
                    break;
                case '/':
                    ans = val1 / val2;
                    break;
            }
            System.out.println("Ans is " + ans);
            System.out.println("Would You Want To Perform an Operation [Y/N] :");
            flag = sc.next().charAt(0);
        }
        System.out.println("#### Thank You For Use This Programm ####");   
    }
}