package rockScissorsPaper.v1;

public class Game {

    Player player;
    Computer computer;

    public Game() {
        player = new Player();
        computer = new Computer();
    }

    public void startGame() {
        Variants playerMove = player.getMove();
        System.out.println("\nТвой ход " + playerMove + ".");
        Variants computerMove = computer.getMove();
        System.out.println("Ход компьютера " + computerMove + ".\n");
        int compareMoves = playerMove.compareMoves(computerMove);
        switch (compareMoves) {
            case 0:
                System.out.println("Ничья!\n");
                break;
            case 1:
                System.out.println(playerMove + " бьет " + computerMove + ". Ты победил!\n");
                break;
            case -1:
                System.out.println(computerMove + " бьет " + playerMove + ". Ты проиграл...\n");
                break;
        }
        if (Player.playAgain()) {
            System.out.println();
            startGame();
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        System.out.println();
        System.out.println("Добро пожаловать в игру: [R]ock, [S]cissors, [P]aper! \nВыбери один из вариантов, чтобы начать игру..\n");
        game.startGame();
    }
}
