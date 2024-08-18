package Student_Management;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		//st.createDatabase();
		//st.createTable();
		
		do
		{
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			
			System.out.print("Enter Your Choice : ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			
			case 1: st.createData();
			break;
			case 2: st.readData();
			break;
			case 3: st.updateData();
			break;
			case 4: st.deleteData();
			break;
			case 5:System.out.println("Exiting...");
            break;
			default:
                System.out.println("Invalid choice! Please select a valid option.");
			}
		}while(choice!=5);
		
		
		
	
	}
}
