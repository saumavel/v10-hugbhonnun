package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;
import java.util.ArrayList;
import java.util.List;

    public abstract class AbstractComposite implements Observer,MathExpression {
        protected final List<MathExpression> children = new ArrayList<>();
        private  int lastObservedResult;
        public void update(){
            lastObservedResult = getResult();
            System.out.println("Last observed result: "+lastObservedResult);
        }
        public int getLastObservedResult(){
            return lastObservedResult;
        }
        public abstract int getResult();
        public void add(MathExpression child) {
            children.add(child);
        }
    }
