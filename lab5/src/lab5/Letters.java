package lab5;

public class Letters {
	
	private char last;
	private String[] letters;
	
	private StringBuilder newWord = new StringBuilder();
	
	public Letters() {
		
	}
	
	public String Letter(String word) {
		
		last = word.charAt(word.length()-1);
		letters = word.split("");
		
		for(int i=0; i<word.length(); i++) {
			
			if(last == word.charAt(i) && i!=word.length()-1)
				letters[i] = "";
			newWord.append(letters[i]);
		}
			
		return newWord.toString();
	}
	
	public String LetterPunc(String word, char punc) {
		
		last = word.charAt(word.length()-2);
		letters = word.split("");
		
		for(int i=0; i<word.length()-2; i++) {
			
			if(last == word.charAt(i))
				letters[i] = "";
			newWord.append(letters[i]);
			
		}
		
		newWord.append(last);
		newWord.append(punc);
		
		return newWord.toString();
	}
	
}
