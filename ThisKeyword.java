class ThisWord{

    //This is a private variable declaration
    private int l,b;
    void setVal(int l,int b){
        this.l = l;
        this.b = b;
    }

    void area(){
        System.out.println("L = " + this.l + "\n B = " + this.b);
        System.out.println("Area Of L * B is " + (l*b));
    }
}

class ThisKeyword{
    public static void main(String a[]){
        ThisWord r1 = new ThisWord();
        r1.setVal(10,20);
        r1.area();
    }
}