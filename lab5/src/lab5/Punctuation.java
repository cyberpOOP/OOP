package lab5;

public class Punctuation{
	private char last;
	private boolean punc = false;
	private char[] puncs = {'.', ',', '!', '?', ':', ';'};
	private String newWord;
	private StringBuilder newText = new StringBuilder();
	
	public Punctuation() {
		
	}
	
	public void Punc(String word) {

		last = word.charAt(word.length()-1);
		
		for(int i=0; i<puncs.length; i++)
			if(last == puncs[i])
				punc = true;
		
		Letters letter = new Letters();
		
		if(punc)
			newWord = letter.LetterPunc(word, last);
			
		else
			newWord = letter.Letter(word);
		
		newText.append(newWord+" ");
	}
	
	public void GetText() {
		System.out.println(newText.toString());
	}
}