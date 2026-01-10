//----------DAY-03/Demo.java----------[ ARRAYS, 1D,2D ]----------

class Demo {
    public static void main(String[] args){
        System.out.println("1D Array:");

        int[] arr1D = {10, 20, 30, 40, 50};

        for(int i = 0; i < arr1D.length; i++) {
            System.out.println("Element at index " + i + ": " + arr1D[i]);
        }

        System.out.println("\n2D Array:");

        int[][] arr2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i = 0; i < arr2D.length; i++) {
            for(int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
