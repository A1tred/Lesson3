package rockScissorsPaper.v1;

import java.util.Scanner;

public class Player {

    private static Scanner inputScanner;

    public Variants getMove() {
        System.out.print("Каким будет твой ход? ");
        inputScanner = new Scanner(System.in);
        String playerInput = inputScanner.nextLine();
        String playerInputU = playerInput.toUpperCase();
        char firstLetter = playerInputU.charAt(0);
        if (firstLetter == 'R' || firstLetter == 'S' || firstLetter == 'P') {
            switch (firstLetter) {
                case 'R':
                    return Variants.ROCK;
                case 'S':
                    return Variants.SCISSORS;
                case 'P':
                    return Variants.PAPER;
            }
        }
        System.out.println("Ты ввел что-то не то, попробуй еще раз!\n");
        return this.getMove();
    }

    public static boolean playAgain() {
        System.out.print("Хочешь сыграть еще раз? ( [Y]es / [N]o ) ");
        String playerInput = inputScanner.nextLine();
        playerInput = playerInput.toUpperCase();
        return playerInput.charAt(0) == 'Y';
    }
}