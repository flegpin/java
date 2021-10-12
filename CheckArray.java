class CheckArray
{

//Program that checks if n first interger are the same as n last in an array
public static void main (String [] args)
{

int [] Array = {11,15,13,10,45,20,11,15}; // array that matches 

//int [] Array = {11,15,13,10,45,20,11,15,15}; //  Array that doesnt match 

int size=2;
//checks if 2 first integers are thesame as n last integers
int check=0;
int offset= Array.length-size;
	for (int i=0;i<size;i++)
	{
		if(Array[i]!=Array[offset])
			check = 1;

		offset+= 1;
		
	}
if(check==0) // matches
System.out.println("True: The first 2 integers and the last 2 are the same");
else
System.out.println("False: The first 2 integers and the last 2 are not the same");
}

}