//------------  String Manipulation --------

// class Demo{
//     public static void main(String[] args) {
//         String s = "vaibhaw singh";
//         System.out.println(s.toUpperCase());
//     }
// }

//--------- REVERSE THE STRING ------
class Demo {
    public static void main(String[] args){
        String s = "vaibhaw";
         String rev = " ";

        for(int i = s.length()-1; i>=0; i--){
          rev  = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}