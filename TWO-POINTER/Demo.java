//---------- TWO POINTER APPROACH / TECHNIQUES ----------

//--------- Bubble Sort ------------

// class Demo{
//     public static void main(String[] args) {
//         int arr[] = { 12,13,14,15,11,61,8};

//         for(int i = 0; i<arr.length -1; i++){
//             for(int j = 0; j< arr.length-1; j++){

//                 if (arr[j]>arr[j+1]) {
//                    // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//             // print sorted array
//         for(int num : arr) {
//             System.out.print(num + " ");

//         }
//     }
// }

//--------- Bubble Sort ------------

// import java.util.*;

// class Demo {
//     public static void main(String[] args) {
//         int arr[] = {5, 3, 8, 4, 2};

//         // Bubble Sort
//         for(int i = 0; i < arr.length - 1; i++) {
//             for(int j = 0; j < arr.length - 1 - i; j++) {
//                 if(arr[j] > arr[j + 1]) {
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }

//         // Print sorted array
//         System.out.println("Sorted array:");
//         for(int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

//---------- REMOVE DUPLICATE ELEMENTS ---------- 

// class Demo {
//     public static void main(String[] args) {
//         int [] arry = { 1,1,2,2,3,3,4};

//         int i = 0;
//         for(int j = 1; j< arry.length; j++){
//             if (arry[i] != arry[j]) {
//                 arry[i + 1] = arry[j];
//                 i++;
//             }
//         }
//         System.out.println(i+1);
//     }
// }

//--------- REVERSE A STRING ---------

// class Demo {
//     public static void main(String[] args) {
//         String name = "vaibhaw singh";

//         int i = 0;
//         int j = name.length() - 1;

//         while (i < j) {
//             // Swap characters at positions i and j
//             char temp = name.charAt(i);
//             name = name.substring(0, i) + name.charAt(j) + name.substring(i + 1);
//             name = name.substring(0, j) + temp + name.substring(j + 1);

//             i++;
//             j--;
//         }

//         System.out.println("Reversed string: " + name);
//     }
// }


//--------- REVERSE A STRING ENTERED BY USER ---------
// import java.util.Scanner;

// class Demo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string: ");
//         String name = sc.nextLine();

//         int i = 0;
//         int j = name.length() - 1;

//         while (i < j) {
//             // Swap characters at positions i and j
//             char temp = name.charAt(i);
//             name = name.substring(0, i) + name.charAt(j) + name.substring(i + 1);
//             name = name.substring(0, j) + temp + name.substring(j + 1);

//             i++;
//             j--;
//         }

//         System.out.println("Reversed string: " + name);
//     }
// }