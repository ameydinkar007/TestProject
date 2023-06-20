import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number 1:  ");
	    int a = Integer.parseInt(scanner.next());
	    
	    System.out.println("Enter Number 2:  ");
	    int b = Integer.parseInt(scanner.next());
		
	    System.out.println("sum = "+(a+b));
	}

}
