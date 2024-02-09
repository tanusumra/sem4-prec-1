
import java.util.*;

public class  ReverseRightHalf {
	
	public static void printPattern(int n)
	{
		int i, j;

		
		for (i = n; i >= 1; i--) {

			
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}

			
			System.out.println();
		}
	}

	
	public static void main(String args[])
	{
		int n = 7;
		printPattern(n);
	}
}
