import java.util.ArrayList;

public class PrimeFactors {
    public static int[] primeFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }

        int[] primeFactors = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            primeFactors[i] = factors.get(i);
        }
        return primeFactors;
    }

}
