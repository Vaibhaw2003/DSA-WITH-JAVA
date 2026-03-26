//----------- FUNCTIONS IN JAVA -----------

// import java.util.Scanner;

// class Demo {
//     public static void printNamae(String name){
//         System.out.println(name);
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the name : ");
//         String name = sc.nextLine();

//         printNamae(name);
//     }
// }

//----------- FIND AVARAGE OF NO FUNCTIONS IN JAVA ----------

// import java.util.Scanner;

// class Demo{
//     public static int AvarageNum( int a,int b){
//         int avg = (a+ b)/2;
//         return avg ;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number a : ");
//         int a = sc.nextInt();
//         System.out.println("enter the second numcer b : ");
//         int b =sc.nextInt();

//         int res = AvarageNum(a, b);
//         System.out.println(res);
//     }
// }

//---------- FIND FACTORIAL OF NO. FUNCTIONS IN JAVA ----------

// import java.util.Scanner;
// class Demo{
//     public static void fact(int n){
//         int factorial = 1;
//         for(int i= n; i> 1; i--){
//             factorial = factorial *i;
//         }
//         System.out.println(factorial);
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the numner : ");
//         int n = sc.nextInt();

//         fact(n);
//     }
// }

//-------- TO FIND THE  FACTORIAL OF N NUMBER ---------

// import java.util.Scanner;

// class Demo{
//     public static void fact(int n){
//         int fc = 1;
//         for(int i = n; i>0; i--){
//              fc =fc *i; 
//         }
//         System.out.println(fc); 
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the numbr : ");
//         int n = sc.nextInt();

//         fact(n);
//     }
// }


//--------- TO PRINT THE HOLLOW SQUARE PATTERN ---------

// class Demo {
//     public static void main(String[] args) {
//         int n = 6;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {

//                 // Border condition
//                 if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


//-------- TO PRINT THE EVEN NUMBER FROM THE GIVEN NUMBER --------

// import java.util.Scanner;

// class Demo{

//     public static boolean sum(int a){
//         boolean num = a%2==0;
//         return num;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number : ");
//         int num = sc.nextInt();

//         boolean ans = sum(num);
//         //System.out.println(ans);

//         if (ans == true) {
//             System.out.println("even number ");
            
//         }else
//             System.out.println("odd number ");

//     }
// }


// import java.util.Scanner;

// class Demo {

//     public static boolean sum(int a) {
//         return a % 2 == 0;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int num = sc.nextInt();

//         boolean result = sum(num);

//         if (result) {
//             System.out.println("Even number");
//         } else {
//             System.out.println("Odd number");
//         }
//     }
// }
