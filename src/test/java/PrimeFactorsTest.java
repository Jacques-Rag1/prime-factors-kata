import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorsTest {

    @Test
    public void primeFactors_should_return_list_with_2_for_2() {
        int[] expected = {2};
        assertThat(PrimeFactors.primeFactors(2)).isEqualTo(expected);
    }

    @Test
    public void primeFactors_should_return_list_with_3_for_3() {
        int[] expected = {3};
        assertThat(PrimeFactors.primeFactors(3)).isEqualTo(expected);
    }

    @Test
    public void primeFactors_should_return_list_of_2_and_2_for_3() {
        int[] expected = {2, 2};
        assertThat(PrimeFactors.primeFactors(4)).isEqualTo(expected);
    }


}