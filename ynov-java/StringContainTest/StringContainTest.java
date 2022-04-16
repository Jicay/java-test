import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class StringContainTest {

    @Test
    void isStringContainedIn_shouldReturnTrue_withBonAndBonjour() {
        boolean res = StringContain.isStringContainedIn("Bon", "Bonjour");

        assertThat(res)
                .withFailMessage("Should return true for with sublist \"Bon\" and string \"Bonjour\", but return false")
                .isTrue();
    }

    @Test
    void isStringContainedIn_shouldReturnFalse_withBonAndBonjourLowerCase() {
        boolean res = StringContain.isStringContainedIn("Bon", "bonjour");

        assertThat(res)
                .withFailMessage("Should return false for with sublist \"Bon\" and string \"bonjour\", but return true")
                .isFalse();
    }

    @Test
    void isStringContainedIn_shouldReturnFalse_withHelloAndBonjour() {
        boolean res = StringContain.isStringContainedIn("Hello", "Bonjour");

        assertThat(res)
                .withFailMessage("Should return false for with sublist \"Hello\" and string \"Bonjour\", but return true")
                .isFalse();
    }

    @Test
    void isStringContainedIn_shouldReturnFalse_withNullAndBonjour() {
        boolean res = StringContain.isStringContainedIn(null, "Bonjour");

        assertThat(res)
                .withFailMessage("Should return false for with sublist null and string \"Bonjour\", but return true")
                .isFalse();
    }

    @Test
    void isStringContainedIn_shouldReturnFalse_withHelloAndNull() {
        boolean res = StringContain.isStringContainedIn("bon", null);

        assertThat(res)
                .withFailMessage("Should return false for with sublist \"bon\" and string null, but return true")
                .isFalse();
    }

}