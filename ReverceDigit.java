//This Programm is for reverce the digits
class ReverceDigit{
    public static void main(String a[]){
        int val,ans;
        val = 345;
        ans = 0;
        int rem = 0;
        int revNum = 0;

        while(val != 0){
            rem = val % 10;
            revNum = (rem + revNum * 10);
            val = val / 10;
        }
        System.out.println(revNum);
    }
}