public class Translator {
	private static String text;
	public Translator(String word) {
		text = word;
	}
	// Finding the index of the first vowel in the word 
	public int firstVowelPos() {
		String modified = text.toLowerCase(); // Converting input text to lowercase
		int k = 0 ; int i = 0;int y = 0;
		for (i = 0; i < text.length(); i++) {
			if (modified.charAt(i) == 'a' || modified.charAt(i) == 'e' || modified.charAt(i) == 'i' || modified.charAt(i) == 'o' || modified.charAt(i) == 'u' || modified.charAt(i) == 'A' || modified.charAt(i) == 'E' || modified.charAt(i) == 'I' || modified.charAt(i) == 'O' || modified.charAt(i) == 'U') {
				y = 1;
				return i;
				//Checking each character in the String and return the index if it's a vowel
			}
		}
		if ( y != 1) {
			for (int j = 0; j<text.length(); j++) {
				if (modified.charAt(j) != 'a' && modified.charAt(j) != 'e' && modified.charAt(j) != 'i' && modified.charAt(j) != 'o' && modified.charAt(j) != 'u' && modified.charAt(j) != 'A' && modified.charAt(j) != 'E' && modified.charAt(j) != 'I' && modified.charAt(j) != 'O' && modified.charAt(j) != 'U' && modified.charAt(j) != 'y' && modified.charAt(j) != 'Y') {
					k = -1;
				}
				else if (modified.charAt(j) != 'a' && modified.charAt(j) != 'e' && modified.charAt(j) != 'i' && modified.charAt(j) != 'o' && modified.charAt(j) != 'u' && modified.charAt(j) != 'A' && modified.charAt(j) != 'E' && modified.charAt(j) != 'I' && modified.charAt(j) != 'O' && modified.charAt(j) != 'U' && (modified.charAt(j) == 'y' || modified.charAt(j) == 'Y')) {
					return j;
				}
			}
		}
		if ( k == -1) {
			return k;
		}
		else {
			return i;
		}
	}
	public String Translate(int i) {
		String finalWord = "";
		if (i > 0) {
			finalWord = text.substring(i)+ "-" + text.substring(0, i) +"ay";
		}
		if (i == -1) {
			finalWord = text +"-ay";
		}
		if (i == 0) {
			finalWord = text;
		}
		return finalWord;
	}
	
	// Static method
	public static String piggy(String text) {
		String modified = text.toLowerCase();
		int i = 0, x = 0, y = 0;
		String finalWord = "";
		for (i = 0; i < text.length(); i++) {
			if (modified.charAt(i) == 'a' || modified.charAt(i) == 'e' || modified.charAt(i) == 'i' || modified.charAt(i) == 'o' || modified.charAt(i) == 'u' || modified.charAt(i) == 'A' || modified.charAt(i) == 'E' || modified.charAt(i) == 'I' || modified.charAt(i) == 'O' || modified.charAt(i) == 'U') {
				y = 1;
				x = i;
				break;
				//Checking each character in the String and return the index if it's a vowel
			}
		}
		if ( y != 1) {
			for (int j = 0; j<text.length(); j++) {
				if (modified.charAt(j) != 'a' && modified.charAt(j) != 'e' && modified.charAt(j) != 'i' && modified.charAt(j) != 'o' && modified.charAt(j) != 'u' && modified.charAt(j) != 'A' && modified.charAt(j) != 'E' && modified.charAt(j) != 'I' && modified.charAt(j) != 'O' && modified.charAt(j) != 'U' && modified.charAt(j) != 'y' && modified.charAt(j) != 'Y') {
					x = -1;
				}
				else if (modified.charAt(j) != 'a' && modified.charAt(j) != 'e' && modified.charAt(j) != 'i' && modified.charAt(j) != 'o' && modified.charAt(j) != 'u' && modified.charAt(j) != 'A' && modified.charAt(j) != 'E' && modified.charAt(j) != 'I' && modified.charAt(j) != 'O' && modified.charAt(j) != 'U' && (modified.charAt(j) == 'y' || modified.charAt(j) == 'Y')) {
					x = j;
					break;
				}
			}
		}
		if (x > 0) {
			finalWord = text.substring(x)+ "-" + text.substring(0, x) +"ay";
		}
		if (x == -1) {
			finalWord = text +"-ay";
		}
		if (x == 0) {
			finalWord = text;
		}
		return finalWord;
	}
	
	public static String Challenge(String input) {
		return null;
	}
}
