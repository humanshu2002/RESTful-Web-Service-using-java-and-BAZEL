package src.test.java.com.example;
import src.main.java.com.example.HelloService;

import org.junit.Test;
import static org.junit.Assert.*;

public class NullNameTest{
    @Test
    public void testGenerateResponse() {
        String name = "";
        String[] interests = {"Interest1", "Interest2"};

        String response = HelloService.generateResponse(name, interests);

        assertEquals("Please provide a name in the query parameter.", response);
    }
}