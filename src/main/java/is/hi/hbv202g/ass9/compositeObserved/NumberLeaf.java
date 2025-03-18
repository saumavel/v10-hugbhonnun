package is.hi.hbv202g.ass9.compositeObserved;

public class NumberLeaf extends Observable implements MathExpression {
    private int numberValue;

    public NumberLeaf(int numberValue) {
        this.numberValue = numberValue;
    }

    public int getResult() {
        return numberValue;
    }

    public void setValue(int newValue) {
        numberValue = newValue;
        notifyObservers();
    }
}
