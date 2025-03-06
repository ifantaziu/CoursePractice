package Lesson4Homework;

public class MinutesConverter {
    public static void main(String[] args) {
        long minutes = 285816352L;
        double days = (int) minutes / 60 / 24;
        double years = (int) days / 365;
        System.out.print("In the " + minutes + " minutes, we have " + days + " days and " + years + " years");
    }
}
