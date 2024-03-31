
public class index {

	public static void main(String[] args) {
		
		String greetings = "Hello";
		String convoStarter = "How are you?";
		
		Student myStudent = new Student();
		myStudent.name = "Alex";
		myStudent.age = 18;
		myStudent.hobby = "Painting";
		
		String [] convoStarters = {"hows it going?", "nice weather we're having", "seen the news lately?"}; 
		
		for(int i = 0; i < convoStarters.length; i++ ) {
			System.out.println(convoStarters[i]);

		}
		

		

		
		System.out.println(greetings);
		System.out.println(convoStarter);
		importedMethods.smartyPants("pneumonoultramicroscopicsilicovolcanoconiosis");
		importedMethods.smartyPants("mississippi");
		importedMethods.finisher("pre-school", 12);

		importedMethods.introduction(myStudent.name);
		importedMethods.howOld(myStudent.age);
		importedMethods.passtime(myStudent.hobby);
		
		
	}


}
