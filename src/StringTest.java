public class StringTest {
    public static void main(String[] args) {
        String greeting = "Hello";

        String greetingLower = "hello";
        String greetingUpper = "HELLO";

        System.out.println(greeting.length());
        System.out.println(greeting.charAt(0));

        for(int i = 0; i < greeting.length(); i++) {
            System.out.print(greeting.charAt(i));
        }
        System.out.println();

        System.out.println(greetingUpper.toLowerCase());
        System.out.println(greetingLower.toUpperCase());

        System.out.println(greeting.indexOf("Hel"));
        System.out.println(greeting.indexOf("HEL")); // 見つからない -> -1が返却
    }
}
