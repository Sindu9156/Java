import java.util.*;
public class Main 
{	
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");				
		int number = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i <n ; i++)
		{
			if(n % i == 0)
				sum = sum + i;
		}
		
		if(sum == n)
			System.out.println("Perfect Number");
		else
			System.out.println("Not an Perfect Number");
										
	}
}
