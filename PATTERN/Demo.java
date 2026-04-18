//---------- TO PRINT * PATTERN ---------

// class Demo{
//     public static void main(String[] args) {
//         int i,j;
//         int n=5;
//         for(i=1; i<=n; i++)
//             for(j =1; j<=i; j++){
//         System.out.println("*");
//         }

//         System.out.println();
//     }
// }

//-------- TO PRINT THE TRANGULAR * -------

// import java.util.Scanner;
// class Demo{
//     public static void main(String[] args) {
//         int i,j,n;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number : ");
//         n = sc.nextInt();

//         for(i=1; i<=n; i++){
            
//             for(j =1; j<=i; j++){
//                 System.out.print("*" + " ");
//             }System.out.println();
//         }
        
//     }
// }

//--------- TO PRINT SQUARE OR * PATTERN ----

// import java.util.Scanner;
// class Demo{
//     public static void main(String[] args) {
//         int i,j,n;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number: ");
//         n = sc.nextInt();
        
//         for(i = 1; i<=n ; i++){
           
//             for(j =1; j<= n; j++){
//                 System.out.print("*" + " ");
//             }System.out.println();
//         }

//     }
// }

//------- TO PRINT PYRAMID ---------

// class Demo{
//     public static void main(String[] args){
//         int n =6;
//         for(int i=0; i<=n; i++){
//             //for coloum 
//             for(int j =0; j<=n-1; j++){
//                 System.out.print(" ");
//             }
//             for(int k=0; k<=(i-1); k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//------- TO PRINT THE SQUARE PATTERN ---------

// import java.util.Scanner;
// class Demo{
//     public static void main(String[] args) {
//         int i,j,n;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number: ");
//         n = sc.nextInt();
//         for(i = 1; i<=n ; i++){        
//             for(j =1; j<= n; j++){
//                 System.out.print("*" + " ");
//             }System.out.println();
//         }
//     }
// }

//-------------- TO PRINT THE HOLLOW SQUARE PATTERN ---------

// import java.util.Scanner;
// class Demo{
//     public static void main(String[] args) {
//         int i,j,n;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number: ");
//         n = sc.nextInt();
        
//         for(i = 1; i<=n ; i++){
           
//             for(j =1; j<= n; j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                     System.out.print("*" + " ");
//                 }else{
//                     System.out.print(" " + " ");
//                 }
//             }System.out.println();
//         }
//     }
// }

//---------------- TO PRINT THE HOLLOW PYRAMID PATTERN ---------

import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        n = sc.nextInt();
        
        for(i=1; i<=n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=2*i-1; j++){
                if(j==1 || j==2*i-1 || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
