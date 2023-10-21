package src.test.java.com.example;
import src.main.java.com.example.HelloService;

import org.junit.Test;
import static org.junit.Assert.*;

public class NullInterestTest{
    @Test
    public void testGenerateResponse() {
        String name = "John Doe";
        String[] interests = {};

        String response = HelloService.generateResponse(name, interests);

        assertEquals("Nice to meet you John Doe, I also like something", response);
    }
}
