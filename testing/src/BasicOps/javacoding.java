
import java.util.Scanner;
public class javacoding {
	public static void main(String[] args)
	{
		System.out.println("Enter nvnvnvnvn");
		
		Scanner sl = new Scanner(System.in);
		System.out.println("Enter y/n:");
		char resp = sl.nextLine().charAt(0);
		if (resp == 'y') {
			System.out.println("You entered YES!");
		}
		else {
			System.out.println("You entered no");
		}
		sl.close();
		
	}
}
	