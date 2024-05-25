class Solution {
    static void rotate(int[] nums, int k) {
        int n=nums.length,t;
        k=k%n;
        for(int i=0;i<k;i++){
            t=nums[0];
            for(int j=1;j<n;j++)
                nums[j-1]=nums[j];
            nums[n-1]=t;
       } 
            
    }
public static void main(String[] args){
Scanner input =new Scanner (System.in);
System.out.println("enter the total value");
int n=input.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
    arr[i]=input.nextInt();
System.out.println("enter the rotate value");
int val=input.nextInt();
rotate(arr,val);

}
