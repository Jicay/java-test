import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Random;
import org.junit.jupiter.api.Test;

class FloatOperationTest {

    @Test
    void addTwoFloats_shouldComputeCorrectValue_whenHaveRandomFloats() {
        Random random = new Random();
        float a = 1000 * random.nextFloat();
        float b = 1000 * random.nextFloat();

        float res = FloatOperation.addTwoFloats(a, b);

        assertThat(res)
                .withFailMessage("%f + %f should be equal to %f, but was %f", a, b, a+b, res)
                .as("Run %f + %f", a, b)
                .isEqualTo(a + b);
    }

    @Test
    void addTwoFloats_shouldComputeCorrectValue_whenHaveRandomNegFloats() {
        Random random = new Random();
        float a = 1000 * random.nextFloat();
        float b = -1000 * random.nextFloat();

        float res = FloatOperation.addTwoFloats(a, b);

        assertThat(res)
                .withFailMessage("%f + %f should be equal to %f, but was %f", a, b, a+b, res)
                .as("Run %f + %f", a, b)
                .isEqualTo(a + b);

    }

    @Test
    void divideTwoFloats_shouldComputeCorrectValue_whenHaveRandomFloats() {
        Random random = new Random();
        float a = 1000 * random.nextFloat();
        float b = 1000 * random.nextFloat() + 1;

        float res = FloatOperation.divideTwoFloats(a, b);

        assertThat(res)
                .withFailMessage("%f / %f should be equal to %f, but was %f", a, b, a/b, res)
                .as("Run %f / %f", a, b)
                .isEqualTo(a / b);
    }

    @Test
    void divideTwoFloats_shouldComputeCorrectValue_whenHaveRandomNegFloats() {
        Random random = new Random();
        float a = 1000 * random.nextFloat();
        float b = -1000 * random.nextFloat() - 1;

        float res = FloatOperation.divideTwoFloats(a, b);

        assertThat(res)
                .withFailMessage("%f / %f should be equal to %f, but was %f", a, b, a/b, res)
                .as("Run %f / %f", a, b)
                .isEqualTo(a / b);
    }
}