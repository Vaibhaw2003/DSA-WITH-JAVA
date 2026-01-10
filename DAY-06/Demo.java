//----------DAY-06/Demo.java----------[ TIME AND COMPLEXITY, BIG O ]----------

class Demo {
    public static void main(String[] args){
        System.out.println("Time Complexity Examples:");

        // Example 1: O(1) - Constant Time
        int a = 5;
        int b = 10;
        int sum = a + b; // This operation takes constant time
        System.out.println("Sum (O(1)): " + sum);

        // Example 2: O(n) - Linear Time
        int n = 100;
        int linearSum = 0;
        for(int i = 1; i <= n; i++) {
            linearSum += i; // This loop runs n times
        }
        System.out.println("Linear Sum (O(n)): " + linearSum);

        // Example 3: O(n^2) - Quadratic Time
        int quadraticSum = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                quadraticSum += i + j; // This nested loop runs n^2 times
            }
        }
        System.out.println("Quadratic Sum (O(n^2)): " + quadraticSum);
    }
    
}
