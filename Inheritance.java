class Parent{
    void car(){
        System.out.println("Fathers car");
    }
}
class Child extends Parent{
    void bike(){
        System.out.println("My Bike");
    }
}
class Inheritance{
    public static void main(String a[]){
        Child c = new Child();
        c.car();
        c.bike();
    }
}