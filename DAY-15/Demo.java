//----------DAY-16/Demo.java----------[ RECURSION ]----------

//------- [ PRINT NUMBERS FROM 5 TO 1 USING RECURSION ] -------

// public class Demo {
//     public static void PrintNum (int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         PrintNum(n-1);
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         PrintNum(n);
//     }
// }

//------- [ TO PRINT NUMBERS FROM 1 TO 5 USING RECURSION ] -------

// class Demo {
//     public static void PrintNum (int n){
//         if(n==6){
//             return;
//         }
//         System.out.println(n);
//         PrintNum(n+1);
//     }

//     public static void main(String[] args) {
//         int n = 1;
//         PrintNum(n);
//     }
// }


//------- [ TO PRINT SUM OF FIRST N NATURAL NUMBERS USING RECURSION ] -------

// class Demo {
//     public static int SumNum (int n){
//         if(n==1){
//             return 1;
//         }
//         return n + SumNum(n-1);
//     }

//     public static void main(String[] args) {
//         int n = 6;
//         int sum = SumNum(n);
//         System.out.println("Sum of first " + n + " natural numbers is: " + sum);
//     }
// }