package input;

import java.util.Scanner;

public class InputTaker {
    public int takeInteger(String message) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer input: ");
        System.out.print(message);

        int n = sc.nextInt();

        System.out.println("You have entered: " + n);

        return n;
    }
}