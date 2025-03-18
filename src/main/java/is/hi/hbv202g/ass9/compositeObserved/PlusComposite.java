package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements Observer, MathExpression {
    private final List<MathExpression> children = new ArrayList<>();
    private  int lastObservedResult;
    public void update(){
        lastObservedResult = getResult();
        System.out.println("Last observed result: "+lastObservedResult);
    }

    public int getLastObservedResult(){
        return lastObservedResult;
    }
    public int getResult() {
        int result = 0;
        for (MathExpression child : children) {
            result += child.getResult();
        }
        return result;
    }
    public void add(MathExpression child) {
        children.add(child);
    }
}
