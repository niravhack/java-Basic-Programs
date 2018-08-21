//This programm is for Constructor Overloading and to create copy of constructor

class Display{
    int var,var2;
  
    Display(){
        System.out.println("Hello Im default Constructor!");
    }

    //Bellow Declared All Constructors Are Known as Peramiterized Constrructor
    Display(int x){
        System.out.println("Value of Single Argument Constructor is var = " + x);
    }
    Display(int x,int y){
        var = x;
        var2 = y;
        System.out.println("Value of Double Argument Constructor is var = " + x + "  var2 = " + y);
    }
    Display(char c){
        System.out.println("Character constructors value is ch = " + c);
    }
    Display(String s){
        System.out.println("String is name = " + s);
    }

    //This is for copying the object
    Display(Display val){
        this.var = val.var;
        this.var2 = val.var2;
        System.out.println("I am copied");
        System.out.println("var = " + this.var);
        System.out.println("var2 = " + this.var2);
    }
}


class OverloadConstructor{
    public static void main(String a[]){
        Display d1 = new Display();
        Display d2 = new Display(12);
        Display d3 = new Display(10,20);
        Display d4 = new Display('n');
        Display d5 = new Display("Nirav");

        //Copying the object using Constructor
        Display copyContructor = new Display(d3);

    }
}