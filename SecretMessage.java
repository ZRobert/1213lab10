//Robert Payne
//L02
//6-19-2012

import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class SecretMessage
{

	public static void main(String[] args) 
	{
		String message;
		StringTokenizer tokens;
		String output = "\n";
		int counter = 0;
		//trying to read the file; will execute the
		//remaining lines in the program if it works
		try{
			File fileRead = new File ("secret.txt");
			Scanner inFile = new Scanner(fileRead);
			
			message = inFile.nextLine();
			tokens = new StringTokenizer(message);
			
			while(tokens.hasMoreTokens())
			{
				message = tokens.nextToken();
				message = message.toUpperCase();
				
				if(counter % 5 == 0)
					output += message.charAt(0);
				counter++;
			}
			
			System.out.println("Secret message: " + output);
			
			inFile.close();
		}
		
		//catches the program if the file is not found
		catch(FileNotFoundException e)
		{
			System.out.println("File not found!");
		}
		//catches the program if there is a problem reading
		//the file
		catch(IOException e)
		{
			System.out.println(e);
		}
		//outputs "Done." when the program is finished
		finally{
			System.out.println("Done.");
		}
	}
}	