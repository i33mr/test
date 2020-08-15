import java.util.*;
public class Second{
	public static void main(String[]args){
		ArrayList<String> words = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 4 words: ");
		for (int i = 0; i < 4; i++){
		words.add(scan.next());
		}
		boolean ascending = true;
		boolean duplicate = false;
		
		for (int i = 0; i < 3; ++i) {
			
			if (words.get(i).compareTo(words.get(i+1)) > 0)
				 ascending = false;
			for(int j = i+1; j < 4; ++j){
				if (words.get(i).equals(words.get(j)))
					duplicate = true;
			}
			
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