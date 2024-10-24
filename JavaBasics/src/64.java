import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the month (full name, abbreviation, 3 letters, or number): ");
            String monthInput = scanner.next();

            System.out.print("Enter the year: ");
            int year = scanner.nextInt();

            int month = getMonth(monthInput);
            if (month == -1) {
                System.out.println("Invalid month. Please try again.");
                continue;
            }

            int daysInMonth = getDaysInMonth(month, year);
            if (daysInMonth == -1) {
                System.out.println("Invalid year. Please try again.");
                continue;
            }

            System.out.println("The month of " + monthInput + " " + year + " has " + daysInMonth + " days.");
            break;
        }

        scanner.close();
    }

    private static int getMonth(String monthInput) {
        String[] monthNames = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] monthAbbreviations = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        String[] month3Letters = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        for (int i = 0; i < 12; i++) {
            if (monthInput.equalsIgnoreCase(monthNames[i])|| monthInput.equalsIgnoreCase(month3Letters[i]) || monthInput.equalsIgnoreCase(monthAbbreviations[i]) 
            		|| monthInput.equals(String.valueOf(i + 1))) {
                return i + 1;
            }
        }

        return -1;
    }

    private static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        return daysInMonth[month - 1];
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}