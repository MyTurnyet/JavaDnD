public interface Score {
    @Override
    boolean equals(Object obj);

    Score add(DnDScore addend);
}
