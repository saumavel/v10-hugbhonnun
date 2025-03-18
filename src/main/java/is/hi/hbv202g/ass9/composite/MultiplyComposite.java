package is.hi.hbv202g.ass9.composite;
// stores arbitrary amount of mathematical expressions as children that are multiplied with each other when getResult is called

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {
    private final List<MathExpression> children = new ArrayList<>();

    public int getResult() {
        int result = 1;
        for (MathExpression child : children) {
            result *= child.getResult();
        }
        return result;
    }
    public void add(MathExpression child) {
        children.add(child);
    }
}
