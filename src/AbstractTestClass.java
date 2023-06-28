abstract class AbstractTestClass {
    String name = "Yohei";
    int age = 30;
    abstract void sayHello();
}

class Student extends AbstractTestClass {
    int graduationYear = 2016;

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
