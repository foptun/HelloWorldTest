import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FirstTest {
    @Test
    public void helloWorldTitle() {
        HelloWorld helloWorld = new HelloWorld("World");
        String message = helloWorld.getMessage();
        assertEquals("Hello World", message);
    }

    @Test
    public void helloFoptunTitle() {
        HelloWorld helloWorld = new HelloWorld("Foptun");
        String message = helloWorld.getMessage();
        assertEquals("Hello Foptun", message);
    }
}
