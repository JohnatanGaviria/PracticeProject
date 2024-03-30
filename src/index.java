
public class index {

	public static void main(String[] args) {
		
		String greetings = "hello";
		String convoStarter = "how are you?";
//		String fancyWord = "pneumonoultramicroscopicsilicovolcanoconiosis";

		
//		int ageYears = 5;
//		float ageMonths = 8.5f;
		
		System.out.println(greetings);
		System.out.println(convoStarter);
		smartyPants("pneumonoultramicroscopicsilicovolcanoconiosis");
		smartyPants("mississippi");
//		System.out.println(greetings.length());
//		System.out.println(fancyWord.length());
		
//		for (int i= 0; i < 5; i++) {
//			System.out.println(i);
//		}
	}
	private static void smartyPants(String fancyWord) {
//		String fancyWord = "pneumonoultramicroscopicsilicovolcanoconiosis";
		System.out.println("theres a word that reads");
		System.out.println(fancyWord);
		System.out.println("it is " + fancyWord.length() + " letters long");
	}

}
