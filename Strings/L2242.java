public class L2242 {
    public static void main(String[] args) {
        // Concatenation
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1.concat(" " + s2));

        String firstName = "Parthib";
        String lastName = "Dhar";
        String fullName = firstName + "@" + lastName;
        System.out.println(fullName);

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println("Character at index " + i + " is: " + fullName.charAt(i));
        }

        // Compare
        String name1 = "parthib";
        String name2 = "parthib";
        int result = name1.compareTo(name2);
        System.out.println(result);

        // Substring
        String sentence = "My Name is Parthib Dhar";
        String name3 = sentence.substring(11, 18); // Adjusted indexes to capture "Parthib"
        System.out.println(name3);
    }
}
