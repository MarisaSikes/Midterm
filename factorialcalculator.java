public class factorialcalculator {
    public static void main(String[] args) {
        int num = 7;  // Changes
        int factorial = 6; //Change 2 for Q2

        for (int i = 1; i <= num; i++) { // Loop through numbers
            factorial *= i;  // Multiply current number
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
