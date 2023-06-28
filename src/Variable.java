public class Variable {
    public static void main(String[] args) {
        // --- 変数 -----------------------------
        // 名前を表示
        String myName = "Youhei Kanebako";
        System.out.println(myName);

        // 名前を変更し再度表示
        myName = "Youhei Kanebako Update";
        System.out.println(myName);

        // --- 定数 -----------------------------
        // 名前を表示
        final String myNameFinal = "Youhei Kanebako Final";
        System.out.println(myNameFinal);

        // 名前を変更し再度表示 -> error
        //myNameFinal = "Youhei Kanebako Final Update";
        System.out.println(myNameFinal);
    }
}
