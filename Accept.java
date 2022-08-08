import java.io.*;
public class Accept {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Name: ");
		String name=br.readLine();
		
		System.out.print("Enter the age: ");
		int num=Integer.parseInt(br.readLine());
		
		
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+num);
	}

}
