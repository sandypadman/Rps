public enum Items {

    ROCK("Rock", "Scissors"),
    PAPER("Paper", "Rock"),
    SCISSORS("Scissors", "Paper");

    private final String name;
    private final String beats;


    Items(String name, String beats) {
        this.name = name;
        this.beats = beats;
    }

    public boolean defeats(Items other) {
        return other.name.equals(this.beats);
    }

    @Override
    public String toString() {
        return name;
    }
}
