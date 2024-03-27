package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBorder, int secondBorder) {
        int smaller = Math.min(firstBorder, secondBorder);
        int larger = Math.max(firstBorder, secondBorder);

        int sum = 0;
        for (int i = smaller; i <= larger; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
