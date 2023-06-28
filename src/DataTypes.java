public class DataTypes {
    public static void main(StringTest[] args) {
        /*
        // --- プリミティブ型 ---
        // byte bytenum0 = -129; // error
        byte bytenum1 = -128; // 下限
        byte bytenum2 = 127; // 上限
        // byte bytenum3 = 128; // error

        // short num0 = -32769; // error
        short num1 = -32768; // 下限
        short num2 = 32767; // 上限
        // short num3 = 32768; // error

        // int num0 = -2147483649; // error
        int intNum1 = -2147483648; // 下限
        int intNum2 = 2147483647; // 上限
        // int num3 = 2147483649; // error

        float floatNum = 10.0f;

        char charNum = '1';
        
        // boolean booleanNum = 1; // error
        boolean booleanTrue = true;
        boolean booleanFalse = false;
        // boolean booleanNum = 0; // error

        String myText = "Hello World";

        // 非プリミティブ型
        // 配列
        String[] cars = {"Ford", "Fiesta", "BMW"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        // System.out.println(cars[3]); // error

        System.out.println("---------------------------------");

        cars[0] = "Honda";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        System.out.println("----------------- for文 ----------------");
        for(int num = 0; num < cars.length; num++){
            System.out.println(cars[num]);
        }

        System.out.println("----------------- 拡張for文 ----------------");
        for(String car:cars){
            System.out.println(car);
        }
        */

        int [][] numbers = {{0,1,2}, {3,4,5}};
        // System.out.println(numbers);
        System.out.print(numbers[0][0]);
        System.out.print(numbers[0][1]);
        System.out.println(numbers[0][2]);

        System.out.print(numbers[1][0]);
        System.out.print(numbers[1][1]);
        System.out.println(numbers[1][2]);

        System.out.println("----------------- for文 ----------------");
        for(int row = 0; row < numbers.length; row++){
            for(int col = 0; col < numbers[row].length; col++){
                System.out.print(numbers[row][col]);
            }
            System.out.print("\n");
        }
    }
}