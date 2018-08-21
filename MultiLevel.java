class GrandFather{
    void profileGFather(){
        System.out.println("I am Grand Father");
    }
}
class Father extends GrandFather{
    void profileFather(){
        System.out.println("I am Father");
    }
}
class Child extends Father{
    void profileChild(){
        System.out.println("I am Child");
    }
}
class MultiLevel{
    public static void main(String a[]){
        Child c = new Child();
        c.profileGFather();
        c.profileFather();
        c.profileChild();
    }
}