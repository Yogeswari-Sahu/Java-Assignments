package JavaDA4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DA4Prog3 {
	//Initializing Hashmaps
	static Map<String, List<String>> map1 = new HashMap<String, List<String>>();
	static Map<String, Integer> map2 = new HashMap<String, Integer>();
	
	//Defining add function
	public void add_in_map1(String key, List<String> values) 
	{
		map1.put(key, values);
		System.out.println(map1);
	}
	
	//Defining delete function
	public void delete_in_map1(String key) {
		map1.remove(key);
		System.out.println(map1);
	}

	//Defining findFaculties function
	public void findFaculties(String key) {
		if (map1.containsKey(key)) {
			List<Integer> faculties = new ArrayList<Integer>();
			List<String> list = map1.get(key);
			Set<String> keys = map2.keySet();
			for (String l : list) {
				for (String k : keys) {
					if (l.equals(k)) {
						faculties.add(map2.get(k));
					}
				}
			}
			System.out.println(faculties);
		} else {
			System.out.println("No such student");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Yogeswari Sahu 18BCE0928 30-04-2021");
		//Initializing lists with values
		List<String> valSetOne = new ArrayList<String>();
		valSetOne.add("Python");
		valSetOne.add("Maths");
		valSetOne.add("C");
		List<String> valSetTwo = new ArrayList<String>();
		valSetTwo.add("C");
		valSetTwo.add("C++");
		List<String> valSetThree = new ArrayList<String>();
		valSetThree.add("C++");
		valSetThree.add("Physics");
		valSetThree.add("Chemistry");
		
		//Initializing maps with values
		map1.put("A", valSetOne);
		map1.put("B", valSetTwo);
		map1.put("C", valSetThree);
		map2.put("Python", 111);
		map2.put("Maths", 222);
		map2.put("C", 333);
		map2.put("C++", 444);
		map2.put("Physics", 555);
		map2.put("Chemistry", 666);
		map2.put("Digital electronics", 777);
		
		//Iterating over maps and displaying the corresponding values
		System.out.println("Fetching Keys and corresponding [Multiple] Values:");
		for (Map.Entry<String, List<String>> entry1 : map1.entrySet()) {
			String key1 = entry1.getKey();
			List<String> values1 = entry1.getValue();
			System.out.println("Key = " + key1);
			System.out.println("Values = " + values1);
		}
		System.out.println("Fetching Keys and corresponding [Single] Values: \n");
		for (Map.Entry<String, Integer> entry2 : map2.entrySet()) {
			String key2 = entry2.getKey();
			Integer values2 = entry2.getValue();
			System.out.println("Key = " + key2);
			System.out.println("Values = " + values2);
		}
		
		System.out.println("enter choice: 1- add 2- delete 3- faculty ");
	
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
//	Case driven program using Switch based on user's choice 	
		switch (choice) {
			
			case 1:
				DA4Prog3 c1 = new DA4Prog3();
				List<String> val = new ArrayList<String>();
				System.out.println("Add subject:");
				Scanner sc2 = new Scanner(System.in);
				String k1 = sc2.next();
				val.add(k1);
				System.out.println("Add subject:");
				String k2 = sc2.next();
				val.add(k2);
				System.out.println("Add subject:");
				String k3 = sc2.next();
				val.add(k3);
				c1.add_in_map1("D", val);
				break;
				
			case 2:
				DA4Prog3 c2 = new DA4Prog3();
				System.out.println("map you want to delete");
				Scanner sc1 = new Scanner(System.in);
				String k = sc1.next();
				c2.delete_in_map1(k);
				break;
				
			case 3:
				DA4Prog3 c3 = new DA4Prog3();
				System.out.println("Map whose faculty you need");
				Scanner sc3 = new Scanner(System.in);
				String k5 = sc3.next();
				c3.findFaculties(k5);
				break;
				
			default:
				System.out.println("error");
		
		}
	}
}
