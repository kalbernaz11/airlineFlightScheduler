package airlineflightschedule;

import java.util.Scanner;

public class SetClock {

    public static Scanner sc = new Scanner(System.in);
    public static String time;
    public static String day;
    private static String menuMessage;

    public static final String SUN = "U";
    public static final String MON = "M";
    public static final String TUE = "T";
    public static final String WED = "W";
    public static final String THU = "TH";
    public static final String FRI = "F";
    public static final String SAT = "S";

    private static boolean isValid = false;

    public static String setClockMessage() {
        System.out.println("Remember to use military time, and to use the following letters to select a day: "
                + "\n" + SUN + ": SUN"
                + "\n" + MON + ": MON"
                + "\n" + TUE + ": TUE"
                + "\n" + WED + ": WED"
                + "\n" + THU + ": THU"
                + "\n" + FRI + ": FRI"
                + "\n" + SAT + ": SAT");
        return menuMessage;
    }

    public static String getTime() {

        while (isValid == false) {
            System.out.println("Enter a time using military time: ");
            if (sc.hasNextLine()) {
                time = sc.next();
                isValid = true;
            } else {
                System.out.println("***ERROR! Invalid entry. Please try again.");
                isValid = false;
            }

        }//while
        return time;
    }//getTime

    public static String getDay() {
        while (isValid == false) {
            System.out.println("Enter a day: ");
            day = sc.nextLine();
            if (day.equalsIgnoreCase("u")) {
                day = "SUN";
                isValid = true;
            }
            if (day.equalsIgnoreCase("m")) {
                day = "MON";
                isValid = true;
            }
            if (day.equalsIgnoreCase("t")) {
                day = "TUE";
                isValid = true;
            }
            if (day.equalsIgnoreCase("w")) {
                day = "WED";
                isValid = true;
            }
            if (day.equalsIgnoreCase("th")) {
                day = "THU";
                isValid = true;
            }
            if (day.equalsIgnoreCase("f")) {
                day = "FRI";
                isValid = true;
            }
            if (day.equalsIgnoreCase("s")) {
                day = "SAT";
                isValid = true;
            } 

        }//while

        return day;
    }//getDay

}
