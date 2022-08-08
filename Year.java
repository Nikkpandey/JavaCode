import java.io.*;
public class Year {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the year: ");
		int y=Integer.parseInt(br.readLine());
		
		if(y % 100== 0 && y % 400 == 0)
			System.out.println(y+" is a leap year");
		
		else if(y % 100== 0 && y % 4== 0)
			System.out.println(y+" is a leap year");
		
		else
			System.out.println(y+" is not a leap year");

	}

}
