//----------DAY-03/Demo.java----------[ ARRAYS, 1D,2D ]----------

// class Demo {
//     public static void main(String[] args){
//         System.out.println("1D Array:");

//         int[] arr1D = {10, 20, 30, 40, 50};

//         for(int i = 0; i < arr1D.length; i++) {
//             System.out.println("Element at index " + i + ": " + arr1D[i]);
//         }

//         System.out.println("\n2D Array:");

//         int[][] arr2D = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         for(int i = 0; i < arr2D.length; i++) {
//             for(int j = 0; j < arr2D[i].length; j++) {
//                 System.out.print(arr2D[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
    
// }


//----------OR----------

// class Demo {
//     public static void main(String[] args){
//         System.out.println("Storing marks of 5 subjects using 1D Array:");
//     int[] marks = new int[5];
//     marks[0] = 76;
//     marks[1] = 85;
//     marks[2] = 69;
//     marks[3] = 90;
//     marks[4] = 88;

//     //System.out.println(marks[0] + ", " + marks[1] + ", " + marks[2] + ", " + marks[3] + ", " + marks[4]);
//     for(int i = 0; i<5; i++){
//         System.out.println("marks of subjects " + marks[i]);
//           }
//     }
// }

//----------OR----------    

// public class Demo {
//     public static void main(String[] args) {
//         int age[] = {21, 22, 23, 24, 25};

//         // System.out.println("Ages of 5 students are:" + age[0] + ", " + age[1] + ", " + age[2] + ", " + age[3] + ", " + age[4]);

//         for( int i =0; i<age.length; i++){
//             System.out.println("Ages of students are: " + age[i]);
//         }
//     }  
// }

//---------- GETTING INPUT FROM USER IN ARRAY ----------

// import java.util.Scanner;
// class Demo{
//     public static void main(String[] args) {
//         System.out.println("Enter the number of elements you want to store in array:");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();  // ye lin user se input lega

//         int[] arr = new int[n]; // ye lin n size ka array banayega

//         System.out.println("Enter " + n + " elements:");

//         for( int i = 0; i < n; i++){  // ye lin loop chalayega n times
//             arr[i] = sc.nextInt(); // ye lin user se array ke elements lega
//         }

//         System.out.println("The elements in the array are:"); // ye lin array ke elements print karega

//         for( int i = 0; i < n; i++){  // ye lin loop chalayega n times
//             System.out.println(arr[i]);  // ye lin array ke elements print karega
//         }
//     }
// }


//---------- USER SE ELEMENTS LEKAR ARRAY ME STORE KARNA ----------

// import java.util.Scanner;
// class Demo{
//     public static void main(String[] args) {
//         System.out.println("Enter the number of elements :");

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int [] arr = new int[n]; // create an array of size n

//         for(int i =0; i<n; i++){
//             System.out.println("Enter element " + (i+1) + ":"); // prompt user to enter element

//             arr[i] = sc.nextInt(); // take input from user
        
//             System.out.println("Element at index " + i + ": " + arr[i]); // print the element at index i
//         }
//         System.out.println("All elements in the array are:"); 

//         for(int i =0; i<n; i++){
//             System.out.println(arr[i]); // print all elements in the array
//         }
//     }
// }

//---------- 2D ARRAY----------

class Demo {
    public static void main(String[] args) {
        int [][] num = new int[3][3]; // 3x3 2D array
        int count = 1;
        for(int i =0; i<3; i++){
            for(int j =0; j<3; j++){
                num[i][j] = count; // assign values to 2D array
                count++;
                System.out.println("Element at position (" + i + "," + j + "): " + num[i][j]); // print the element at position (i,j)
            }
        }
    }
}