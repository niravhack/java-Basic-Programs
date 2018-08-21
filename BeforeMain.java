//This is a programm for run method before main method
class BeforeMain{

    //This method will execute before main method
    static{
        System.out.println("Hello World");
    }

    //This will execute after executing the static method
    public static void main(String a[]){
            System.out.println("by");
        }
}