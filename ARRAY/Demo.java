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

// import java.util.*;

// class Demo {
//     public static void main(String[] args) {

//         int arr[] = {2, 1, 5, 1, 3, 2};
//         int k = 3;

//         int windowSum = 0;
//         int maxSum = 0;

//         // first window
//         for(int i = 0; i < k; i++) {
//             windowSum += arr[i];
//         }

//         maxSum = windowSum;

//         // slide the window
//         for(int i = k; i < arr.length; i++) {

//             windowSum = windowSum + arr[i] - arr[i-k];

//             maxSum = Math.max(maxSum, windowSum);
//         }

//         System.out.println("Maximum Sum = " + maxSum);
//     }
// }

//---------- SECOND EXAMPLE OF SLIDING WINDOW ---------

// import java.util.*;
// class Demo{
//     public static void main(String[] args){
//         int arr []= {2,3,4,5,6,7};
//         int k =3;
//         int ws= 0;
//         int mx=0;
//         //first window
//         for(int i=0; i<k;i++){
//             ws +=arr[i];
//         }
//         mx =ws;
//         //slide window
//         for(int i =k; i<arr.length;i++){
//             ws = ws+arr[i]-arr[i-k];
//             mx =Math.max(mx ,ws);
//         }
//         System.out.println(mx);
//     }
// }

//------ Two Pointer Technique -------------

// import java.*;
// public class Demo {

//     public static void main(String[] args) {

//         int[] arr = {1,2,3,4,6};
//         int target = 6;

//         int left = 0;
//         int right = arr.length-1;

//         while(left < right){

//             int sum = arr[left] + arr[right];

//             if(sum == target){
//                 System.out.println("Pair Found");
//                 return;
//             }

//             if(sum < target)
//                 left++;
//             else
//                 right--;
//         }

//         System.out.println("Pair Not Found");
//     }
// }


//----- 02 ---- Two Pointer Technique ------------

// class Demo{
//     public static void main(String[] args) {
//         int arr[]={2,3,4,5,6,7};
//         int target =15;
//         int l=0;
//         int r=arr.length-1;
//         while (l<r) {
//             int sum =arr[r]+arr[l];
//             if (sum==target) {
//                 System.out.println("pair found");
//                 return;
//             }
//             if(sum< target)
//                 l++;
//             else
//                 r--;
//         }
//         System.out.println("pair not faund");
//     }
// }

//--------- Count Vowels in String --------

import java.util.Scanner;

class Demo{
    public static void main(String[] args) {

        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the name : ");
        String name = sc.nextLine();

        for( int i = 0; i<name.length(); i++){
            char ch = name.charAt(i);

           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            count++;

        }
        System.out.println(count);
    }
}


//-------- Remove Duplicate Characters ------

// public class Demo {
//      public static void main(String[] args) {
//         String s = "programming";
// String result = "";

// for(int i=0;i<s.length();i++){
//     char ch = s.charAt(i);

//     if(result.indexOf(ch) == -1)
//         result += ch;
// }

// System.out.println(result);
//      }
// }