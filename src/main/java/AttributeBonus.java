public class AttributeBonus extends DnDScore {

    AttributeBonus(int baseValue) {
        super(baseValue);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof AttributeBonus) && super.equals(obj);
    }

    Score applyToScore(DnDScore baseScore) {
        return super.add(baseScore);
    }
}
