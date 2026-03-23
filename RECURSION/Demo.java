//---------- FACTORIAL --------

// class Demo{

//     static int fact (int n){
//     if(n ==0)
//         return 1;
//     return n * fact(n-1);
  
// }

// public static void main(String[] args) {
//     int n = 8;
//     System.out.println(fact(n));
// }

// }



//---------- PRINT NUMBERS ---------

// class Demo{

//         static void print (int n){
//             if(n==0)
//                 return ;

//             print (n-1);
//             System.out.println(n);
//         }

//          public static void main(String[] args) {
//             int n =5;
//             print(n);
//          }
// }

//------- N QUEEN PROBLEAM ----------

// class Demo{
//     static int n = 4;

//     static boolean isSafe(int board[][], int row , int col){
//         for(int i = 0; i<col; i++){
//             if (board[row][i]==1)
//                 return false;

//         for( int j =row ,j =col; i>=0 && j>=0;i--,j-- )
//             if (board[i][j]==1) {
//                 return false;
                
//             }
//         }
//     }

// }

// ----------- 1 TO N NATURAL NUMBER -------

// class Demo{
//      public void  tnum(int n){
//             if (n==0) {
//                 System.out.println("not run");
//                 return;
                
//             }
//             System.out.println(n);
//             tnum(n-1);
//         }

//     public static void main(String[] args) {
//         System.out.println("result is : ");

//         Demo obj = new Demo();   // create object
//         obj.tnum(5);
       
//     }
// }

//------- TO PRINT THE FACTORIAL -------

// public class Demo {

//      public int fact(int n ){
//         //base case
//         if (n == 0 || n == 1) {
//             System.out.println("error");
//             return 1;
//         }
//         //recursion 
//             return n * fact(n - 1);
//      }

//      public static void main(String[] args) {
//         Demo d = new Demo();
//         int nums = d.fact(5);
//         System.out.println(nums);

//      }
// }

//--------- SUM OF N NUMBER -------

// class Demo{
//     public int sum(int n , int m){
//         if (n==0 || m==0) {
//             return 1;
            
//         }
//         return n+ m;
//     }
//     public static void main(String[] args) {
//         Demo d = new Demo();
//         System.out.println("sum is  : ");
//        int ans =  d.sum(3, 4);
//         System.out.println(ans);
//     }
// }

// class Demo{
//     public int sum(int n){
//         if (n==0) {
//             return 0;
            
//         }
//         return n + sum(n-1);
//     }
//     public static void main(String[] args) {
//         Demo d = new Demo();
//         System.out.println("sum is  : ");
//        int ans =  d.sum(3);
//         System.out.println(ans);
//     }
// }


//------ TO PRINT THE EVEN NUMBER ------

public class Demo {

     public int even (int n){
        if (n==0 ) {
            return 0;
            
        }
        if (n % 2 == 0) {
            return 1 + even(n - 1);
        } else {
            return even(n - 1);
        }
       
     }
     public static void main(String[] args) {
        Demo s = new Demo();
        int ans = s.even(5);
        System.out.println(ans);
     }
}