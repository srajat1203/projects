import java.util.HashMap;
import java.util.Scanner;

public class Nums {

	public static void main(String[] args) {
		
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
			}
			else
			{
				System.out.println(myMap.get(num));		//print value of given key
			}
			
			System.out.print("Would you like to try again ? y/n ");
			choice = sc.next();
		}
	}

}
