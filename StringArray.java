//This Programm is for string array
//And This is also for finding the length of array
class StringArray{
	public static void main(String a[]){
		String[] name = {"nirav","jayesh","john"};
		for(int i = 0;i < 3;i++){
			System.out.println(name[i]);
		}
		//This is to find out length of array
		System.out.println("Array length is " + name.length);

		//This for loop is for printing the values using array langth
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]);
		}
	}
}