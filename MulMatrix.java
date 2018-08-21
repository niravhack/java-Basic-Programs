import java.util.Scanner;
class MulMatrix{
    public static void main(String a[]){

        Scanner sc = new Scanner(System.in);

        int arrOne[][] = new int[2][2];
        int arrTwo[][] = new int[2][2];
        int arrMul[][] = new int[2][2];
        int ans = 0;

        System.out.println("Enter the values for the Array 1: \n\n");
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 2;j++){
                System.out.println("Enter value for array[" + i + "] [" + j + "] :");
                arrOne[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the values for the Array 2: \n\n");
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 2;j++){
                System.out.println("Enter value for array[" + i + "] [" + j + "] :");
                arrTwo[i][j] = sc.nextInt();
            }
        }

        //Displaying the arrays

        System.out.println("This is array 1: \n\n");
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 2-1;j++){
                System.out.println(arrOne[i][j] + " " + arrOne[i][j+1]);
            }
        }

        System.out.println("This is array 2: \n\n");
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 2-1;j++){
                System.out.println(arrTwo[i][j] + " " + arrTwo[i][j+1]);
            }
        }

        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 2;j++){
                for(int k = 0;k < 2;k++){
                    ans = ans + arrOne[i][j] * arrTwo[j][k];
                }
                arrMul[i][j] = ans;
            }
        }

        System.out.println("Here is the answare");

        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 2-1;j++){
                System.out.println(arrMul[i][j] + " " + arrMul[i][j + 1]);
            }
        }


    }
}