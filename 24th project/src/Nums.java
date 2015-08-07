import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;


public class Nums {

	public static void main(String[] args) {
		
		String filename = (System.getProperty("user.dir") + File.separatorChar +"mybooks.txt");
		PrintWriter writer = null;
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);


		String choice = "y";
		while(choice.equalsIgnoreCase("y"))
		{
			System.out.print("Enter a number : ");		//input number
			int num = sc.nextInt();
			if(!(myMap.containsKey(num)))
			{
				System.out.println("Number not present in map. Please write out the number in letters.");
				String s = sc.next();			//if num not present, write it down ussing letters
				myMap.put(num, "You entered " + s );		//auto - populate "you entered"
				
				try 
				{	writer = new PrintWriter(new File(filename));
				    for (Integer cur: myMap.keySet())
				    {
				    	String word = myMap.get(cur);
				    	writer.println(word);
				    }	
				}
				catch (FileNotFoundException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				finally
				{
					writer.close();
				}
			
			}
			else
			{
				//System.println(myMap.get(num));
				System.out.println(myMap.get(num));		//print value of given key
			}
			
			System.out.print("Would you like to try again ? y/n ");
		    choice = sc.next();
	
		
		}
		System.out.println("Read in list of books");
		try
		{
			ArrayList<String> books = new ArrayList<String>();
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line = reader.readLine();
			
			while(line != null)
			{
				books.add(line);
				line = reader.readLine();
			}
			
			for(String st: books)
			{
				System.out.println(st);
			}
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
