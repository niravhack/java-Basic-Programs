/*This is a program for overloaded constructor */
class Construct{
    Construct(){
        System.out.println("I am Default constructor");
    }    
    Construct(char i){
        System.out.println("I am character " + i);
    }
    Construct(int x){
        System.out.println("I am Integer " + x);
    }
}
class OverloadedConstuctor{
    public static void main(String a[]){
        Construct c1 = new Construct();
        Construct c2 = new Construct('n');
        Construct c3 = new Construct(20);
    }
}
