import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    void helloWorld() {
        String res = HelloWorld.helloWorld();

        assertThat(res).isEqualTo("Hello World !");
    }
}