import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        
        Scanner in = new Scanner(System.in);
        int guess;
        System.out.println("I'm thinking of a number between 1 and 100 \n(including both). Can you guess what it is? \nType a number: ");
        guess = in.nextInt();
        
        System.out.print("Your guess is: " + guess + ". ");
        if (guess == number) {
            System.out.println("It is correct!");
            return;
        } else if (guess < number) {
            System.out.println("It is too low");
        }
        else {
            System.out.println("It is too high");
        }
        
        System.out.print("Try again: ");
        guess = in.nextInt();
        System.out.print("Your guess is: " + guess + ". ");
        if (guess == number) {
            System.out.println("It is correct!");
            return;
        } else if (guess < number) {
            System.out.println("It is too low");
        }
        else {
            System.out.println("It is too high");
        }
        
        System.out.print("Last guess: ");
        guess = in.nextInt();
        System.out.print("Your guess is: " + guess + ". ");
        if (guess == number) {
            System.out.println("It is correct!");
            return;
        } else System.out.println("You failed. The answer is " + number);
        
        
        
    }
}