class Wrapper{
    public static void main(String a[]){

        //This is for numbers

        byte bt = 1;
        Byte byteObj = new Byte(bt);
        System.out.println(byteObj);

        short sh = 21;
        Short shortObj = new Short(sh);
        System.out.println(shortObj);

        int val = 1221;
        Integer intObj = new Integer(val);
        System.out.println(intObj);

        long lng = 1234444;
        Long longObj = new Long(lng);

        //This is for string
        char cr = 'N';
        Character charObj = cr; 
        System.out.println(charObj);
    }
}