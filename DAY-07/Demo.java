//----------DAY-03/Demo.java----------[ METHODS ]----------

// class Demo {
//     // Method to add two numbers
//     public static int add(int a, int b) {
//         return a + b;
//     }

//     // Method to subtract two numbers
//     public static int subtract(int a, int b) {
//         return a - b;
//     }

//     public static void main(String[] args){
//         int num1 = 10;
//         int num2 = 5;

//         int sum = add(num1, num2);
//         int difference = subtract(num1, num2);

//         System.out.println("Sum: " + sum);
//         System.out.println("Difference: " + difference);
//     }
// }

// --------- GETTING INPUT FROM USER ----------

// import java.util.Scanner;

// class Demo {
//     public static void main(String[] args) {
//         System.out.println("Enter your name: ");

//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println("Hello, " + name + "!");  
//     }
// }

// import java.util.Scanner;
// class Demo{
//     public static void main(String[] args){
//         System.out.println("Enter your age: ");
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         System.out.println("Your age is: " + age);
//     }
// }

//--------- GETTING INPUT FROM USER BY BUFFER READER ----------

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// class Demo {
//     public static void main(String[] args) throws IOException {

//         BufferedReader br = new BufferedReader(
//                 new InputStreamReader(System.in)
//         );

//         System.out.print("Enter your name: ");
//         String name = br.readLine();

//         System.out.print("Enter your age: ");
//         int age = Integer.parseInt(br.readLine());

//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Numbers = " + a + ", " + b + ", " + c);

        int avg = (a + b + c) / 3;
        System.out.println("Average = " + avg);
    }
}

