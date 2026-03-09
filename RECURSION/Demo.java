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

class Demo{
    static int n = 4;

    static boolean isSafe(int board[][], int row , int col){
        for(int i = 0; i<col; i++){
            if (board[row][i]==1)
                return false;

        for( int j =row ,j =col; i>=0 && j>=0;i--,j-- )
            if (board[i][j]==1) {
                return false;
                
            }
        }
    }

}

// ----------- 