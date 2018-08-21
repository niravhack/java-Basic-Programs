/*This is a programm for the exit mehtod before main mathod*/
class ExitBefore{
    static {
        System.out.println("I am execute before main method.");
    }
    public static void main(String a[]){
        System.out.println("I am execute after static method");
    }
}