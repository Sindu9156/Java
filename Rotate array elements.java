class Solution {
    static void rotate(int[] nums, int k) {
        int n=nums.length,t;
        k=k%n;
        for(int i=0;i<k;i++){
            t=nums[n-1];
            for(int j=n-1;j>0;j--)
                nums[j]=nums[j-1];
            nums[0]=t;
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
