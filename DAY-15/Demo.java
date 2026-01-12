//----------DAY-16/Demo.java----------[ RECURSION ]----------

//------- [ PRINT NUMBERS FROM 5 TO 1 USING RECURSION ] -------

// public class Demo {
//     public static void PrintNum (int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         PrintNum(n-1);
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         PrintNum(n);
//     }
// }

//------- [ TO PRINT NUMBERS FROM 1 TO 5 USING RECURSION ] -------

class Demo {
    public static void PrintNum (int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        PrintNum(n+1);
    }

    public static void main(String[] args) {
        int n = 1;
        PrintNum(n);
    }
}