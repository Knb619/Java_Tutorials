public class Recursion {
    int sum(int num){
        if(num == 0){
            return 0;
        } else {
            return num + sum(num - 1);
        }
    }

    int sumStartEnd(int startNum, int endNum){
        if(startNum > endNum){
            return 0;
        } else {
            return startNum + sumStartEnd(startNum + 1, endNum);
        }
    }

    public static void main(String[] args) {
        // 再起 Method
        System.out.println(new Recursion().sum(10));
        System.out.println(new Recursion().sumStartEnd(5, 10));
        System.out.println("5 + 6 + 7 + 8 + 9 + 10 = " + (5 + 6 + 7 + 8 + 9 + 10));
    }
}
