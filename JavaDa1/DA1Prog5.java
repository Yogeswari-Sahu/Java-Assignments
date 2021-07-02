package JavaDa1;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class DA1Prog5 {

	public static void main(String[] args) {
		System.out.println("Yogeswari Sahu 18BCE0928 05-03-2021");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number from 1-5 ");
		System.out.println("1 - To check if your name is a palindrome");
		System.out.println("2- To see your name in ascending order (letters arranged alphabetically)");
		System.out.println("3- To check if name and surname are anagrams");
		System.out.println("4- To sort names in ascending order (alphabetically)");
		System.out.println("5- To sort names in descending order (alphabetically)");
		int x=sc.nextInt();
		switch(x) {
		//To check if your name is a palindrome
		case 1:
		{
			System.out.println("Enter the string (your name)");
			String s=sc.next();
			s=s.toUpperCase();
			int i=0;
			 int j=s.length()-1;
			 int ans=0;
			 while(i<j){
			 if(s.charAt(i++)==s.charAt(j--))continue;
			 else {
			 ans=-1;
			 break;
			 }
			 }
			 System.out.println((ans==-1)?"NO, Not a palindrome":"YES, its a palindrome");
			 sc.close();
			 break;
		}
		//To see your name in ascending order (letters arranged alphabetically)
		case 2:
		{
			System.out.println("Enter the string (your name)");
			String s=sc.next();
			s=s.toLowerCase();
			char []arr=s.toCharArray();
			 Arrays.sort(arr);
			 System.out.println("Your name in ascending order is:");
			 String str=new String(arr);
//			 System.out.println(Arrays.toString(arr));		
			System.out.println(str);
			 sc.close();
			 break;
		}
		//To check if name and surname are anagrams 
		case 3:
			{
				System.out.println("Enter the string (your name)");
				String ana=sc.next();
				ana=ana.toLowerCase();
				String ana2=sc.next();
				ana2=ana2.toLowerCase();
				int []arr=new int[100];

				 for(int i=0;i<ana.length();i++){
				 if(ana.charAt(i)!=' ')
				 {
				 // System.out.println("adding at "+((int)ana.charAt(i)-65));
				 arr[ana.charAt(i)-65]+=1;
				 }
				 }
				 for(int i=0;i<ana2.length();i++){
					 if(ana2.charAt(i)!=' ')
					 {
					 // System.out.println("adding at "+((int)ana.charAt(i)-65));
						 arr[ana2.charAt(i)-65]+=1;
					 }
					 }
				 // if any place its not multiple of two then its not anagram
				 int ans=0;
				 for(int i=0;i<arr.length;i++){
				 if(arr[i]%2!=0){
				 ans=-1;
				 break;
				 }else continue;
				 }
				 // System.out.println(Arrays.toString(arr));
			 
			 System.out.println((ans==-1)?"NO, They aren't anagrams":"YES, They are anagrams");
			 sc.close();
			 break;
		}
		//To sort names in ascending order (alphabetically)
		case 4:{
			System.out.println("Enter the strings (names of your friends and yours)");
			ArrayList<String> arr=new ArrayList<>();
			while(sc.hasNext()){
			arr.add(sc.next());
			}
			Collections.sort(arr);
			System.out.println("Names in ascending order are:");
			System.out.println(arr);
			sc.close();
			break;
		}
		//To sort names in descending order (alphabetically)
		case 5:{
			System.out.println("Enter the strings (names of your friends and yours)");
			ArrayList<String> arr=new ArrayList<>();
			while(sc.hasNext()){
			arr.add(sc.next());
			}
			Collections.sort(arr,Collections.reverseOrder());
			System.out.println("Names in descending order are:");
			System.out.println(arr);
			sc.close();
			break;
		}
		default:
			System.out.println("Wrong number entered ");
		}
		
	}

}
