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

class Demo{
    public static void main(String[] args) {
        int[][] mat ={
            {1,2,3},
            {2,3,4},
            {3,4,5}
        };
        
        for(int i=0; i<mat.length; i++){
            for(int j =0; j<mat.length; j++){
                System.out.print(mat[i][j] +" ");
            }
            System.out.println();
        }
       
}
}

