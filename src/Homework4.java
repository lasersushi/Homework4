/*
Lucas Walker
Mr. Menezes
9/12/26
*/

public class Homework4 {
    private final static String ArgErrorMessage = "Incorrect argument parameters"; // Error message which is thrown when
                                                                                   // you have inccorect arguement
                                                                                   // params

    public static void main(String[] args) {
        String operation = args[0];
        String a = args[1];
        String b = args[2];
        String opposite = args[3]; // Takes in the arguements
        calculate(operation, a, b, opposite); // Calls the calculate method
    }

    public static void calculate(String operation, String a, String b, String oppositeOrder) {
        boolean isOp = isOpposite(oppositeOrder);
        boolean aIsInt = checkInt(a);
        boolean bIsInt = checkInt(b);
        boolean doubleOp = true;
        double aDouble = Double.parseDouble(a);
        double bDouble = Double.parseDouble(b);
        if (bIsInt && aIsInt) { // Converts the doubles to ints
            int aInt = (int) (aDouble);
            int bInt = (int) (bDouble);
            System.out.println(computeInt(operation, aInt, bInt));
            doubleOp = false;
        } else { // If it isn't an int then just do the operation with doubles
            System.out.println(computeDouble(operation, aDouble, bDouble));
        }
        if (isOp && doubleOp) { // Checks if it is opposite and also prints the opposite one
            System.out.println(computeDouble(operation, bDouble, aDouble));
        } else if (isOp && doubleOp == false) {
            int aIntTwo = (int) (aDouble);
            int bIntTwo = (int) (bDouble);
            System.out.println(computeInt(operation, bIntTwo, aIntTwo));
        }
    }

    public static boolean checkInt(String a) {
        boolean ans = false;
        if (a.indexOf(".") == -1) { // This method checks if the iputed values are integers
            ans = true;
        }
        return ans;
    }

    public static boolean isOpposite(String opOrder) {
        boolean isOp = opOrder.equals("yes"); // This method checks if oppositeoder is on

        return isOp;
    }

    public static int computeInt(String op, int a, int b) { // This method does the assigned operation.
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

    public static double computeDouble(String op, double a, double b) { // This method also does the assigned operation
                                                                        // but for doubles
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
