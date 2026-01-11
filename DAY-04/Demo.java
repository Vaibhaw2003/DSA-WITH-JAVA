//----------DAY-04/Demo.java----------[ STRINGS ]----------

// class Demo {
//     public static void main(String[] args){
//         String str = "Hello, World!";
        
//         // Length of the string
//         System.out.println("Length of the string: " + str.length());
        
//         // Character at a specific index
//         System.out.println("Character at index 7: " + str.charAt(7));
        
//         // Substring
//         System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));
        
//         // Convert to uppercase
//         System.out.println("Uppercase: " + str.toUpperCase());
        
//         // Convert to lowercase
//         System.out.println("Lowercase: " + str.toLowerCase());
        
//         // Replace characters
//         System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        
//         // Split the string
//         String[] parts = str.split(", ");
//         System.out.println("Split the string:");
//         for(String part : parts) {
//             System.out.println(part);
//         }
//     }
    
// }

// ---------- STRING METHODS ----------

// import java.util.Scanner;

// class Demo{
//     public static void main(String[] args) {
//          System.out.println("enter your name here:");

//          Scanner sc = new Scanner(System.in);
//          //String name = sc.next(); // to take string input from user, yaha next() method use kiya hai, jo space se pehle tak ka input lega
//          String name = sc.nextLine(); // to take string input with spaces, yaha nextLine() method use kiya hai, jo pura line ka input lega
//          System.out.println("Hello, " + name);
//     }
// }

// ---------- STRING INPUT FROM USER ----------

// import java.util.Scanner;
// class Demo {
//     public static void main(String[] args) {
//         String s = "Hello";
//         String t = "World";
//         String r = s.concat(t); // Concatenation using concat() method
//         System.out.println("Concatenated String: " + r);

//          Scanner sc = new Scanner(System.in);
//          System.out.println("Enter first string:");
//          String str1 = sc.nextLine();
//          System.out.println("Enter second string:");
//          String str2 = sc.nextLine();

//          String combined = str1.concat(str2);
//          System.out.println("Combined String using concat(): " + combined);
//         String u = s + " " + t; // Concatenation using + operator
//         System.out.println("Concatenated String: " + u);

//     }
// }

//---------- STRING COMPARISON ----------

// class Demo{
//     public static void main(String[] args) {
//         String s1 = "Hello";
//         String s2 = "Helloworld";

//         if (s1.compareTo(s2) == 0) {
//             System.out.println("Strings are equal.");
//         } else {
//             System.out.println("Strings are not equal."); 
//         }
//     }
// }

//---------- STRING COMPARISON USING EQUALS() METHOD ----------

//  import java.util.Scanner;
//  class Demo{
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);

//          System.out.println("Enter first string:");
//          String str1 = sc.nextLine();

//          System.out.println("Enter second string:");
//          String str2 = sc.nextLine();

//          if (str1.equals(str2)) {
//              System.out.println("Strings are equal.");
//          } else {
//              System.out.println("Strings are not equal.");
//          }
//      }
//  }

//---------- STRING SUBSTRING ----------

// class Demo {
//     public static void main(String[] args) {
//         String n = "Hello, welcome to Java programming!";
//         String name = n.substring(7, 14); // Extracting substring from index 7 to 14
//         System.out.println("Extracted Substring: " + name);
//     }
// }

// --------- REVERSE A STRING ----------

// public class Demo {
//     public static void main(String[] args) {
//         String name = "hello";
//         String reversed = "";
//         for( int i = 0; i<name.length()/2; i++){
//             int frontIndex = i;
//             int backIndex = name.length() - 1 - i;
//             char frontChar = name.charAt(frontIndex);
//             char backChar = name.charAt(backIndex);
//             reversed = reversed + backChar + frontChar;

//         }
//         System.out.println("Reversed String: " + reversed);
//     } 
// }

// --------- REVERSE A STRING ----------

// public class Demo {
//     public static void main(String[] args) {
//         StringBuilder name = new StringBuilder("hello");
//         name.reverse();
//         System.out.println("Reversed String: " + name.toString()); 
//     }
// }