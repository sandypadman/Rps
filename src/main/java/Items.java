public enum Items {

    ROCK(1 ,"Rock", "Scissors"),
    PAPER(2,"Paper", "Rock"),
    SCISSORS(3,"Scissors", "Paper");

    private final String name;
    private final String beats;
    private final int values;

    Items(int values, String name, String beats) {
        this.name = name;
        this.beats = beats;
        this.values = values;
    }

    public boolean defeats(Items other) {
        return other.name.equals(this.beats);
    }

    @Override
    public String toString() {
        return name;
    }
}
