import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an exception to simulate:");
        System.out.println("1: ClassNotFoundException");
        System.out.println("2: ArithmeticException");
        System.out.println("3: FileNotFoundException");
        System.out.println("4: NullPointerException");
        
        int choice = sc.nextInt();

        try {
            switch (choice) {
                case 1:
                    // Simulate ClassNotFoundException
                    throw new ClassNotFoundException("Simulating ClassNotFoundException");

                case 2:
                    // Simulate ArithmeticException (divide by zero)
                    int result = 10 / 0;
                    System.out.println("Result: " + result);
                    break;

                case 3:
                    // Simulate FileNotFoundException
                    File file = new File("nonexistent_file.txt");
                    Scanner fileScanner = new Scanner(file);
                    break;

                case 4:
                    // Simulate NullPointerException
                    String str = null;
                    System.out.println(str.length());
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Caught: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e);
        } catch (FileNotFoundException e) {
            System.out.println("Caught: " + e);
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e);
        } finally {
            sc.close();
            System.out.println("Exception handling completed.");
        }
    }
}
