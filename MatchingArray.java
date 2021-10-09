import java.lang.*;
class MatchingArray
{

public static void main (String args[] )
{
// first array with some integer
long startTime = System.nanoTime(); 

int[] Array1={0,1,2,13,4,5,6,7,8,9,11,21,18};

// second array with some integer

int[] Array2={11,11,21,13,14,15,6,17,18,19};

	for(int i=0; i<Array1.length;i++)
	{
		for(int j=0; j<Array2.length;j++)
		{
			if (Array1[i]==Array2[j])
				System.out.println("Index: "+ i+ " of Array1 and Index: " +j+ " both contain "+ Array1[i]+" \n"); 
		}
	
	//System.out.println(Array1[i]);
	}
	
	long endtime = System.nanoTime() - startTime;
	System.out.println("Estimated time (in nanoseconds) to get the first 10 natural numbers: "+endtime);

}


}