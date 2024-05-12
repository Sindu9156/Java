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

int max = arr[0];

for(int i=0; i<arr.length; i++)
{
if(max < arr[i])
{
max = arr[i];
j=i;
}
} 
if(j!=0)
max=arr[0];
else
max=arr[1];

for(int i=0; i<arr.length; i++)
{
if(max < arr[i] && j!=i)
{
max = arr[i];
} 
}

System.out.print(max); 
}
}
