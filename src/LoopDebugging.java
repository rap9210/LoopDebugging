import java.util.Scanner;

public class LoopDebugging {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";
        System.out.println("Input as many words as you please");
        System.out.println("Enter '#' to terminate program");
        userInput = keyboard.next();

        while (!userInput.equals("#")) {
            System.out.println(userInput);
            userInput = keyboard.next();
        }

    }
}
