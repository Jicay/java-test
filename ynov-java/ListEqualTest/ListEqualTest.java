import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class ListEqualTest {

    @Test
    void areListEquals_shouldReturnTrue_whenListAreEquals() {
        List<String> list1 = List.of("Bonjour", "Hello", "Gracias");
        List<String> list2 = List.of("Bonjour", "Hello", "Gracias");
        boolean res = ListEqual.areListEquals(
                list1,
                list2);

        assertThat(res)
                .withFailMessage("Lists %s and %s are equals, but was not", list1.toString(), list2.toString())
                .isTrue();
    }

    @Test
    void areListEquals_shouldReturnFalse_whenListAreNotEquals() {
        List<String> list1 = List.of("Bonjour", "Gracias", "Hello");
        List<String> list2 = List.of("Bonjour", "Hello", "Gracias");
        boolean res = ListEqual.areListEquals(
                list1,
                list2);

        assertThat(res)
                .withFailMessage("Lists %s and %s are not equals, but was not", list1.toString(), list2.toString())
                .isFalse();
    }

    @Test
    void areListEquals_shouldReturnFalse_whenListAreOfDifferentSize() {
        List<String> list1 = List.of("Bonjour", "Gracias", "Hello");
        List<String> list2 = List.of("Bonjour", "Hello");
        boolean res = ListEqual.areListEquals(
                list1,
                list2);

        assertThat(res)
                .withFailMessage("Lists %s and %s are not equals, but was not", list1.toString(), list2.toString())
                .isFalse();
    }

    @Test
    void areListEquals_shouldReturnTrue_whenListsAreEmpty() {
        boolean res = ListEqual.areListEquals(
                List.of(),
                List.of());

        assertThat(res)
                .withFailMessage("Lists empty are equals, but was not")
                .isTrue();
    }

    @Test
    void areListEquals_shouldReturnTrue_whenListsAreNull() {
        boolean res = ListEqual.areListEquals(
                null,
                null);

        assertThat(res)
                .withFailMessage("Lists empty are null, but was not")
                .isTrue();
    }

    @Test
    void areListEquals_shouldReturnFalse_whenFirstListIsNull() {
        boolean res = ListEqual.areListEquals(
                null,
                List.of("Bonjour"));

        assertThat(res)
                .withFailMessage("List null and [Bonjour] are not equals, but was not")
                .isFalse();
    }

    @Test
    void areListEquals_shouldReturnFalse_whenSecondListIsNull() {
        boolean res = ListEqual.areListEquals(
                List.of("Bonjour"),
                null);

        assertThat(res)
                .withFailMessage("List null and [Bonjour] are not equals, but was not")
                .isFalse();
    }

}