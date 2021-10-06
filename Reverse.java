class ReverseString
{
	//function to reverse a string 
	public static void main (String [] args){
	
	String text = "Ok so this string reversed is \n";
	int taille = text.length();
	String textR ="";
	
	char [] textr = text.toCharArray();
	for(int i=taille-1;i>=0;i--)
	{
		String lettre = Character.toString(textr[i]);
		textR=textR.concat(lettre);
	}
	System.out.println(textR + " " );
	}
}