package JavaDA2;
import java.util.Scanner;

class degreecelfar{
	public void finalize(){System.out.println("object is garbage collected");}  
	double celtemp;double fartemp;
	 degreecelfar(double cel,double far){
		 this.celtemp=cel;
		 this.fartemp=far;
	 }
	}
class cel {
	public void finalize(){System.out.println("object is garbage collected");}  
	double deg;
	 cel(double deg){
		 this.deg=deg;
	 }
	 public static double input() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the degree in celsius to be converted to farhenheit:");
		 double t = sc.nextDouble();
		 return t;
	 }
}
class far{
	public void finalize(){System.out.println("object is garbage collected");}  
	double deg;
	 far(double deg){
		 this.deg=deg;
	 }
	 public static double input() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the degree in farhenheit to be converted to celsius:");
		 double t = sc.nextDouble();
		 return t;
	 }
}
	
class conv{
	 double deg,deg1,deg2;
	 conv(cel obj){
		 deg= (obj.deg * 9/5) + 32;
	 }
	 conv(far obj){
		 deg=(obj.deg-32) * 5/9;
	 }
	 conv(degreecelfar obj){
		 deg1=(obj.celtemp* 9/5) + 32;
		 deg2=(obj.fartemp-32) * 5/9;
	 }
	 

}
public class DA2Prog4{
	
	public static void main (String args[]){	
		System.out.println("Yogeswari Sahu 18BCE0928 26-03-2021");
		//Using cel class
		double t1=cel.input();
		cel c=new cel(t1);
		//using far class
		double t2=far.input();
		far f=new far(t2);
		//Using degreecelfar class
		degreecelfar t=new degreecelfar(t1,t2);
		System.out.println();
		System.out.println("USING cel CLASS:");
		System.out.println("Convertion of celsius to farhenheit:"+String.format("%.2f",(new conv(c).deg)));
		System.out.println();
		System.out.println("USING far CLASS:");
		System.out.println("Convertion of farhenheit to celsius:"+String.format("%.2f",(new conv(f).deg)));
		System.out.println();
		System.out.println("USING degreecelfar CLASS:");
		System.out.println("Convertion of celsius to farhenheit:"+String.format("%.2f",(new conv(t).deg1))+"\n"+"Convertion of farhenheit to celsius:"+String.format("%.2f",(new conv(t).deg2)));
		//Doing Garbage collection
		c=null;
		f=null;
		t=null;
		System.gc();  
		//defining sort function
	}
}

