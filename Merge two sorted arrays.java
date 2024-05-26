class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3=new int[n+m];
       int i,j,k;
        i=j=k=0;
         while(i<m && j<n) {
             if(nums1[i]>nums2[j])
                 nums3[k++]=nums2[j++];
             else
                 nums3[k++]=nums1[i++];
              


  
        } 
        while(i<m)
            nums3[k++]=nums1[i++];
        while(j<n)

            nums3[k++]=nums2[j++];

        
            
        
        for(i=0, k=0;i<n+m;i++){
            
              nums1[k++]=nums3[i];

            }
            
        
    }
public static void main(String[] args){
Scanner input =new Scanner (System.in);
System.out.println("enter the total value for two arrays");
int n=input.nextInt();
int m=input.nextInt();
int[] arr=new int[n];
int[] arr1=new int[m];
for(int i=0;i<n;i++)
    arr[i]=input.nextInt();
for(int i=0;i<m;i++)
    arr1[i]=input.nextInt();
int val=(arr, n, arr1,m);
for(int i=0;i<val;i++)
System.out.println(arr[i]);
} 
}
