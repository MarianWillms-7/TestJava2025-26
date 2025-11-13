import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LesenDatei
{
	public static void main(String[] args)
	{
		try
		{
			String regex = ";";
			String line;
			try (BufferedReader br = new BufferedReader(new FileReader("H:\\git\\TestJava2025-26\\Pizza2\\src\\Speisekarte.txt" + "")))
			{
				while ((line = br.readLine()) != null)
				{
				    String[] myArray = line.split(regex);
				    for (String s : myArray)
				    {
					    System.out.println(s);
				    }
				}
			}
		}
		catch (IOException e)
		{
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}