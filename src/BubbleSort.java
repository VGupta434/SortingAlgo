import java.io.*;

public class BubbleSort 
{
	public static void main(String args[]) throws IOException
	{
		int i,j,n,tmp,arr[];
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		System.out.println("enter size of array");
		n = Integer.parseInt(in.readLine());
		arr = new int[n];
		System.out.println("enter data in array");
		for (i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(in.readLine());
		}
		System.out.println("array data:");
		for (i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		//sorting algo
		
		for (i=0;i<n-1;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(arr[j+1]<arr[j])
				{
					tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
			
		}
		
		System.out.println("sorted array data:");
		for (i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
