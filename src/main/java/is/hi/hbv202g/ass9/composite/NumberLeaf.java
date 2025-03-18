package is.hi.hbv202g.ass9.composite;

public class NumberLeaf implements MathExpression {
    private final int numberValue;

    public NumberLeaf(int numberValue) {
        this.numberValue = numberValue;
    }

    public int getResult() {
        return numberValue;
    }
}
