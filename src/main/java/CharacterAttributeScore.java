public class CharacterAttributeScore extends DnDScore implements AttributeScore {

    CharacterAttributeScore(int defaultValue) {
        super(defaultValue);
    }

    CharacterAttributeScore() {
        this(0);
    }

    public boolean equals(Object obj) {
        return (obj instanceof CharacterAttributeScore) && super.equals(obj);
    }
}
