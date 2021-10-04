 //calculates the sum of digits making up a number
 
 class Tostring
{
	public static void main (String [] args){
		
		int number = 25378;
		String testS= String.valueOf(number); //transforms the number into string
		int total=0;
		for (int i=0;i<testS.length();i++)
		{
		total = total + Character.getNumericValue(testS.charAt(i));
		}
		System.out.println(total);
	}
	
}