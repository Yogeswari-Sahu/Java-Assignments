package JavaDa1;
import java.lang.*;
import java.util.*;
public class DA1Prog4 {
		public static void addscore(int arr[]) {
			//finding length of array using predefined method
			int n = arr.length;
			int i,num=0;
			//using for loop and random method in Math class
			for(i=0;i<n;i++) {
				arr[i] = (int) (Math.random()*110);
			}
			for(i=0;i<n;i++) {
				num=arr[i];
				int count=0;
				int rem=0;
				while(num!=0) {
				rem = num % 10;
				count++;
				num=num/10;
				}
				//using switch 
					switch(count) {
						case 1:
						System.out.println("arr["+ i + "] = bad");
						break;
						case 2:
						System.out.println("arr["+ i +"] = good");
						break;
						case 3:
						System.out.println("arr["+ i + "] = very good");
						break;
						default:
						System.out.println("not a score");
					}
			}
		}
	public static void main(String[] args) {
		System.out.println("Yogeswari Sahu 18BCE0928 05-03-2021");
		//initializing an array
		int scores[] = new int[11];
		//providing the array as input to the function to perform the operations
		addscore(scores);

	}

}
