package practical3;
import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print the Largest Number out of the Three.
		int a,b,c;
		System.out.println("Enter any 3 integers:- ");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		b = obj.nextInt();
		c = obj.nextInt();
		if(a>=b && a>=c)
		{
			System.out.println("The Laregst Number is : "+a);
		}
		else if (b>=a && b>=c)
		{
			System.out.println("The Laregst Number is : "+b);
		}
		else if (c>=a && c>=b)
		{
			System.out.println("The Laregst Number is : "+c);
		}
		else
		{
			System.out.println("All the Numbers are Equal.");
		}


		
		
		
		

	}

}
