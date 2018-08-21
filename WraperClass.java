class WraperClass{
    public static void main(String a[]){ 

        //This is for Byte
        byte num1 = 12;
        Byte nu = new Byte(num1);
        System.out.println(nu);

        //This is for Short
        short num2 = 322;
        Short nu1 = new Short(num2);
        System.out.println(nu1);

        //This is for int
        int num3 = 1234;
        Integer nu2 = new Integer(num3);
        System.out.println(nu2);

        //This is for long
        long num4 = 12345l;
        Long nu3 = new Long(num4);
        System.out.println(nu3);

        //Solve This problem 
        //This is for charactor
        char ch = 'h';
        Character tem = Character.valueOf(ch);
        System.out.println(tem);

        //This is for float
        float flo1 = 12.3f;
        Float fl1 = new Float(flo1);
        System.out.println(fl1);

        //This for double
        double dbl1 = 123.34;
        Double db1 = new Double(dbl1);
        System.out.println(db1);        
    }
}