package JavaDa1;
import java.util.*;
import java.lang.StrictMath;
//class hash is coded below that uses rotation moving the least significant digit to the most significant bit position 
class hash
{
static double rotate(int n)
 {
int l=String.valueOf(n).length();
int i;
System.out.println("Length is "+l);
double k=0;
double s=0;
for(i=0;i<l;i++)
 {
 k=((int) (n/(Math.pow(10,i)))%10);
 s=s+k*(Math.pow(10,((i+l-1)%l)));
 }
 s=(int) ((s/(Math.pow(10,l))+s)%(Math.pow(10,l)));
return s;
 }
int fold(double n)
{
 int l=String.valueOf(n).length();
 int i,x=0;
 double k=n;
 double s=0;
 int a[]=new int[l/2];
 for(i=l-2;i>=0;i=i-2)
 {
 a[x]= (int) (n/(Math.pow(10,i)));
 s=s+a[x];
 System.out.println(a[x]);
 x++;
 }
 s=s%100;
 return (int) s;}
}

public class DA1Prog2 {

	public static void main(String[] args) {
		System.out.println("Yogeswari Sahu 18BCE0928 05-03-2021");
		//creating object of hash class
		hash h=new hash();
		 System.out.println("Enter a number:");
		 Scanner t=new Scanner(System.in);
		 int n=t.nextInt();
		 //after rotating by calling rotate method
		 double s=hash.rotate(n);
		 System.out.println("Value after rotation is:"+s);
		 int s1=h.fold(s);
		 System.out.println("Sum is:"+s1);

	}

}
