public class Scope {

    int testNum2 = 0;

    public static void main(String[] args){
        // 変数スコープチェック
        // System.out.println(testNum); // 宣言前は利用不可
        int testNum = 1;
        System.out.println(testNum);

        // System.out.println(testNum2); // error Static変数でないため、このままでは利用不可
        // System.out.println(new Scope().testNum2); // OK
        Scope testNum3 = new Scope();
        System.out.println(testNum3.testNum2); // OK
    }
}