import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("task 1\ninput: ");
        int n1 = sc.nextInt();
        System.out.println("output: " + task1(n1) + "\n");
        System.out.print("task 2\ninput: ");
        int n2 = sc.nextInt();
        System.out.println("output: " + task2(n2) + "\n");
        System.out.print("task 3\ninput for n: ");
        int n3 = sc.nextInt();
        System.out.print("input for b: ");
        int b1 = sc.nextInt();
        System.out.println("output: " + task3(n3, b1) + "\n");
        System.out.print("task 4\ninput: ");
        int n4 = sc.nextInt();
        System.out.print("output: ");
        task4(n4, sc);
        sc.close();
    }
    public static int task1(int n) {
        if (n <= 1) {
            return 0;
        }
        int current = n - 1;
        return (current * current) + task1(n - 1);
    }
    public static int task2(int n) {
        if (n < 1) {
            return 0;
        }
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        if (n > arr.length) n = arr.length;
        int current1 = arr[n-1];
        return (current1) + task2(n-1);
    }
    public static int task3(int n, int b) {
        if (n < 0) {
            return 0;
        }
        return (int) (Math.pow(b, n) + task3(n - 1, b));
    }
    public static void task4(int n, Scanner sc) {
        if (n <= 0) {
            return;
        }
        int current = sc.nextInt();
        task4(n - 1, sc);
        System.out.print(current + " ");
    }
}