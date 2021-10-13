import java.util.Scanner;


class Modulo // class that simulates the modulo operation using other operators
{
public static void main (String[] args)
{
	Scanner obj = new Scanner(System.in);
	System.out.println("Please enter the first number\n");
	int number1= obj.nextInt();
	System.out.println("Please enter the second number\n");
	int number2= obj.nextInt();
//computing number1 modulo number2
//we start by dividing the first number by the second
double div= number1/number2;

//getting the integer part 
int integer=  (int) div;

// then we multiply the second by the integer 
int multi= number2*integer;
//then we substract the result of that multiplication from the first number 
int result =  number1-multi;

System.out.println("The result is: " + result + " \n");

}

}