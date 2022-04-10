import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    void helloWorld() {
        HelloWorld helloWorld = new HelloWorld();

        String res = helloWorld.helloWorld();

        assertThat(res).isEqualTo("Hello world");
    }
}