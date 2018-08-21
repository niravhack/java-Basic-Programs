class Demo{
    int i,j;

    //This is for Pass By Value
    void setVal(int x,int y){
        this.i = x;
        this.j = y;
        System.out.println("I am Copied Call By Value");
        System.out.println("I = " + i + "\nJ = " + j);       
    }

    //This is for Pass By reference
    void changeObj(Demo x){
        x.i = 30;
        x.j = 40;
    }

    //This is for display variables
    void display(){
        System.out.println("I = " + i + "\nJ = " + j);
    }

    //This is for returning the value
    int retVal(){
        int i = 500;
        return i;
    }
    Demo retObj(){
        Demo j = new Demo();
        j.i = 440;
        return j;
    }
}
class PassValue{
    public static void main(String a[]){
        
    Demo d = new Demo();
    Demo s = new Demo();
    d.setVal(20,30);
    d.changeObj(d);
    d.display();
    //It returns a value
    System.out.println(d.retVal());
    s = d.retObj();
    System.out.println(s.i);
    }
}