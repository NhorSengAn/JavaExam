import java.text.DateFormatSymbols;
import java.util.Scanner;

public class ShortDateConverter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        
        String[] dateParts = shortDate.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

       
        String monthName = getMonthName(month);

        
        String fullDate = monthName + " " + day + ", " + year;
        System.out.println("Full date: " + fullDate);
    }

    private static String getMonthName(int month) {
        return new DateFormatSymbols().getMonths()[month - 1];
    }
}