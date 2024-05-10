import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of values : ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the values: ");
        for(int a=0;a<n;a++)   
             arr[a]=sc.nextInt();
      
        int[] visited=new int[n];

    for(int i=0; i<n; i++){

       if(visited[i]==0){
          int count = 1;
          for(int j=i+1; j<n; j++){
             if(arr[i]==arr[j]){
                count++;
                visited[j]=1;
             }
          }
         if(count==1)
          System.out.println(arr[i]);
       }}
   
  
}
