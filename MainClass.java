class Number{
    int val;

    //this is a method for geting value
    void setVal(int x){
        val = x;
    }
    void getReverce(){
        int rem=0,revNum=0;
        while(val != 0){
            rem = val % 10;
            revNum = (rem + revNum * 10);
            val = val / 10;
        }
        System.out.println("Reverce value is " + revNum);
    }
}
class MainClass{
    public static void main(String a[]){
        Number objNumber = new Number();
        objNumber.setVal(123);
        objNumber.getReverce();
    }
}