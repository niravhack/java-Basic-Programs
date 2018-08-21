/*This is a programm for finding the number is pelindrom or not*/
import java.util.Scanner;
class PelindromNum{
    public static void main(String a[]){
        int rem=0,revNum=0,val=0,orgVal=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number For Chack.");
        orgVal = val = sc.nextInt();

        while(val != 0){
            rem = val % 10;
            revNum = (rem + revNum * 10);
            val = val / 10;
        }
        if(revNum == orgVal){
            System.out.println("The Enterd Number " + orgVal + " Is Pelindrom.");
        } else{
            System.out.println("The Enterd Number " + orgVal + " Is Not Pelindrome.");
        }
    }
}