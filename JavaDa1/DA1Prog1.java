package JavaDa1;
import java.util.*;
public class DA1Prog1 {

	public static void main(String[] args) {
		System.out.println("Yogeswari Sahu 18BCE0928 05-03-2021");
		 Scanner s= new Scanner(System.in);
		 int slow,c;
		 int ans=0;
		 int a[][]=new int[4][];
		 //taking input and performing operations
		 for(int i=0;i<4;i++)
		 {
		 int k=i+1;
		 System.out.println("Enter the no of slow learners in the batch"+k+":");
		 slow=s.nextInt();
		 if(slow%4==0)
		 c=slow/4;
		 else
		 c=slow/4+1;
		 a[i]=new int[c];
		 for(int j=0;j<c;j++)
		 {
		 if(slow>4)
		 {
		 a[i][j]=4;
		 slow=slow-4;
		 }
		 else
		 {
		 a[i][j]=slow;
		 slow=0;
		 }
		 }
		 }
		 //display of jagged array
		 System.out.println("\nJagged array:");
		 for(int i=0;i<4;i++)
		 {
		 for(int n:a[i])
		 {
		 System.out.print(n);
		 //checking if tutors have 4 students each 
		 if(n==4)
		 ans++;
		 }
		 System.out.println();
		 }
		 //printing final result
		 System.out.println("\n\nThe number of Tutors with 4 students are(ans) = "+ans);

	}

}
