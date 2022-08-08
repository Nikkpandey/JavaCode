import java.util.Scanner;
public class Scan {

	public static void main(String[] args) 
	{
		System.out.print("Enter id name sal: ");
		try (Scanner sc = new Scanner(System.in)) 
		{
			int id=sc.nextInt();
			String name=sc.next();
			float sal=sc.nextFloat();
			
			System.out.println("Id= "+id);
			System.out.println("Naae= "+name);
			System.out.println("Salary= "+sal);
		}

	}

}
