package op_factory;

public class OperatorFactory {

    public static Operator getOperator(Operation op) {
        switch (op) {
            case add:
                return new Add();
            case minus:
                return new Minus();
            case multiply:
                return new Multiply();
            case divide:
                return new Devide();
            case pow:
                return new Pow();
            default:
                return (a, b) -> 0;
        }
    }

    public enum Operation {
        add, minus, multiply, divide, pow
    }
}
