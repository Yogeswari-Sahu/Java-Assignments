package JavaDa1;
import java.util.*;
public class DA1Prog3 {

	public static void main(String[] args) {
		System.out.println("Yogeswari Sahu 18BCE0928 05-03-2021");
		Scanner s=new Scanner(System.in);
		String e1[] = new String[5];
		String e2[] = new String[5];
		String e3[] = new String[5];
		String duplicates[] = new String[5];
		int i=0,j=0,k=0,p=0;
		//taking registration numbers as input 
		System.out.println("Enter the Registration numbers for Event 1");
		for(i=0;i<e1.length;i++) {
		e1[i]=s.next();
		}
		System.out.println("Enter the Registration numbers for Event 2");
		for(j=0;j<e2.length;j++) {
		e2[j]=s.next();
		}
		System.out.println("Enter the Registration numbers for Event 3");
		for(k=0;k<e3.length;k++) {
		e3[k]=s.next();
		}
		//printing error message if there are duplicates in more than 2 arrays
		for(i=0;i<e1.length;i++) {
			for(j=0;j<e2.length;j++) {
				for(k=0,p=0;k<e3.length && p<duplicates.length;k++) {
					if(e1[i].matches(e2[j])) {
						if(e1[i].matches(e3[k])) {
							duplicates[p]=e1[i];
							System.out.println("Reg Number - " +duplicates[p] + " : You cannot register for more than 2 events!" );
							p++;
						}
					}
				}
			}
		}
	}

}
