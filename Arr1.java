import java.io.*;
public class Arr1 {

	public static void main(String[] args)throws IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of subject: ");
		int sub=Integer.parseInt(br.readLine());
		
		int[] marks= new int[sub];
		
		for(int i=0; i<sub; i++)
		{
			System.out.print("Enter marks: ");
			marks[i]=Integer.parseInt(br.readLine());
		}
		
		int tot=0;
		for(int i=0; i<sub; i++)
			tot+=marks[i];
		
		System.out.println("Total Marks: "+tot);
		
		float percent=(float)tot/sub;
		System.out.println("Percentage: "+percent);

	}

}
