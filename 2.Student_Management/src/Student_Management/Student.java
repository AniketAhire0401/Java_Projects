package Student_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Student
{
	
	public void createDatabase()
	{
			try {
				String url ="jdbc:mysql://localhost:3306/";
				String username="root";
				String password="root";
				
				//conn establish
				Connection conn = DriverManager.getConnection(url,username,password);
				
				Statement stm = conn.createStatement();    //statement create
				String query = "Create database Student_Management";			//qeury
				stm.execute(query);                         //Execute Query
				System.out.println("Database created successfully....!");
				
				conn.close();  				//connection close
				} catch(Exception e)
			{
				e.printStackTrace();
			}
			
			//statement create
			//execute -query
			//connection close
	}

	public void createTable()
	{
		
		try {
			String url ="jdbc:mysql://localhost:3306/Student_Management";
			String username="root";
			String password="root";
			
			//conn establish
			Connection conn = DriverManager.getConnection(url,username,password);
			Statement stm = conn.createStatement();    //statement create
			
			String query = "Create table student(Roll_No int, Name varchar(30), Marks int) ";			//qeury
			stm.execute(query);                         //Execute Query
			System.out.println("Table created successfully....!");
			
			conn.close();  				//connection close
			} catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//statement create
		//execute -query
		//connection close
	}

	public void createData() 
	{
		try {
			String url ="jdbc:mysql://localhost:3306/";
			String db = "Student_Management";
			String username="root";
			String password="root";
			
			//conn establish
			Connection conn = DriverManager.getConnection(url+db,username,password);
			
			String query = "INSERT into Student (Roll_No,Name,Marks) values (?,?,?)";			//qeury
			PreparedStatement pstm = conn.prepareStatement(query);    //statement create

			 Scanner scanner = new Scanner(System.in);
		     System.out.print("Enter Roll No: ");
		     int rollNo = scanner.nextInt();
		     System.out.print("Enter Name: ");
		     String name = scanner.next();
		     System.out.print("Enter Marks: ");
		     int marks = scanner.nextInt();

		        pstm.setInt(1, rollNo);
		        pstm.setString(2, name);
		        pstm.setInt(3, marks);
			
			pstm.execute();                         //Execute Query
			System.out.println("data inserted successfully....!");
			
			conn.close();  				//connection close
			} catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//statement create
		//execute -query
		//connection close
		
	}

	
	public void readData() 
	{
		try {
			String url ="jdbc:mysql://localhost:3306/";
			String db = "Student_Management";
			String username="root";
			String password="root";
			
			//conn establish
			Connection conn = DriverManager.getConnection(url+db,username,password);
			
			String query = "select * from student";			//qeury
			Statement pstm = conn.createStatement();    //statement create
			
			ResultSet rs = pstm.executeQuery(query);                         //Execute Query
			
			System.out.println("Roll_No     Name     Marks");
			while(rs.next())
			{
				
				System.out.print(rs.getInt(1)+"           ");
				System.out.print(rs.getString(2)+"       ");
				System.out.print(rs.getInt(3));
				System.out.println();
			}
			
			System.out.println("read data successfully....!");
			
			conn.close();  				//connection close
			} catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}


	public void updateData() 
	{
		try {
			String url ="jdbc:mysql://localhost:3306/";
			String db = "Student_Management";
			String username="root";
			String password="root";
			
			//conn establish
			Connection conn = DriverManager.getConnection(url+db,username,password);
			
			String query = "UPDATE Student set Marks = ? where Roll_No = ?"; //qeury
			PreparedStatement pstm = conn.prepareStatement(query);    //statement create
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter Marks: ");
			int marks = scanner.nextInt();
	        System.out.print("Enter Roll No: ");
	        int rollNo = scanner.nextInt();

	        pstm.setInt(1, marks);
	        pstm.setInt(2, rollNo);

			pstm.execute();                         //Execute Query
			System.out.println("data updated successfully....!");
			
			conn.close();  				//connection close
			} catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public void deleteData() {
		try {
			String url ="jdbc:mysql://localhost:3306/";
			String db = "Student_Management";
			String username="root";
			String password="root";
			
			//conn establish
			Connection conn = DriverManager.getConnection(url+db,username,password);
			
			String query = "DELETE FROM student WHERE Roll_No = ? ;";			//qeury
			PreparedStatement pstm = conn.prepareStatement(query);    //statement create
			
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Roll No: ");
	        int rollNo = scanner.nextInt();

	        pstm.setInt(1, rollNo);
			
			pstm.execute();                         //Execute Query
			System.out.println("data deleted successfully....!");
			
			conn.close();  				//connection close
			} catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
	}

	
}
