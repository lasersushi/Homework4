/*
Lucas Walker
Mr. Menezes
9/12/26
*/

public class Homework4 {
    public static void main(String[]args) {

    }
    public static void calculate(String operation, String a, String b, String oppositeOrder) {
        boolean aIsInt = CheckInt(a);
        if (aIsInt == true) {
            int aInt = Integer.parseInt(a);
        }
        else {
            double aDouble = Double.parseDouble(a);
        }
        boolean bIsInt = CheckInt(b);
        if (bIsInt == true) {
            int bInt = Integer.parseInt(b);
        }
        else {
            double bDouble = Double.parseDouble(b);
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
}
