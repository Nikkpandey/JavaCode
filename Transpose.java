import java.io.*;
public class Transpose {

	public static void main(String[] args) throws IOException 
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("Enter rows: ");
	int r=Integer.parseInt(br.readLine());
	System.out.print("Enter coloumns: ");
	int c=Integer.parseInt(br.readLine());
	
	int arr[][]=new int[r][c];
	
	System.out.println("Enter elements of matrix: ");
	
	for(int i=0; i<r; i++)
	for(int j=0; j<c; j++)
	arr[i][j]=Integer.parseInt(br.readLine());
	
	System.out.println("The Transpose matrix: ");
	for(int i=0; i<c; i++)
	{
		for(int j=0; j<r; j++)
		{
			System.out.print(arr[j][i]+" ");
		}
		System.out.println("\n");
	}

	}

}
