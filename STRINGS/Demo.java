//------------  String Manipulation --------

// class Demo{
//     public static void main(String[] args) {
//         String s = "vaibhaw singh";
//         System.out.println(s.toUpperCase());
//     }
// }

//--------- REVERSE THE STRING ------
// class Demo {
//     public static void main(String[] args){
//         String s = "vaibhaw";
//          String rev = " ";

//         for(int i = s.length()-1; i>=0; i--){
//           rev  = rev + s.charAt(i);
//         }
//         System.out.println(rev);
//     }
// }

//------------ TO PRINT THE LENGTH OF STRING ---------

// import java.util.Scanner;

// class Demo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the string ");
//         String name = sc.nextLine();
//         for(int i =0; i<name.length(); i++){
//             System.out.println(name.charAt(i));
        
//         }
//         int len = name.length();
//         System.out.println(len);
//     }
// }

//--------  FIND THE LENGHT OF STRING ------

// class Demo{
//     public static void main(String[] args){
        
//         String name = " vaibhaw singh";
//         for( int i =1 ; i<= name.length(); i++){
//             System.out.println(name.charAt(i));
//         }
//     }
// }

//------- TO REVERSE THE STRING ------

import java.util.Scanner;

class Demo{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the name : ");
        String name = sc.nextLine();

        System.out.println(name.length());

        // reverse the string 
        String rev= "";
        for(int i=name.length()-1; i>0; i--){
            rev = rev + name.charAt(i);
        }

        System.out.println(rev);

    }
}
