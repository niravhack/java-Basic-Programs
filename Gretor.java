//This program is for finding the big number out of two number using method
class Gretor{
	//Gretor finding method
	static int findBig(int no1,int no2){
		if(no1 > no2){
			return no1;
		} else {
			return no2;
		}
	}
	//mainmethod
	public static void main(String a[]){
		int ans = findBig(2,5);
		System.out.println("Big Number is " + ans);
	}
}