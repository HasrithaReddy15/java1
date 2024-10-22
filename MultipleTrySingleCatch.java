public class MultipleTrySingleCatchDemo {

    public static void main(String[] args) {
        try {
            // First try block - ArithmeticException
            try {
                System.out.println("Executing first try block...");
                int result = 10 / 0;  // This will throw ArithmeticException
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Exception caught in the first block: " + e);
            }

            // Second try block - NullPointerException
            try {
                System.out.println("\nExecuting second try block...");
                String str = null;
                System.out.println(str.length());  // This will throw NullPointerException
            } catch (Exception e) {
                System.out.println("Exception caught in the second block: " + e);
            }

            // Third try block - ArrayIndexOutOfBoundsException
            try {
                System.out.println("\nExecuting third try block...");
                int[] arr = new int[3];
                arr[5] = 10;  // This will throw ArrayIndexOutOfBoundsException
            } catch (Exception e) {
                System.out.println("Exception caught in the third block: " + e);
            }

        } catch (Exception e) {
            // This single catch block will catch any exception from any try block
            System.out.println("Exception caught in the program: " + e);

            // Identify type of exception
            if (e instanceof ArithmeticException) {
                System.out.println("It is an ArithmeticException");
            } else if (e instanceof NullPointerException) {
                System.out.println("It is a NullPointerException");
            } else if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("It is an ArrayIndexOutOfBoundsException");
            } else {
                System.out.println("Some other type of exception occurred");
            }
        }

        System.out.println("\nProgram finished executing.");
    }
}
