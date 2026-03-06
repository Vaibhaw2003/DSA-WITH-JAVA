//-------------- ARRAY --------

//--------- 1D array -------

// import java.util.List;
// import java.util.ArrayList;

// class Demo {
//     public static void main(String[] args) {
//         List<Integer> l = new ArrayList<>();
//         l.add(23);
//         l.add(24);

//         System.out.println(l);
//     }
// }

//----------- 2D array ---------

// class Demo{
//     public static void main(String[] args) {
//         int[][] mat ={
//             {1,2,3},
//             {2,3,4},
//             {3,4,5}
//         };
        
//         for(int i=0; i<mat.length; i++){
//             for(int j =0; j<mat.length; j++){
//                 System.out.print(mat[i][j] +" ");
//             }
//             System.out.println();
//         } 
//   }
// }


//--------- Sliding Window ---------

import java.util.*;

class Demo {
    public static void main(String[] args) {

        int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int windowSum = 0;
        int maxSum = 0;

        // first window
        for(int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // slide the window
        for(int i = k; i < arr.length; i++) {

            windowSum = windowSum + arr[i] - arr[i-k];

            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Maximum Sum = " + maxSum);
    }
}

