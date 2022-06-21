package domain;

public enum Floor{
    GROUND_FLOOR(0),
    FIRST(1),
    SECOND(2),
    THIRD(3),
    FOURTH(4),
    FIFTH(5),
    SIXTH(6),
    SEVENTH(7),
    EIGHTH(8),
    NINTH(9),
    TENTH(10);

    private int value;

    Floor(int value) {
        this.value = value;
    }
}
