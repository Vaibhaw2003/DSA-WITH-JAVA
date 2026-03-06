//----------DAY-02/Demo.java----------[ LOOPS ]----------

// class Demo {
//     public static void main(String[] args){
//         System.out.println("For Loop:");

//         for( int i = 1; i <= 5; i++ ) {
//             System.out.println("Iteration: " + i);
//         }
//     }
// }


//------WHILE LOOP VERSION OF THE SAME CODE------

// class Demo {
//     public static void main(String[] args){
//         System.out.println("While Loop:");

//         int i = 1;
//         while( i <= 5 ) {
//             System.out.println("Iteration: " + i);
//             i++;
//         }
//     }
// }

//------DO WHILE LOOP VERSION OF THE SAME CODE------

// class Demo {
//     public static void main(String[] args){
//         System.out.println("Do While Loop:");

//         int i = 1;
//         do {
//             System.out.println("Iteration: " + i);
//             i++;
//         } while( i <= 5 );
//     }
// }


//TO PRINT THE REVRSE ALL ELEMENTS IN AN ARRAY USING ENHANCED FOR LOOP------

// class Demo {
//     public static void main(String[] args){
//         System.out.println("Enhanced For Loop (Reverse Array):");

//         int[] numbers = {10, 20, 30, 40, 50};

//         for( int i = numbers.length - 1; i >= 0; i-- ) {
//             System.out.println("Element: " + numbers[i]);
//         }
//     }
// }

// ----------- TO PRINT ALL THE ELEMENT -----------

// import java.util.ArrayList;
// import java.util.List;

// class Demo {
//     public static void main(String[] args){
//         List<Integer> l = new  ArrayList<>();
//         l.add(23);
//         l.add(34);
//         l.add(45);
//         System.out.println(l.size());
//         System.out.println(l);
//     }
// }