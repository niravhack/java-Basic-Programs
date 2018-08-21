/*This is a programm of hierarchical inheritance */
/*This is a Super class */
class Father{
    void father(){
        System.out.println("I am father");
    }
}

/*This is a Sub Class of Super class Father*/
class ChildOne extends Father{
    void ch1(){
        System.out.println("I am child one");
    }
}

/*This is second Sub class of super class Father*/
class ChildTwo extends Father{
    void ch2(){
        System.out.println("I am child two");
    }
}

/*This is main class */
class Hirarchy{
    public static void main(String a[]){
        ChildOne c1 = new ChildOne();
        ChildTwo c2 = new ChildTwo();
        c1.father();
        c1.ch1();
        c2.father();
        c2.ch2();
    }
}