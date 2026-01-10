//----------DAY-05/Demo.java----------[ FUNCTIONS AND RECURSION ]----------

class Demo {
    // Function to calculate factorial of a number using recursion
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args){
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
    
}
