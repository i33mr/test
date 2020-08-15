import java.util.*;
public class First{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = input.nextInt();
		int[] A = new int[size];
		System.out.print("Enter " + size + "Integer(s): ");
		for(int i = 0; i < A.length; ++i)
			A[i] = input.nextInt();
		System.out.print("You Enterd: ");
		for(int i = 0; i < A.length; ++i)
			System.out.print(A[i] + " ");
		System.out.println();
		int total = 0;
		for(int i = 0; i < A.length; ++i)
			total += A[i];
		System.out.print("Sum of array = " + total);
	
	
	
	
	
	}
}