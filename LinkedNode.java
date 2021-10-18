import java.util.*;

public class LinkedNode // program that reverses a linked list 
{
	static node head; // points towards the first element of the list
	
	enum colors { // an enum that contains the values to be inserted
    White,
    Green,
    Yellow,
	Orange,
	Blue,
	Red,
	Black
  }
	public static class node {
		 
		String data;
		node next = null; 
		
		public node( String text)
	{
		 data = text;
	}	
		}

public static void main ( String[] args )
{

	//System.out.println( headTemp.data);
	node headTemp = new node("head");
	head = headTemp; 	//keep that position
	for(colors myvar : colors.values()) // for each color
	{
		int i=0;
		
		String varr = myvar.name();
		node temp = new node(varr); // we create  new node 
		
		if(headTemp.next == null)
		headTemp.next=temp;
		else{
			do
			// and look for where to insert it, we parcour the list 
			{
				headTemp= headTemp.next;
			}
			while(headTemp.next != null);
			//found the insertion spot
			headTemp.next=temp;
			}
	}
	//printing the content of the nodes
	node temp2 = head;
	do
	{
		System.out.println(temp2.data);
		temp2=temp2.next;
	}
	while(temp2.next != null);
}

}