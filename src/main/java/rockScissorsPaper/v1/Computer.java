package rockScissorsPaper.v1;

import java.util.Random;

public class Computer {

    public Variants getMove() {
        Variants[] move = Variants.values();
        Random random = new Random();
        int index = random.nextInt(move.length);
        return move[index];
    }
}
