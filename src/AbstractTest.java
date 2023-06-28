public class AbstractTest {
    public static void main(String[] args) {
        Student person = new Student();
        
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.graduationYear);
        person.sayHello();
    }
}