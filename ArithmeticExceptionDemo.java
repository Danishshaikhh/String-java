package string;

public class ArithmeticExceptionDemo {
	public static void main(String[] args) {
        int num1 = 22;
        int num2 = 20;

        try {
            int result = num1 / num2; // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
