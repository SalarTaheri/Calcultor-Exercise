import op_factory.Operator;
import op_factory.OperatorFactory;

import java.util.Scanner;

public class Main {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        boolean go = true;
        while (go) {
            int action;
            System.out.println("enter action number: ");
            System.out.println("1.Continue");
            System.out.println("2.exit");
            action = main.scanner.nextInt();
            if (action == 1) {
                main.startOperation();
            } else if (action == 2) {
                go = false;
            } else {
                System.err.println("wrong input");
            }
        }
    }

    private void startOperation() {
        int a, b;
        OperatorFactory.Operation op;
        System.out.println("a=");
        a = getIntegerFromInput();
        System.out.println("b=");
        b = getIntegerFromInput();
        op = getOperationFromInput();
        int result = doOperation(a, b, op);
        System.out.println(a + " " + op.name() + " " + b + " = " + result);
    }

    private int doOperation(int a, int b, OperatorFactory.Operation op) {
        Operator operator = OperatorFactory.getOperator(op);
        return operator.doOperation(a, b);
    }

    private OperatorFactory.Operation getOperationFromInput() {
        boolean go = true;
        OperatorFactory.Operation op = OperatorFactory.Operation.add;
        while (go) {
            showOperations();
            System.out.print("enter operation number: ");
            int opNum = getIntegerFromInput();
            OperatorFactory.Operation[] values = OperatorFactory.Operation.values();
            if (opNum >= 0 && opNum < values.length) {
                go = false;
                op = values[opNum];
            } else {
                System.err.println("!!!wrong input!!!\ntry again");
            }
        }
        return op;
    }

    private void showOperations() {
        OperatorFactory.Operation[] values = OperatorFactory.Operation.values();
        for (OperatorFactory.Operation value : values) {
            System.out.println(value.ordinal() + "." + value.name());
        }
    }

    private int getIntegerFromInput() {
        return scanner.nextInt();
    }
}
