import java.util.Scanner;
public class Triangle
{
    // 实例变量 - 用你自己的变量替换下面的例子
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        validate(in);
        int a = in.nextInt();
        System.out.println("Input second number: ");
        validate(in);
        int b = in.nextInt();
        System.out.println("Input third number: ");
        validate(in);
        int c = in.nextInt();
        if (!checkzero(a) || !checkzero(b) || !checkzero(c)) {
        System.out.println("Input cannot be negative or zero.");
        return;
    } else System.out.println(checktriangle(a, b, c));
        
    }
    
    public static boolean checktriangle(int a, int b, int c) {
        return (a + b >= c && a + c >= b && b + c >= a);
    }
    
    public static boolean checkzero(int n) {
        return n > 0;
    }
    
    public static void validate(Scanner a) {
        if (!a.hasNextDouble()) {
            System.err.println(a.next() + " is not a number.");
        }
    }
}
