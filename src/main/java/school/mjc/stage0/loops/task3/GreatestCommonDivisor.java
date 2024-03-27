package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = findGCD(first, second);
        System.out.println(gcd);
    }

    private int findGCD(int a, int b) {
        if (a == 0)
            return b;
        return findGCD(b % a, a);
    }
}
