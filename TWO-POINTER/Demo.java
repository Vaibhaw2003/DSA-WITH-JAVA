//---------- TWO POINTER APPROACH / TECHNIQUES ----------

//--------- Bubble Sort ------------

import java.util.*;
class Demo{
    public static void main(String[] args) {
        int arr[] = { 12,13,14,15,11,61,8};

        for(int i = 0; i<arr.length -1; i++){
            for(int j = 0; j< arr.length-1; j++){

                if (arr[j]>arr[j+1]) {
                   // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
            // print sorted array
        for(int num : arr) {
            System.out.print(num + " ");

        }
    }
}