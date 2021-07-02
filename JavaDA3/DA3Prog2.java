package JavaDA3;
import java.util.Random;
class java{
	void choose() throws sameballcolourexception
	{
		Random t = new Random();
		int i,red=0,green=0,blue=0,yellow=0;
		for(i=1;i<=10;i++)
		{
			int ball=t.nextInt(4);
			if(ball==0)
				red++; 
			else if(ball==1)
				green++;
			else if(ball==2)
				blue++;
			else if(ball==3)
				yellow++;
		}
		System.out.println("\nBalls picked: \nred:" +red+ "\ngreen:" +green+ "\nblue:" +blue+ "\nyellow:"+yellow);
		if(red>3 || green>3 || blue>3 || yellow>3)
			throw new sameballcolourexception("sameballcolourexception");
	}
}

class sameballcolourexception extends Exception
{
	 sameballcolourexception(String s)
	 {
		 super(s);
	 }
} 

public class DA3Prog2 {

	public static void main(String[] args) {
		System.out.println("Yogeswari Sahu 18BCE0928 06-04-2021");
		try
		{
			java ch=new java();
			ch.choose();
		}
		catch(Exception e) 
		{
			System.out.println("Printing the exception:");
			System.out.println(e);
		} 

	}

}
