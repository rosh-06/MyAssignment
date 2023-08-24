package week1.day1;

public class IsPrime 
{
public static void main(String[] args) 
{
	int a = 12;
	boolean isAnswer = true;
	 for ( int i = 2; i < a ; i++)
	 { 
		 if (a %i==0)
		 {
			 isAnswer = false;
			 break;
		 }
	 }
	if(isAnswer && a >1)
	{
		System.out.println( a + " is a Prime Number.");
	}else 
	{
		System.out.println( a + " is not a Prime Number.");
	}
	 
}
}
