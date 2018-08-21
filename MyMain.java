class MyMain{
	public static void main(String a[]){
		Man nirav = new Man();
		Man dhruvil = new Man();
		
		nirav.name = "Nirav";
		nirav.age = 18;
		nirav.sem = 5;
		nirav.collage = "Goverment Polytechnic Gandhinagar";

		nirav.showName();
		nirav.showAge();
		nirav.showSem();
		nirav.showCollage();

		dhruvil.name = "dhruvil";
		dhruvil.age = 18;
		dhruvil.sem = 5;
		dhruvil.collage = "Goverment Polytechnic Ahmedabad";

		dhruvil.showName();
		dhruvil.showAge();
		dhruvil.showSem();
		dhruvil.showCollage();
	}
}