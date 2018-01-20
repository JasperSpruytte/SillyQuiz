package be.jasperspruytte.sillyquiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SillyQuiz {

    private static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        System.out.println("What's up, dog?");
        String response = userInput.readLine();
        if (response == "Nothing much") {
            System.out.println("Cool, dawg.");
        } else {
            System.out.println("'" + response + "'? Really? I mean, really?");
        }
        System.out.println("That's all folks.");
        System.out.println("So pisss off.");
    }
}
