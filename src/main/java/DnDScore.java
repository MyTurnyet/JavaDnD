public class DnDScore implements Score {
    private final int value;

    DnDScore(int defaultValue) {
        value = defaultValue;
    }

    public boolean equals(Object obj) {
        return (obj instanceof DnDScore) && ((DnDScore) obj).value == this.value;
    }

    public Score add(DnDScore addend) {
        int sum = addend.value + this.value;
        return new DnDScore(sum);
    }
}
