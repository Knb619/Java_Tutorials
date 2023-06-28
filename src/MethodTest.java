public class MethodTest {

    void printMessage(){
        System.out.println("printMessage:Method Test Message");
    }

    // static void printMessazge(){
    //     System.out.println("Method Test Message");
    // }

    void printMessagePrm(String strMsg){
        System.out.println("printMessagePrm" + strMsg);
    }

    int plus(int x, int y){
        return x + y;
    }

    // plus Methodをオーバーロード
    double plus(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        // printMessage(); // error Static methodではないため
        new MethodTest().printMessage();
        new MethodTest().printMessage();
        new MethodTest().printMessage();
        System.out.println();

        new MethodTest().printMessagePrm("受け取った文字列を出力");

        // Methodのオーバーロード
        int intPlusResult = new MethodTest().plus(8, 5);
        double doublePlusResult = new MethodTest().plus(8.0, 5.0);

        System.out.println("int:" + intPlusResult);
        System.out.println("double:" + doublePlusResult);
    }
}
