//----------DAY-04/Demo.java----------[ STRINGS ]----------

class Demo {
    public static void main(String[] args){
        String str = "Hello, World!";
        
        // Length of the string
        System.out.println("Length of the string: " + str.length());
        
        // Character at a specific index
        System.out.println("Character at index 7: " + str.charAt(7));
        
        // Substring
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));
        
        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());
        
        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());
        
        // Replace characters
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        
        // Split the string
        String[] parts = str.split(", ");
        System.out.println("Split the string:");
        for(String part : parts) {
            System.out.println(part);
        }
    }
    
}
