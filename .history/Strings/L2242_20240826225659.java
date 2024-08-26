
public class L2242 {
    public static void main(String[] args) {
        // concatination
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1.concat(" " + s2));
        String  firstName = "Parthib";
        String  lastName = "Dhar";
        String fullName = firstName + "@" + lastName;
        System.out.println(fullName);

        //CharAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println("Character at index " + i + " is : " + fullName.charAt(i));
        }

        // compare
        String name1 = "parthib";
        String name2 = "parthib";
        int result = name1.compareTo(name2);
        System.out.println(result);
    }

    //substring
    String  sentence  = "My Name  is Parthib Dhar";
    String  name = sentence.substring(12,19);
    System.out.println(result);
}
