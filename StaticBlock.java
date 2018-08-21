class StaticBlock{
    static{
        System.out.println("I am Execute before main method");
    }
    public static void main(String a[]){
        System.out.println("I am Execute After Static block");
    }
}