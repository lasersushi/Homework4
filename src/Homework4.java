/*
Lucas Walker
Mr. Menezes
9/12/26
*/

public class Homework4 {
    private final static String ArgErrorMessage = "Incorrect argument parameters";

    public static void main(String[] args) {
        String operation = args[0];
        String a = args[1];
        String b = args[2];
        String opposite = args[3];
        calculate(operation, a, b, opposite);
    }

    public static void calculate(String operation, String a, String b, String oppositeOrder) {
        boolean isOp = isOpposite(oppositeOrder);
        boolean aIsInt = CheckInt(a);
        boolean bIsInt = CheckInt(b);
        boolean doubleOp = true;
        double aDouble = Double.parseDouble(a);
        double bDouble = Double.parseDouble(b);
        if (bIsInt && aIsInt) {
            int aInt = (int) (aDouble);
            int bInt = (int) (bDouble);
            System.out.println(computeInt(operation, aInt, bInt));
            doubleOp = false;
        } else {
            System.out.println(computeDouble(operation, aDouble, bDouble));
        }
        if (isOp && doubleOp) {
            System.out.println(computeDouble(operation, bDouble, aDouble));
        } else if (isOp && doubleOp == false) {
            int aIntTwo = (int) (aDouble);
            int bIntTwo = (int) (bDouble);
            System.out.println(computeInt(operation, bIntTwo, aIntTwo));
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

    public static boolean isOpposite(String opOrder) {
        boolean isOp = opOrder.equals("yes");
        return isOp;
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
            throw new IllegalArgumentException(ArgErrorMessage);
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
            throw new IllegalArgumentException(ArgErrorMessage);
        }
        return ans;
    }
}
