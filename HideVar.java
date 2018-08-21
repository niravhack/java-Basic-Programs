class Parant{
    //This is a static variable of Parant class
    static int x = 10;
}
class Child extends Parant{
    //THis is a instance variable of Child class 
    int x = 20;

    /*This is a Display mathod to display local,instance,and static variables */
    void display(int x){
        System.out.println("Value of Child Class is "+ this.x);
        System.out.println("Value of Parant Classs is " + Parant.x);
        System.out.println("This is a local variable " + x);
    }
}
class HideVar{
    public static void main(String a[]){
        Child b = new Child();

        //Calling the function
        
        b.display(5);
    }
}