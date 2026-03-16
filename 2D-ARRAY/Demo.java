//----------- 2D ARRAY -----------

// import java.util.Scanner;

// class Demo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the row : ");
//         int row =sc.nextInt();
//         System.out.println("enter the col");
//         int col = sc.nextInt();

//         int num[][] = new int[row][col];

//         //input
//         for(int i =0; i<row; i++){
//             //colums
//             for(int j =0; j< col; j++){
//                 num[i][j] =sc.nextInt();
//             }
//         }

//         //output
//         System.out.println("the 2d array is : ");
//          for(int i =0; i<row; i++){
//             //colums
//             for(int j =0; j< col; j++){
//                 System.out.print(num[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//------- TO PRINT THE 3*3 MATRIX ---------

import java.util.Scanner;

class Demo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         System.out.println("enter the row : ");
         int row =sc.nextInt();
         System.out.println("enter the col");
         int col = sc.nextInt();

         int num[][] = new int[row][col];

         // input 
         for(int i =0; i<row; i++){
            for(int j =0; j<col; j++ ){
                num[i][j] =sc.nextInt();
            }
         }

         //output 
         System.out.println("the output is here");
         for(int i = 0; i< row; i++){
            for(int j =0; j< col; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
         }
        
    }
}