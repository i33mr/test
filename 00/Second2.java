import java.util.*;
public class Second2{
	public static void main(String[]args){
		String[] words = new String[4];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 4 words: ");
		for (int i = 0; i < 4; i++){
			words[i] = scan.nextLine();
		}
		boolean ascending = true;
		boolean duplicate = false;
		
		for (int i = 0; i < 3; i++) {
			if (words[i].compareTo(words[i+1]) > 0)
				 ascending = false;
			if (words[i].equals(words[i+1]))
				 duplicate = true;
			
		}
			if (ascending)
				System.out.println("Words in ascending order");
			else 
				System.out.println("Words not in ascending order");
			if (duplicate)
				System.out.println("Got duplicated words");
			else 
				System.out.println("No duplicated words");
		
	
	}
}