//This is a new mathod for the wrapper class
class NewWraperClass{
    public static void main(String a[]){
        
        /* This is a Boxing */
        System.out.println("*****This is for Boxing*****");
        //int
        int val = 23;
        Integer objInt = Integer.valueOf(val);
        System.out.println("This is an object of an Integer " + objInt);

        //byte
        byte byt = 12;
        Byte objByt = Byte.valueOf(byt);
        System.out.println("This is an object of an Byte " + objByt);

        //short
        short srt = 123;
        Short objShort = Short.valueOf(srt);
        System.out.println("This is an object of an Short " + srt);

        //long
        long lng = 12345l;
        Long objLong = Long.valueOf(lng);
        System.out.println("This is an object of an Long " + objLong);

        //float
        float flt = 13.13f;
        Float objFloat = Float.valueOf(flt);
        System.out.println("This is an object of an Float " + objFloat);

        //double
        double dbl = 123.422323;
        Double objDouble = Double.valueOf(dbl);
        System.out.println("This is an object of an Double " + objDouble);

        //char
        char chr = 'n';
        Character objChar = Character.valueOf(chr);
        System.out.println("This is an object of an Character " + objChar);


        /* This is a Unboxing */
        System.out.println("*****This is for Unboxed values*****");
        int it = objInt.intValue();
        System.out.println("It is unboxed Integer " + it);

        byte bt = objByt.byteValue();
        System.out.println("It is unboxed Byte " + bt);
        
        short st = objShort.shortValue();
        System.out.println("It is unboxed Short " + st);

        long ln = objLong.longValue();
        System.out.println("It is unboxed Long " + ln);

        float ft = objFloat.floatValue();
        System.out.println("It is unboxed Float " + ft);

        double db = objDouble.doubleValue();
        System.out.println("It is unboxed Double " + db);

        char ch = objChar.charValue();
        System.out.println("It is unboxed Character " + ch);
    }
}