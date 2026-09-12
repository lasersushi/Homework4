/*
Lucas Walker
Mr. Menezes
9/12/26
*/

public class Homework4 {
    public static void main(String[] args) {

    }

    public static void calculate(String operation, String a, String b, String oppositeOrder) {
        boolean aIsInt = CheckInt(a);
        boolean bIsInt = CheckInt(b);
        boolean doubleOp = true;
        double aDouble = Double.parseDouble(a);
        double bDouble = Double.parseDouble(b);
        if (bIsInt && aIsInt) {
            int aInt = (int)(aDouble);
            int bInt = (int)(bDouble);
            computeInt(operation, aInt, bInt);
            doubleOp = false;
        }
        else {
            computeDouble(operation, aDouble, bDouble);
        }
    }

    public static boolean CheckInt(String a) {
        boolean ans = false;
        double Parsed = Double.parseDouble(a);
        if (Parsed % 1 == 0) {
            ans = true;
        }
        return ans;
    }

    public static int computeInt(String op, int a, int b) {
        int ans = 0;
        if (op.equals("add")) {
            ans = a + b;
        } else if (op.equals("subtract")) {
            ans = a - b;
        } else if (op.equals("divide")) {
            ans = a / b;
        } else if (op.equals("multiply")) {
            ans = a * b;
        } else {
            throw new IllegalArgumentException("Incorrect argument parameters");
        }
        return ans;
    }

    public static double computeDouble(String op, double a, double b) {
        double ans = 0;
        if (op.equals("add")) {
            ans = a + b;
        } else if (op.equals("subtract")) {
            ans = a - b;
        } else if (op.equals("divide")) {
            ans = a / b;
        } else if (op.equals("multiply")) {
            ans = a * b;
        } else {
            throw new IllegalArgumentException("Incorrect argument parameters");
        }
        return ans;
    }
}
