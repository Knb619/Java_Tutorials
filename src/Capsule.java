public class Capsule {
    public static void main(String[] args) {
        CapsuleClass person = new CapsuleClass();

        System.out.println("name2:" + person.name2);
        // System.out.println(person.name); // error privateのため

        person.setName("Kanebako");
        System.out.println("name:" + person.getName());
    }
}