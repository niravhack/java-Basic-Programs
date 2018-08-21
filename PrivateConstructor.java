//This is a programm for Create a private constructor and For count the no of instances are created
class MyPrivate{
    //This is a static variable for counter
    static int count;

    //This is a static block it initialize the counter
    static {
        count = 0;
    }

    //This is a private constructor
    private MyPrivate(){
        count++;
    }

    //This is a static method using we can create an object using the private constructor
    static void createObj(){
        MyPrivate r1 = new MyPrivate();
    }

    //This static method is used to print count
    static void displayCount(){
        System.out.println("count is " + count);
    }
}

//This is main class

class PrivateConstructor{
    public static void main(String a[]){
        MyPrivate.createObj();
        MyPrivate.createObj();
        MyPrivate.createObj();
        MyPrivate.createObj();
        MyPrivate.displayCount();
    }
} 