import java.util.Scanner;

class NumToWord {
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number = ");
        long num = sc.nextLong();

        long temp = num;        
        long remainder = 0;
        long reverseNum = 0;

        String words[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"}; 
        String fstring = "";

        while(temp != 0) {
            remainder = temp % 10;
            reverseNum = remainder + (reverseNum * 10);
            temp = temp / 10;
        } 

        while(reverseNum != 0) {
            remainder = reverseNum % 10;
            switch((int) remainder) {
                case 0:
                    fstring += words[0] + " ";
                    break;
                case 1:
                    fstring += words[1] + " ";
                    break;
                case 2:
                    fstring += words[2] + " ";
                    break;
                case 3:
                    fstring += words[3] + " ";
                    break;
                case 4:
                    fstring += words[4] + " ";
                    break;
                case 5:
                    fstring += words[5] + " ";
                    break;
                case 6:
                    fstring += words[6] + " ";
                    break;
                case 7:
                    fstring += words[7] + " ";
                    break;
                case 8:
                    fstring += words[8] + " ";
                    break;   
                case 9:
                    fstring += words[9] + " ";
                    break;                 
            }

            reverseNum = reverseNum / 10;
        } 

        System.out.println(fstring);

    }
}