/*This programm is for stack in this programm demonstrate PUSH,POP operation */
import java.util.Scanner;
class StackMain{

    //Here All Variable are declared 
    int stack[];
    int pos = -1;

    //object for the scanner
    Scanner sc = new Scanner(System.in);

    //This is a constructor for initialize the array
    StackMain(){
        System.out.println("Enter The size of stack:");
        int val = sc.nextInt();
        stack[] = new int[val];
        int length = stack.length();
        System.out.println("You create an array size :" + length);
    }
}

//This is a main class
class Stack{
    public static void main(String a[]){

    }
}