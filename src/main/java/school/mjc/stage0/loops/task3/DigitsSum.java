package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        int sum = 0;
        String numString = "" + number; // Concatenating the number with an empty string to convert it to a string

        for (int i = 0; i < numString.length(); i++) {
            char digitChar = numString.charAt(i); // Accessing each character of the string
            int digit = digitChar - '0'; // Converting the character to its numeric value
            sum += digit;
        }

        System.out.println(sum);
    }
}
