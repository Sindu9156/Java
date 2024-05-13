import java.util.*;

public class Main
{
public static void main(String args[])
{

int arr[] = new int[10];
int j;
Scanner input =new Scanner (System.in)System.out.println("enter the total value")
for(int i=0;i<n;i++)
    arr[i]=input.nextInt();

int min = arr[0];

for(int i=0; i<arr.length; i++)
{
if(min < arr[i])
{
min = arr[i];
j=i;
}
} 
if(j!=0)
min=arr[0];
else
min=arr[1];

for(int i=0; i<arr.length; i++)
{
if(min < arr[i] && j!=i)
{
min= arr[i];
} 
}

System.out.print(min); 
}
}
