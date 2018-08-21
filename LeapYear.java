import java.util.Scanner;
class LeapYear{
     /*This is a function of the Finding the leap year or not*/

        static boolean findLeap(int year){ 
            if(year % 400 == 0){
                return true;
            }
            if(year % 100 == 0){
                return false;
            }
            if(year % 4 == 0){
                return true;
            }
            return false;
        }
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in); //Scanner Object
        
       

        int myYear;
        System.out.println("Enter the Year which you find to make leap year:");
        myYear  = sc.nextInt();
        System.out.println(findLeap(myYear)?"Yes It is Leap Year":"It is not Leap year");

    }
}