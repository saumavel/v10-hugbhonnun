package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class PlusComposite extends AbstractComposite{
    public int getResult() {
        int result = 0;
        for (MathExpression child : children) {
            result += child.getResult();
        }
        return result;
    }
}
