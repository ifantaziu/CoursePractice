package Lesson4Homework;

public class MinutesConverter {
    public static void main(String[] args) {
        long minutes = 285816352L;
        double days = (int) minutes / 60 / 24; //intentionat am castuit pe integer, pentru ca sa avem zile complete
        double years = (int) days / 365; //intentionat am castuit pe integer, pentru ca sa avem anii completi
        System.out.print("In the " + minutes + " minutes, we have " + days + " days and " + years + " years");
    }
}
