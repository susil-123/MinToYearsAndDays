import java.util.Scanner;

public class MinToYearsAndDays {
	public static void main(String[] args) {
		
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of minutes: ");
	int min=s.nextInt();
	 int year=min/525600;
	 int days=min/1440;
	 int days_remaining=days % 525600;
	 System.out.println("The number of minutes is equal to " +year+" years " +days_remaining+" days" );
	 
}
}
