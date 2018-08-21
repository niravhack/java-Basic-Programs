/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicdatatype;

/**
 *
 * @author nirav
 */
public class BasicDataType {

    /**
     * @param args the command line arguments
     */
    public void fun(){
        int age = 0;
        age = age + 7;
        System.out.println("Your age is " + age);
    }
    public static void main(String[] args) {
        BasicDataType type = new BasicDataType();
        type.fun();
    }
    
}
