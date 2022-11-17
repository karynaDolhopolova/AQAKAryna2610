package homeWork4;

public class Util {
    public static void main(String[] args) {
        int[] mass1 = new int[]{-20, 4, 6, 9, -13, 47, 105, -11, 33, 54, -16, -12, 67, 18, 83, -22, 19, -67, 34, 58};
        System.out.println("All positive even elements of the massive: ");
        positiveEvenMass(mass1);
        sumMass(mass1);
    }

    private static void positiveEvenMass(int[] massive) {
        for (int m : massive) {
            if (m > 0 && m % 2 == 0) {
                System.out.println(m);
            }
        }
    }

    private static void sumMass(int[] massive1) {
        int sum=0;
        for (int j : massive1) {
            if (j > 5 && j < 45) {
                sum += j;
            }
        }
        System.out.print("Sum af all massive elements between 5 and 45 equals ");
        System.out.println(sum);
    }
}
