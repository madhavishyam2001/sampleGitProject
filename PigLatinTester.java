public class PigLatinTester {
	public static void main(String args[]) {
		//Scanner sc = new Scanner(System.in);
		String yn = "y";
		
		while (yn.equals("y") || yn.equals("Y")) {
			System.out.println("Enter the word to be translated: ");
			//String text = sc.nextLine();
			String text = "BharataaaShyam";
			Translator pigLatin = new Translator(text);
			
			if (pigLatin.firstVowelPos() == -1) {
				System.out.println("There's no vowel in the word you entered");
			}
			System.out.println(pigLatin.firstVowelPos());
			System.out.println(pigLatin.Translate(pigLatin.firstVowelPos()));
			
			System.out.println("\n\nTranslating using a static method:");
			System.out.println(Translator.piggy(text));
			
			
			System.out.println("Do you want to continue? (y/n)");
			yn = "n" ; 
			System.out.println("Bye..A big ... Thank You!");
			// sc.nextLine();
		}
		
	}
}
