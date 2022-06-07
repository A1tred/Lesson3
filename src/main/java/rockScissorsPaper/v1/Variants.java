package rockScissorsPaper.v1;

public enum Variants {
    ROCK, SCISSORS, PAPER;

    public int compareMoves(Variants otherChoice) {
        if (this == otherChoice)
            return 0;

        switch (this) {
            case ROCK:
                return (otherChoice == SCISSORS ? 1 : -1);
            case SCISSORS:
                return (otherChoice == PAPER ? 1 : -1);
            case PAPER:
                return (otherChoice == ROCK ? 1 : -1);
        }
        return 0;
    }
}
