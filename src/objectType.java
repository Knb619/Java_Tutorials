public class objectType {

    int num;
    // int num = 10;

    objectType(int inputNum) {
        this.num = inputNum;
    }

    public static void main(String[] args) {
        objectType numTest = new objectType(10);
        // objectType numTest = new objectType();
        // System.out.println(numTest.num);
        // numTest.num = 20;
        System.out.println(numTest.num);
    }
}