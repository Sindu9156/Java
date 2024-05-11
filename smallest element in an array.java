import java.util.*;

public class Main
{
public static void main(String args[])
{

int arr[] = new int[10];
Scanner input =new Scanner (System.in)System.out.println("enter the total value")
for(int i=0;i<n;i++)
    arr[i]=input.nextInt();

int min = arr[0];

for(int i=0; i<arr.length; i++)
{
if(min > arr[i])
{
min= arr[i];
}

}

System.out.print(min); 
}
}
