package week1.day1;

public class FibbinacciSeries 
{
	public static void main(String[] args) 
	{
		int firstnum = 0;
		int secondnum = 1;
		System.out.println(" fibbinacci series : " + firstnum + " ,");
		for (int i = 1; secondnum <=56 ; i++) 
		{
			System.out.println( secondnum + ",");
			int sum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = sum;
		}
		
	}
}


 


