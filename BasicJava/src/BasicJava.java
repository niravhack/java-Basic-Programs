public class BasicJava {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("****Select bellow option for run all operators java program****");
        System.out.println("*******Operators**********");
        System.out.println("1 .Arithmetic Operator ");
        System.out.println("2 .Logical Operator");
        System.out.println("3 .Relational Operator");
        System.out.println("4 .Assignment Operator");
        System.out.println("");
        
        //Arithmetic operators
        int a = 10,b = 5;
        int ans;
        System.out.println("Here A = " + a + " And B = " + b);
        ans = a + b;
        System.out.println("Sum is " + ans);
        ans = a - b;
        System.out.println("Substrection is " + ans);
        ans = a * b;
        System.out.println("Multiplication is " + ans);
        ans = a / b;
        System.out.println("DIvision is " + ans);
        ans = a % b;
        System.out.println("Modyulo is " + ans);
        
        //Logical Operators
        String name = "nirav";
        int age = 17;
        
        //AND
        if(name =="nirav" && age == 17){
         System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        
        //Or
        int no = 5;
        if(no == 5 || no == 6){
         System.out.println("True");
        }
        
        //Relational Operator
        
        int no1 = 10;
        int no2 = 5;
        System.out.println("Here Relational operator starts");
        if(no1 < no2){
            System.out.println("True ");
        } else {
            System.out.println("False");
        }
        if(no1 > no2){
            System.out.println("True ");
        } else {
            System.out.println("False");
        }
        if(no1 <= no2){
            System.out.println("True ");
        } else {
            System.out.println("False");
        }
        if(no1 >= no2){
            System.out.println("True ");
        } else {
            System.out.println("False");
        }
        if(no1 == no2){
            System.out.println("True ");
        } else {
            System.out.println("False");
        }
        if(no1 != no2){
            System.out.println("True ");
        } else {
            System.out.println("False");
        }
    }    
}
