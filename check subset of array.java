class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
       int flag;
        for(int i=0;i<m;i++){
            flag=0;
            for(int j=0;j<n;j++){
                if(a1[j]==a2[i]){
                   a1[j]=0;
                   flag=1;
                   break;
                } 
            }
            if(flag==0)
               return "No";
        }
        return "Yes";
        
    }
}
