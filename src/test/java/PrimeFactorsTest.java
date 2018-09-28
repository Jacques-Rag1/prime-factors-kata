import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorsTest {

    @Test
    public void primeFactors_should_return_list_with_2_for_2() {
        int[] expected = {2};
        assertThat(PrimeFactors.primeFactors(2)).isEqualTo(expected);
    }

}