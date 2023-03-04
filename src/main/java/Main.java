/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName;

        System.out.println("Please enter your name:");
        Scanner keyboard = new Scanner(System.in);
        userName = keyboard.nextLine();

        if (userName.equals("Alice")) {
            System.out.println("Hello " + userName);
        }
        if (userName.equals("Bob")) {
            System.out.println("Hello " + userName);
        }
    }
}
