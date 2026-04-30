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

// import java.util.Scanner;

// public class Demo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the name  : ");

//         String name = sc.nextLine();

//         int i =0;
//         int j = name.length()-1;

//         boolean isPalindrome = true;

//         while (i< j) {
//             if (name.charAt(i)!= name.charAt(j)){
//                 isPalindrome = false;
//                 break;
//             }
//                 i++;
//                 j--;
//         }
//         if (isPalindrome) {
//             System.out.println("yes");
            
//         }else
//             System.out.println("not");
            
//         }
//     }

//---------- TO CHECK ANAGRAM ---------

// import java.util.Arrays;
// class Demo{
//     public static void main(String[] args) {
//         String a = "listen";
//         String b = "silent";

//         char[] c1 = a.toCharArray();
//         char[] c2 = b.toCharArray();

//         Arrays.sort(c1);
//         Arrays.sort(c2);

//         System.out.println(Arrays.equals(c1, c2));
//     }
// }

// import java.util.Scanner;
// import java.util.Arrays;
// class Demo { 
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the name : ");
//         String name = sc.nextLine();

        // for(int i = 0; i< name.length(); i++){
        //     System.out.println(name.charAt(i));
        // }

        // for(int j = name.length()-1; j>=0; j--){
        //     System.out.println(name.charAt(j));
        // }

        // for(int i = 0; i< name.length(); i++){
        //     System.out.println(name.charAt(i));
        // }

        //to check anagram ----
//         System.out.println("enter the first name : ");
//         String a = sc.nextLine();
//         System.out.println("enter the second name : ");
//         String b = sc.nextLine();

//         char[] c1 = a.toCharArray();
//         char[] c2 = b.toCharArray();    
//         Arrays.sort(c1);
//         Arrays.sort(c2);
//         System.out.println(Arrays.equals(c1, c2));

//     }
// }

//----------- TO CHEK BOTH STRING ARE EQUAL OR NOT ----------

// import java.util.Scanner;

// public class Demo {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("enter the first name : ");

//                 String s1 =sc.nextLine();
//                 System.out.println("enter the second name : ");
//                 String s2  = sc.nextLine();

//                 if (s1.equals(s2)) {
//                         System.out.println("both string are equal");
//                 }
//                 else
//                         System.out.println("both string are not equal");        
                        
//                 }
// }


//---------  TO CHECK BOTH NUMBER ARE  EQUAL OR NOT ---------

// class Demo{
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;

//         if (a == b) {
//             System.out.println("both number are equal");
//         }
//         else
//             System.out.println("both number are not equal");
//     }
// }

//------------ TO PRINT THE LENGHT OF STRING -----------

// public class Demo {
//         public static void main(String[] args) {
//                 String s = "vaibhaw singh";
//                 System.out.println(s.length());
//         }
// }

//------------ TO PRINT THE STRING IN UPPER CASE ---------
// import java.util.Scanner;
// public class Demo {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("enter the name : ");
//                 String name = sc.nextLine();

//                 System.out.println(name.length());
//                 System.out.println(name.toUpperCase());
//                 System.out.println(name.toLowerCase());
//         }
// }

//-------- TO REVERSE THE STRING ---------

// import java.util.Scanner;
// class Demo{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("enter the name : ");
//                 String name = sc.nextLine();
//                 for(int i = name.length()-1; i>=0; i--){
//                         System.out.println(name.charAt(i));
//                 }
//         }
// }

//--------- TO REVERSE THE STRING USING StringBuilder ---------

// class Demo{
//         public static void main(String[] args) {
//                 String name = "vaibhaw singh";
//                 StringBuilder sb = new StringBuilder(name);
//                 sb.reverse();
//                 System.out.println(sb);
//         }
// }

//--------- REVERSE THE STRING USING STREAM API ---------

// class Demo{
//         public static void main(String[] args) {
//                 String name = "vaibhaw singh";
//                 String rev = new StringBuilder(name).reverse().toString();
//                 System.out.println(rev);
//         }
// }

