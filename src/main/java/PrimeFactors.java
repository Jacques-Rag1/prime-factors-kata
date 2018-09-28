import java.util.ArrayList;

public class PrimeFactors {
    public static int[] primeFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        if (number % 2 == 0) {
            factors.add(2);
            number /= 2;
        }
        if (number % 2 == 0) {
            factors.add(2);
            number /= 2;
        }
        if (number % 3 == 0) {
            factors.add(3);
            number /= 3;
        }
        int[] primeFactors = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            primeFactors[i] = factors.get(i);
        }
        return primeFactors;
    }

}
