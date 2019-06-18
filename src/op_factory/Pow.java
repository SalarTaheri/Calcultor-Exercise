package op_factory;

import java.util.Scanner;

public class Pow implements Operator {
    @Override
    public int doOperation(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return 2;
        } else if (b > 1) {
            int sum = a;
            for (int i = 1; i < b; i++) {
                sum *= a;
            }
            return sum;
        } else {
            return -1;
        }
    }
}
