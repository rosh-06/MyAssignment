package week1.day1;
// Problem 1
public class Day1Assignment 
{
	public void problem1()
	{
	int number = -40;
	if (number <0) 
	{
		System.out.println("The number is Negative");
	}else 
	{
		System.out.println("The number is Positive");
	}
if (number <0)
{
number = -number;
System.out.println("The positive number is:"+ number);
}
	}

  //Problem 2
public void  Problem2()
{
int a= 6;
if (a >0)
{
System.out.println("The number is Positive");	
}
else if(a<0)
{
	System.out.println("The number is Negative");
}else 
{
	System.out.println("The number is neither positive nor negative");
}

}

public static void main(String[] args) 
{
	Day1Assignment obj = new Day1Assignment();
	obj.problem1();
	obj.Problem2();
}
}

