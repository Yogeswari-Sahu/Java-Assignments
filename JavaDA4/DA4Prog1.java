package JavaDA4;

import java.io.*;
import java.text.*;
import java.util.*;
//Defining a class Donor with data types
class Donor{
	 public Donor(String name, String age, String address, String number, String bg, String date) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.number = number;
		this.bg = bg;
		this.date = date;
	}
	public String name;
	public String age;
	public String address;
	public String number;
	public String bg;
	public String date;
}

public class DA4Prog1 {
	public static void main(String[] args) throws IOException, ParseException {
		System.out.println("Yogeswari Sahu 18BCE0928 30-04-2021");
		//Taking Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		//Initializing an ArrayList
		ArrayList<Donor> arr=new ArrayList<Donor>();
		
		String filename = "18BCE0928.txt";
		String a ;
		 
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Name : ");
			String name = sc.next();
			System.out.println("Enter Age : ");
			String age = sc.next();
			System.out.println("Enter Address : ");
			String address = sc.next();
			System.out.println("Enter Number : ");
			String number = sc.next();
			System.out.println("Enter Blood Group : ");
			String bg = sc.next();
			System.out.println("Enter Date DD/MM/yyyy format: ");
			String date = sc.next();
			arr.add(new Donor(name,age,address,number,bg,date)) ;
		}
		BufferedWriter bf = new BufferedWriter(new FileWriter("18BCE0928.txt"));
		for (int i = 0; i < n; i++) {
			bf.write(arr.get(i).name + '\n');
			bf.write(arr.get(i).age + '\n');
			bf.write(arr.get(i).address + '\n');
			bf.write(arr.get(i).number + '\n');
			bf.write(arr.get(i).bg + '\n');
			bf.write(arr.get(i).date + '\n');
			System.out.println("Details Written");
		}
		bf.close();
		
		BufferedReader br = new BufferedReader(new FileReader(filename));
		System.out.println("file opened");
		try {
			while ((a = br.readLine()) != null) {
				String[] data = new String[6];
				for (int i = 0; i < 6; i++) {
					data[i] = a;
					a = br.readLine();
				}
				String dat = data[5];
				Date d = new SimpleDateFormat("dd/MM/yyyy").parse(dat);
				Date now = new Date();
				long difference = (now.getTime() - d.getTime()) / 86400000;
				long month = difference / 30;
				System.out.println(month);
				if (data[4].equals("A+ve") && Math.abs(month) >= 6) {
					System.out.println("Details whose blood group is ‘A+ve’ and had not donated for the recent six months. ");
					System.out.println("Name:" + data[0]);
					System.out.println("Age:" + data[1]);
					System.out.println("Address:" + data[2]);
					System.out.println("Number:" + data[3]);
					System.out.println("Blood Group:" + data[4]);
					System.out.println("Date:" + data[5]);
				}
			}
			br.close();
		} catch (FileNotFoundException e) 
		{
			System.err.println("Oops! Please check for the presence of file in the path specified.");
		}
	}
}