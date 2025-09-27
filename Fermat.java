import java.util.Scanner;

public class Fermat {
    public static void main(String[] args) {
        System.out.println(fermat(1,2,3,1)); // 
        System.out.println(fermat(2,3,4,5));
    }
    
    public static String fermat(int a, int b, int c, int n) {
        if (n >= 2 && Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n)) return "Holy smokes, Fermat was wrong!";
        return "No, that doesn't work";
    }
}