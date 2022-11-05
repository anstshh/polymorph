package racingCar;

public enum Capacity {
    VERY_SMALL(0,10),
    SMALL(10, 25),
    MEDIUM(25,50),
    LARGE(50,80),
    VERY_LARGE(80,120),
    ;

    private final int from;
    private final int to;

    Capacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}
