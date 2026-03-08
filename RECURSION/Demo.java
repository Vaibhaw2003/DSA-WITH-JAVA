//---------- FACTORIAL --------

class Demo{

    static int fact (int n){
    if(n ==0)
        return 1;
    return n * fact(n-1);
  
}

public static void main(String[] args) {
    int n = 8;
    System.out.println(fact(n));
}

}



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