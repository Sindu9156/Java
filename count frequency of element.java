class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        int j=1,count;
        int[] arr1=new int[N];
        
        while(j<=N){
             count=0;
        for(int i=0;i<N;i++){
            

            if(arr[i]==j) 
               count++;
        }
       // System.out.println(count);
        arr1[j-1]=count;
        j++;
        }
        for(int i=0;i<N;i++){
            arr[i]=arr1[i];
        } 
        
    }
}
