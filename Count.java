import java.util.regex.Pattern;
import java.util.regex.Matcher;

//program that counts the letters, numbers and space in a sentence

class Count{
	public static void main (String [] args)
	{
		String text = " This the 1 sentence where we have 123 numbers and then 3456 some more numbers ";
		int countL =0, countN=0, countS=0 ;
	//using the regex we have to set up 3 different parameters one for the letters,
	//one for the numbers and one for the blank space
	
	//pattern and matcher for letters
	Pattern letters = Pattern.compile("[a-z]");
	Matcher lettersM=letters.matcher(text);
	while(lettersM.find())
		countL++;
	
	//pattern and matcher for numbers
	Pattern numbers = Pattern.compile("[0-9]");
	Matcher numbersM=numbers.matcher(text);
	while(numbersM.find())
		countN++;
	//pattern and matcher  for blank spaces
	Pattern space = Pattern.compile("[\s]");
	Matcher spaceM=space.matcher(text);
	while(spaceM.find())
		countS++;
		
	System.out.println("Leters: "+countL+ " Numbers: "+countN+" Spaces " +countS );
	}
	
}