class Construct{
    int l,b;

    Construct(){
        l = b = 0;
    }
    Construct(int x){
        l = b = x;
    }
    Construct(int x,int y){
        l = x;
        b = y;
    }
    Construct(Construct x){
        this.l = x.l;
        this.b = x.b;
        System.out.println("Im copied");
    }
    void display(){
        System.out.println("This is an ans = " + (l * b));
    }
}
class OverloadAndCopyConstructor{
    public static void main(String a[]){

        //This is for creating an object
        Construct cn = new Construct(3);
        cn.display();

        //This is for coping the object
        Construct nec = new Construct(cn);
        nec.display();
    }
}