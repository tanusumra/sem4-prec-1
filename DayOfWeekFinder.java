import java.util.Scanner;

public class DayOfWeekFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7) representing the day of the week: ");
        int dayNumber = scanner.nextInt();

        String dayOfWeek = findDayOfWeek(dayNumber);

        if (dayOfWeek != null) {
            System.out.println("The day of the week is: " + dayOfWeek);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }

    private static String findDayOfWeek(int dayNumber) {
        String dayOfWeek;

        switch (dayNumber) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = null; 
        }

        return dayOfWeek;
    }
}
