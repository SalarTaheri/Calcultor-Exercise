package op_factory;

public class Minus implements Operator {
    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
