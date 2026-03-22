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

// import java.util.Scanner;

// class Demo{
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         System.out.println("enter the name : ");
//         String name = sc.nextLine();

//         System.out.println(name.length());

//         // reverse the string 
//         String rev= "";
//         for(int i=name.length()-1; i>0; i--){
//             rev = rev + name.charAt(i);
//         }

//         System.out.println(rev);

//     }
// }


//------ TO FIND THE LENGTH OF STRING -------

// import java.util.Scanner;

// public class Demo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the name : ");
//         String name = sc.nextLine();

//         System.out.println(name.length());

//         // second methode 
//         String n = "";
//         for(int i = 0; i<name.length(); i++){
//             n = n + name.charAt(i);

//         }

//         System.out.println(n.length());
//     }
// }

//-------- Reverse a String ------

// class Demo{
//     public static void main(String[] args){
//         String name = "vaibhaw";
//         String rev = "";

//         for(int i= name.length()-1; i> 0; i--){
//             rev = rev + name.charAt(i);
//         }

//         System.out.println(rev);
//     }
// }

//------- Check Palindrome String ------

// class Demo{
//     public static void main(String[] args) {
//         String name = "madam";
//         String pali = "" ;

//         for( int i = name.length()-1; i>=0; i--){
           
//             pali = pali + name.charAt(i);
//         }

//         if(name.equals(pali)){
//             System.out.println(" palindrom ");
//         }
//         else{
//             System.out.println(" not pali");
//         }
//     }
// }

//----- Check Anagram --------

// import java.util.Arrays;
// class Demo{
//     public static void main(String[] args) {
//         char[] a = "listen".toCharArray();
//         char[] b = "silent".toCharArray();

//         Arrays.sort(a);
//         Arrays.sort(b);

//           System.out.println(Arrays.equals(a,b));
//     }
// }

//-------- TO REVERSE THE STRING ------

// class Demo{
//     public static void main(String[] args) {
//         String name = "vaibhaw singh";

//         //THE LENGTH OF STRING

//         for(int i = 0; i < name.length()-1; i++){
//             System.out.println(name.charAt(i));
//         }


//         //FOR REVERSE THE STRING 

//         for(int j = name.length()-1; j >= 0; j--){
//             System.out.println(name.charAt(j));
//         }
//     }
// }

//--------- TO CHEK PALINDROM -------

// import java.util.Scanner;
// class Demo{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the string : ");

//         String name = sc.nextLine();

//         for(int i = 0; i< name.length()-1; i++){
//             for(int j = 0; j< name.length() -1; j++){
                
//                 if ( name.charAt(i)!= name.charAt(j)) {
//                     System.out.println("not palindrome ");
                    
//                 }
//                 else
//                     System.out.println("it is palindrome");
//             }
//         }

//     }
// }

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name  : ");

        String name = sc.nextLine();

        int i =0;
        int j = name.length()-1;

        boolean isPalindrome = true;

        while (i< j) {
            if (name.charAt(i)!= name.charAt(j)){
                isPalindrome = false;
                break;
            }
                i++;
                j--;
        }
        if (isPalindrome) {
            System.out.println("yes");
            
        }else
            System.out.println("not");
            
        }
    }