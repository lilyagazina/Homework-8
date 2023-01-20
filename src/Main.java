import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        // 1 массив:
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        System.out.println(integer[2]);
        // 2 массив:
        double[] fractional = {1.57, 7.654, 9.986};
        System.out.println(fractional[2]);
        // 3 массив:
        int[] days = new int[30];
        days[3] = 14;
        days[6] = 10;
        days[9] = 18;
        days[23] = 13;
        System.out.println(days[23]);
    }

    public static void task2() {
        System.out.println("Задача 2");
        // 1 массив:
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        System.out.println(integer[0] + ", " + integer[1] + ", " + integer[2]);
        System.out.println(integer.length + ", " );
        // 2 массив:
        double[] fractional = {1.57, 7.654, 9.986};
        System.out.println(fractional[0] + ", " + fractional[1] + ", " + fractional[2]);
        // 3 массив:
        int[] days = new int[30];
        days[3] = 14;
        days[6] = 10;
        days[9] = 18;
        days[23] = 13;
        System.out.println(days[3] + ", " + days[6] + ", " + days[9] + ", " + days[23]);
    }

    public static void task3() {
        System.out.println("Задача 3");
        // 1 массив:
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        System.out.println(integer[2] + ", " + integer[1] + ", " + integer[0]);
        // 2 массив:
        double[] fractional = {1.57, 7.654, 9.986};
        System.out.println(fractional[2] + ", " + fractional[1] + ", " + fractional[0]);
        // 3 массив:
        int[] days = new int[30];
        days[3] = 14;
        days[6] = 10;
        days[9] = 18;
        days[23] = 13;
        System.out.println(days[23] + ", " + days[9] + ", " + days[6] + ", " + days[3]);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 2 != 0) {
                integer[i] += 1;
            }
            System.out.println(integer[i]);
        }
    }
}
