package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0) {
            System.out.println("0");
            return;
        }

        long sum = 0;
        long num = 9;
        long multiplier = 1;

        for (int i = 0; i < lengthOfLastNumber; i++) {
            sum += num * multiplier;
            multiplier *= 10;
            num += 9;
        }

        System.out.println(sum);
    }
}
