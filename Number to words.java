import java.util.*;
class HelloWorld {
    
        static void numtowords(char num[]){

int l=num.length,c=0;
String[] one={"zero","one","two","three","four","five","six","seven","eight","nine"};
String[] ten={"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
String[] more={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
String[] m={"hundred","thousand"};
if(l==0)
   System.out.println("empty number");
if(l>4)
   System.out.println("the number is more than 4 digits");
 if(l==1){
 System.out.print(one[num[0]-'0'] +" ");
 
 }
 while(c<=l){
 if(l>=3){
 if(num[c]-'0'!=0){
 System.out.print(one[num[c]-'0']+" ");
 System.out.print(m[l-3]+" ");
 
 }
 l--; 
 }
 else{
 if(num[c]-'0'==1)
    System.out.print(ten[(num[c]-'0')+(num[c+1]-'0')]);
else if(num[c]-'0'==2 && num[c+1]-'0'==0)        System.out.print("twenty ");
else {
if(num[c]-'0'>0)
   System.out.print(more[num[c]-'0'] +" ");
else
   System.out.print("");
   
c++;
if(num[c]-'0'!=0)
   System.out.print(one[num[c]-'0']+" ");
}
 
 }
 c++;
 }
 
 
 }
 public static void main(String[] args) {
     
 
   
   String n;
   Scanner s=new Scanner(System.in);
   System.out.println("enter the number");
   n=s.nextLine();
   numtowords(n.toCharArray());
    }
}
