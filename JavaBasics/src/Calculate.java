import javax.swing.JOptionPane;

public class Calculate {
       public static void main(String[] args) {
              String strNum1, strNum2;
              strNum1 = JOptionPane.showInputDialog(null,
                            "Please input the first number: ", "Input the first number: ",
                            JOptionPane.INFORMATION_MESSAGE);
              double num1 = Double.parseDouble(strNum1);
              strNum2 = JOptionPane.showInputDialog(null,
                            "Please input the second number: ", "Input the second number: ",
                            JOptionPane.INFORMATION_MESSAGE);
              double num2 = Double.parseDouble(strNum2);
              Double sum = num1 + num2, dif = num1 - num2, pro = num1 * num2, quo = num1 / num2;
              if (num2 == 0)
                     quo = Double.NaN;
              quo = num1 / num2;
              String resultMessage = "The sum: " + sum + "\n"
                            + "The difference: " + dif + "\n"
                            + "The product: " + pro + "\n"
                            + "The quotient: " + quo;
              JOptionPane.showMessageDialog(null, resultMessage,
                            "Arithmetic Operations", JOptionPane.INFORMATION_MESSAGE);

              System.exit(0);

       }
}