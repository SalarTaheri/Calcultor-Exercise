package op_factory;

public class Add implements Operator {
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
