package parul8th;

public class NeonNumber {

	public static void main(String[] args) {
		  int num = 1;  // You can change this number
	        int square = num * num;
	        int sum = 0;

	        while (square > 0) {
	            sum += square % 10;
	            square = square / 10;
	        }

	        if (sum == num) {
	            System.out.println(num + " is a Neon number.");
	        } else {
	            System.out.println(num + " is NOT a Neon number.");
	        }
		// TODO Auto-generated method stub

	}

}
