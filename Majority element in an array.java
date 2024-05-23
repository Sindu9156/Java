class Solution {
    static int majorityElement(int[] nums) {
       int max=0,count,index=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]&&nums[i]!=-1){
                    count++;
                    nums[j]=-1;
                    }}
            if(max<count) {
                max=count;
                index=i;
               } 
                
            }
        return nums[index];
    }
public static void main(String[] args){
Scanner input =new Scanner (System.in);
System.out.println("enter the total value");
int n=input.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
    arr[i]=input.nextInt();
int val=majorityElement(arr);
System.out.println(val);
}
} 
