import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = in.nextInt();
        System.out.println("Input b: ");
        int b = in.nextInt();
        System.out.println("Input c: ");
        int c = in.nextInt();
        int dis = discriminantcheck(a,b,c);
        //checking for erros
        if (a == 0) {
            //dividing by zero
            System.out.println("Cannot divide by zero.");
            return;
        }
        
        if (dis < 0) {
            System.out.println("Cannot find real solution.");
            return;
        } else if (dis == 0) {
            System.out.println("x = " + (-b / (2*a)));
        } else System.out.println("x = " + ((-b + Math.sqrt(b*b - 4*a*c))/(2*a)) + " and " + ((-b - Math.sqrt(b*b - 4*a*c))/(2*a)));
        
    }
    
    public static int discriminantcheck(int a, int b, int c) {
        double dis = Math.pow(b, 2) - 4*a*c;
        if (dis < 0) return -1;
        if (dis == 0) return 0;
        return 1;
    }
    
}
