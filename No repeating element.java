class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        int flag;
       for(int i=0;i<n;i++){
           flag=0;
           for(int j=0;j<n;j++){
               if(arr[i]==arr[j]&i!=j){
                  flag=1;
                  break;
               } 
                  
           }
           if(flag!=1)
              return arr[i];
           
               
       }
       return 0;
    }  
    
}
