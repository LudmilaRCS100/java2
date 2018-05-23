import java.util.Scanner;

public class java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi skaitli: ");
		int someNumber = scanner.nextInt();
		
		if (someNumber == 10) {
			System.out.println("Ir 10");
			someNumber = 10;
			
		} else {
			System.out.println("Nav 10");
		}
			System.out.println("Jauna vertiba: " + someNumber);

	}

}
