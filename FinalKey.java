class MyFinal{
    int l , b;

    //This is a final variable
    final int x = 30;

    MyFinal(){
        l = 10;
        b = 20;
    }
    void change(){
        l = 20;
        b = 30;
        //x = 50;
        System.out.println("values are changed");
    }

    void area(){
        System.out.println("L = " + l + "\n B = " + b + "\n x = " + x);
    }
}

class FinalKey{
    public static void main(String a[]){
        MyFinal f1 = new MyFinal();
        f1.change();
        f1.area();
    }
}