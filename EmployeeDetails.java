public class Employee {
    // Fields
    private String name;
    private double basicSalary;
    private double hraPercentage; // Percentage of HRA
    private double daPercentage;  // Percentage of DA

    // Constructor
    public Employee(String name, double basicSalary, double hraPercentage, double daPercentage) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.hraPercentage = hraPercentage;
        this.daPercentage = daPercentage;
    }

    // Method to calculate HRA
    public double calculateHRA() {
        return (hraPercentage / 100) * basicSalary;
    }

    // Method to calculate DA
    public double calculateDA() {
        return (daPercentage / 100) * basicSalary;
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("HRA: $" + calculateHRA());
        System.out.println("DA: $" + calculateDA());
        System.out.println("Gross Salary: $" + calculateGrossSalary());
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Define the basic salary and percentage of HRA and DA
        double basicSalary = 50000;
        double hraPercentage = 20; // Example: 20% of Basic Salary
        double daPercentage = 15;  // Example: 15% of Basic Salary

        // Create an Employee object with the specified details
        Employee emp = new Employee("John Doe", basicSalary, hraPercentage, daPercentage);
        
        // Display the employee details
        emp.displayDetails();
    }
}
