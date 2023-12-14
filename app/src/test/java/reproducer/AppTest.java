package reproducer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getGreeting() {
        assertNotNull(new App().greeting, "should have a string");
    }
}
