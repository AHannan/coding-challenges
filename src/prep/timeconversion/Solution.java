package prep.timeconversion;

import java.io.IOException;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        // Extract the hour, minute, and second from the input string
        int hour = Integer.parseInt(s.substring(0, 2));
        int minute = Integer.parseInt(s.substring(3, 5));
        int second = Integer.parseInt(s.substring(6, 8));
        String period = s.substring(8, 10);

        // Convert hour to 24-hour format
        if (hour == 12 && period.equals("AM")) {
            hour = 0;
        } else if (hour < 12 && period.equals("PM")) {
            hour += 12;
        }

        // Format the hour, minute, and second with leading zeros
        String formattedHour = String.format("%02d", hour);
        String formattedMinute = String.format("%02d", minute);
        String formattedSecond = String.format("%02d", second);

        // Return the time in 24-hour format
        return formattedHour + ":" + formattedMinute + ":" + formattedSecond;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(timeConversion("12:01:00AM"));
        System.out.println(timeConversion("12:01:00PM"));
        System.out.println(timeConversion("07:05:45PM"));
    }
}
