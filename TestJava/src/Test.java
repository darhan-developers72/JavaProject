import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		//Java test
		Scanner in = new Scanner (System.in);
		float a = in.nextFloat();
		float b = a * 7.61f;
		float c = b * 0.18f;
		float d = b - c;
		System.out.printf("The discount is: %.2f" , d );
		System.out.print(" USD.");
		System.out.printf("\nThe final price is: %.2f", c );
		System.out.print(" USD.");

		System.out.println(" Hello Otgoo <3 ");
		in.close();
	}

}
