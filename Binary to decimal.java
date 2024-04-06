import java.util.*;
public class BinaryToDecimal
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);    
		System.out.print("Enter a binary number : ");
		int b = input.nextInt();  
		int d = 0;	
		int n = 0;  
		while(b> 0)
		{
			int t= b%10; 
			d+= t*Math.pow(2, n);  
			b = b/10;  
			n++;  
		}
		System.out.println("Decimal number is "+d); 
               
	}
}
