class Solution {

    public int removeDuplicates(int[] nums) {

        int count=0,t=nums.length,l,f;

        for(int i=0;i<t;i++){

            count=f=0;

            for(int j=i+1;j<t;j++){

                if(nums[i]==nums[j]) 

                    count++;

} 

  if(count>1){

                    

      

l=i+2;      

      

for(int k=i+count+1;k<t;k++)

     nums[l++]=nums[k];

              

      t=t-count+1;    

      } 

           

           

                 

           

       } 

        return t;

    }


}
