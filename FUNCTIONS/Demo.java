//----------- FUNCTIONS IN JAVA -----------

// import java.util.Scanner;

// class Demo {
//     public static void printNamae(String name){
//         System.out.println(name);
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the name : ");
//         String name = sc.nextLine();

//         printNamae(name);
//     }
// }

//----------- FIND AVARAGE OF NO FUNCTIONS IN JAVA ----------

import java.util.Scanner;

class Demo{
    public static int AvarageNum( int a,int b){
        int avg = (a+ b)/2;
        return avg ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number a : ");
        int a = sc.nextInt();
        System.out.println("enter the second numcer b : ");
        int b =sc.nextInt();

        int res = AvarageNum(a, b);
        System.out.println(res);
    }
}