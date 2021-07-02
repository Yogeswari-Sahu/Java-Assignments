import java.sql.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		 System.out.println("Yogeswari Sahu 18BCE0928 10-05-2021");
		 Scanner sc=new Scanner(System.in);
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
			System.out.println("Connection established");
			//here db is the database name, root is the user name and root is the password
			System.out.println("Enter the choice:");
			System.out.println("1- get column properties");
			System.out.println("2-insert values into table");
			System.out.println("3-deleting values");
			System.out.println("4-showing all records");
			System.out.println("5-showing values below the particular price");
			int choice = sc.nextInt();
switch (choice) {
			
			case 1:
				try {
					
			        Statement st = con.createStatement();
			        ResultSet rs = st.executeQuery("select * from books");
					ResultSetMetaData rsmd = rs.getMetaData();
					int columnCount = rsmd.getColumnCount();
					System.out.println("Number of Columns: "+columnCount);
					for(int i=1;i<=columnCount;i++){
						System.out.println("Column Name : "+rsmd.getColumnName(i)+", Column Type: "+rsmd.getColumnType(i));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} 
				break;
				
			case 2:
				try {
					sc.nextLine();
					//input Book ID
					System.out.println("Enter Book ID: ");
					String id=sc.nextLine();
					//input Author name
					System.out.println("Enter Title of Book : ");
					String title=sc.nextLine();
					//input Title of Book
					System.out.println("Enter Author Name : ");
					String author=sc.nextLine();
					//input Price
					System.out.println("Enter Price: ");
					String price=sc.nextLine();
					//input Quantity
					System.out.println("Enter Quantity: ");
					String qty=sc.nextLine();

					//creating object of PreparedStatement class and passing parameter (?)
					PreparedStatement smt=con.prepareStatement("insert into books values(?,?,?,?,?)");

					// set the values
					smt.setInt(1, Integer.parseInt(id));
					smt.setString(2, title);
					smt.setString(3, author);
					smt.setDouble(4, Double.parseDouble(price));
					smt.setInt(5, Integer.parseInt(qty));

					//to execute update
					smt.executeUpdate();
					System.out.println("Record Inserted....");
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 3:
				try{
					Statement stmt=con.createStatement();
					//input a particular Book id of which we want to delete record
					System.out.print("Enter Book ID:");
					String bid=sc.next();

					//query to take data of a particular record from table books
					String q="Select * from books where id='"+bid+"'";

					//to execute query
					ResultSet rs=stmt.executeQuery(q);

					if(rs.next())
					{
						//to show the data
						System.out.println("Book id: "+rs.getInt(1));
						System.out.println("Book title :"+rs.getString(2));
						System.out.println("Book author :"+rs.getString(3));
						System.out.println("Book price:"+rs.getDouble(4));
						System.out.println("Sure To Delete Above Record Yes/No?");
						String ch=sc.next();
						if(ch.equalsIgnoreCase("yes"))
						{
							//query to delete data of a particular record from table books
							q="delete from books where id='"+bid+"'";
							//to execute query
							stmt.executeUpdate(q);
							System.out.println("Record Deleted...");
						}
					}
					else
					{
						System.out.println("Record Not Found...");
					}
				}
				catch(Exception e){
					System.out.println(e);
				}
				break;
				
			case 4:
				try {
					Statement stmt = con.createStatement();
					String strSelect = "select * from books";
					ResultSet rs = stmt.executeQuery(strSelect);
					System.out.println("The records selected are:");
			        int rowCount = 0;
			        System.out.println("Book id\tBook title\t\tBook author\tBook price\tBook quantity");
			        while(rs.next()) {   // Repeatedly process each row
							System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4)+"\t\t"+rs.getInt(5));
			            ++rowCount;
			         }
			         System.out.println("Total number of records = " + rowCount);
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 5:
				try {
					System.out.print("Enter Price: ");
					String price=sc.next();
					PreparedStatement smt=con.prepareStatement("select * from books where price >= ?");
					smt.setDouble(1, Double.parseDouble(price));
					ResultSet rs = smt.executeQuery();
					System.out.println("The records selected are:");
			        int rowCount = 0;
			        while(rs.next()) {   // Repeatedly process each row
							System.out.println("Book id: "+rs.getInt(1)+",\tBook title: "+rs.getString(2)+",\tBook Author: "+rs.getString(3)+",\tBook price: "+rs.getDouble(4)+",\tBook quantity: "+rs.getInt(5));
			            ++rowCount;
			         }
			         System.out.println("Total number of records where price >="+price+": "+ rowCount);
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("Please enter a number from 1-5");

}			
			con.close();
			}catch(Exception e){ System.out.println(e);}
			sc.close();
	}
}
