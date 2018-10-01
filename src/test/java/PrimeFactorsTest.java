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
    public void primeFactors_should_return_list_of_2_and_2_for_4() {
        int[] expected = {2, 2};
        assertThat(PrimeFactors.primeFactors(4)).isEqualTo(expected);
    }
    @Test
    public void primeFactors_should_return_list_of_2_and_3_for_6() {
        int[] expected = {2, 3};
        assertThat(PrimeFactors.primeFactors(6)).isEqualTo(expected);
    }

    @Test
    public void primeFactors_should_return_list_of_2_and_5_for_10() {
        int[] expected = {2, 5};
        assertThat(PrimeFactors.primeFactors(10)).isEqualTo(expected);
    }
    @Test
    public void primeFactors_for_60(){
        int[] expected = {2,2,3,5};
        assertThat(PrimeFactors.primeFactors(60)).isEqualTo(expected);
    }

    @Test
    public void primeFactors_for_1_should_return_an_empty_list() {
        int[] expected = {};
        assertThat(PrimeFactors.primeFactors(1)).isEqualTo(expected);
    }
    @Test
    public void primeFactors_for_negative_should_return_an_empty_list() {
        int[] expected = {};
        assertThat(PrimeFactors.primeFactors(-20)).isEqualTo(expected);
    }


}