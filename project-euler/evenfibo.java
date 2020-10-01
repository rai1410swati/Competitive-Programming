/*
Problem 2:
	Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
	
	1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	
	By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
	
	https://projecteuler.net/problem=2
 */

public class evenfibo
{

	public static void main(String[] args) 
	{
		
		int a=1,b=2,sum=0,ind=1;
		for(int i=0;a<4000000;i++)
		{
			if(ind==i)
			{
				sum=sum+a;
				ind=ind+3;
			}
			int c=a+b;
			a=b;
			b=c;
		}
		System.out.println(sum);
	}
	

}