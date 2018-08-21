/*In this Programm we use super keyword to call the constructor of parant class`*/
class GrandFather{
    GrandFather(int x){
        System.out.println("Value of Grandfather is " + x);
        System.out.println("I am Grand father.");
    }
}

class Father extends GrandFather{
    Father(int x){
        //This is a calling of constructor using super keyword
        super(x);
        System.out.println("Value of Father is " + x);
        System.out.println("I am Father.");
    }
}

class Child extends Father{
    Child(int x){
        //This is a calling of constructor using super keyword
        super(x);
        System.out.println("Value of Child is " + x);
        System.out.println("I am child.");
    }
}
class SuperKeyword{
    public static void main(String a[]){
        Child xyz = new Child(10);
    }
}