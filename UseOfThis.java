class TempMethod{
    private int val = 10;
    int n = 11;

    void display(){
        System.out.println(this.val);
        System.out.println(n);
    }
}
class UseOfThis{
    public static void main(String a[]){
        TempMethod mm = new TempMethod();
        mm.display();
    }
}