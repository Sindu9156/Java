class Solution {
    static int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val)
                nums[k++]=nums[i];
            }
return k;
    }
public static void main(String[] args){
Scanner input =new Scanner (System.in);
System.out.println("enter the total value");
int n=input.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
    arr[i]=input.nextInt();
System.out.println("enter the  value to remove ");
int val=input.nextInt();
int l=removeElement(arr,val);
for(int i=0;i<l;i++)
System.out.println(arr[i]);
} 
}
