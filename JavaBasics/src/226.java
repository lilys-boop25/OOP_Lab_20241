import javax.swing.JOptionPane;

public class rootsOfEquation {
    public static void solveLinearEquation() {
        String strA, strB;
        strA = JOptionPane.showInputDialog(null, "Please enter the first coefficient a: ",
                "Linear Equation Solver", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);
        strB = JOptionPane.showInputDialog(null, "Please enter the second coefficient b: ",
                "Linear Equation Solver", JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(strB);
        String res;
        if (a == 0) {
            if (b == 0) {
                res = "The equation has infinitely many solutions.";
                JOptionPane.showMessageDialog(null, res, "Linear Equation Solver",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                res = "The equation has no solution";
                JOptionPane.showMessageDialog(null, res, "Linear Equation Solver",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            return;
        }
        double x = -b / a;
        String resultMessage = "The solution to the equation is:\n" + "x = " + x;
        JOptionPane.showMessageDialog(null, resultMessage,
                "Linear Equation Solver", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static void solveLinearSystem() {
        String strA1, strA2, strB1, strB2, strC1, strC2;
        strA1 = JOptionPane.showInputDialog(null, "The coefficient a1: ",
                "Linear System Solver", JOptionPane.INFORMATION_MESSAGE);
        double a1 = Double.parseDouble(strA1);
        strB1 = JOptionPane.showInputDialog(null, "The coefficient b1: ",
                "Linear System Solver", JOptionPane.INFORMATION_MESSAGE);
        double b1 = Double.parseDouble(strB1);
        strC1 = JOptionPane.showInputDialog(null, "The first coefficient c1: ",
                "Linear System Solver", JOptionPane.INFORMATION_MESSAGE);
        double c1 = Double.parseDouble(strC1);
        strA2 = JOptionPane.showInputDialog(null, "The coefficient a2: ",
                "Linear System Solver", JOptionPane.INFORMATION_MESSAGE);
        double a2 = Double.parseDouble(strA2);
        strB2 = JOptionPane.showInputDialog(null, "The coefficient b2: ",
                "Linear System Solver", JOptionPane.INFORMATION_MESSAGE);
        double b2 = Double.parseDouble(strB2);
        strC2 = JOptionPane.showInputDialog(null, "The coefficient c2: ",
                "Linear System Solver", JOptionPane.INFORMATION_MESSAGE);
        double c2 = Double.parseDouble(strC2);

        double D = a1 * b2 - a2 * b1;
        double D1 = c2 * b1 - c1 * b2;
        double D2 = a2 * c1 - a1 * c2;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.",
                        "Linear System Solver", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solution.",
                        "Linear System Solver", JOptionPane.INFORMATION_MESSAGE);
            }
            return; 
        }

        double x = D1 / D;
        double y = D2 / D;
        String resultMessage = "The solution to the Linear System is:\n" + "x = " + x
                + "\n" + "y = " + y;
        JOptionPane.showMessageDialog(null, resultMessage,
                "Linear System Solver", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static void solveQuadraticEquation() {
        String strA, strB, strC;
        strA = JOptionPane.showInputDialog(null, "The coefficient a: ",
                "Quadratic Equation Solver", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);
        strB = JOptionPane.showInputDialog(null, "The coefficient b: ",
                "Quadratic Equation Solver", JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(strB);
        strC = JOptionPane.showInputDialog(null, "The coefficient c: ",
                "Quadratic Equation Solver", JOptionPane.INFORMATION_MESSAGE);
        double c = Double.parseDouble(strC);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "This is not a quadratic equation.",
                    "Quadratic Equation Solver", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "The equation has no real roots.",
                    "Quadratic Equation Solver", JOptionPane.INFORMATION_MESSAGE);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            String resultMessage = "The equation has a double root:\n" + "x = " + root;
            JOptionPane.showMessageDialog(null, resultMessage,
                    "Quadratic Equation Solver", JOptionPane.INFORMATION_MESSAGE);
        } else {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            String resultMessage = "The roots of the equation are:\n"
                    + "x1 = " + root1 + "\n"
                    + "x2 = " + root2;
            JOptionPane.showMessageDialog(null, resultMessage,
                    "Quadratic Equation Solver", JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }

    public static void main(String[] args) {
        int choice;
        String strChoice = JOptionPane.showInputDialog(null,
                "Choose an option:\n"
                        + "1. Solve Linear Equation\n"
                        + "2. Solve Linear System\n"
                        + "3. Solve Quadratic Equation",
                "Equation Solver", JOptionPane.INFORMATION_MESSAGE);
        choice = Integer.parseInt(strChoice);

        if (choice == 1) {
            solveLinearEquation();
        } else if (choice == 2) {
            solveLinearSystem();
        } else if (choice == 3) {
            solveQuadraticEquation();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid choice.",
                    "Equation Solver", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}