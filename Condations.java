//This is a program demonstrate the use of conditions
class Condations{
	public static void main(String a[]){
		int val = 15;

		//This is a if condition
		if(val < 18){
			System.out.println("You are not aligable for licence.And this is a if condition");
		}

		//This is a if..else condition
		if(val < 18){
			System.out.println("You are bellow 18.And this is If..Else condition");
		}else{
			System.out.println("You are above 18.And this is If..Else condition");
		}

		//This is a nested if condition
		if(val > 0){
			if(val < 18){
				System.out.println("Hey wellocome");
			}
		}else{
			System.out.println("Please provide a valid age.");
		}

		//This is a Else..If Condition
		if(val == 0){
			System.out.println("You are zero else..if");
		}else if(val == 15 ){
			System.out.println("This is a 15 else..if");
		}else{
			System.out.println("This is else part of else..if");
		}
	}
}