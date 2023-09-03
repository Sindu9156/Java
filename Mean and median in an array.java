import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int n,sum=0,mean,temp,median;
Scanner s=new Scanner(System.in);
System.out.println("enter the value");
n=s.nextInt();
int[] a=new int[n];
System.out.println("enter the values");
for(int i=0;i<n;i++){
    a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
    if(a[i]>a[j]){
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
}
for(int i=0;i<n;i++){
    sum+=a[i];
}
mean=sum/n;
System.out.println("the mean value is "+mean);
if(n%2!=0){
    median=a[n/2];
System.out.println("the median value is "+median);
}
else{
median=(a[n/2]+a[(n/2)-1])/2;
System.out.println("the median value is "+median);
    
}
    
    }
}
