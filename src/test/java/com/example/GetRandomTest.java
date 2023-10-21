package src.test.java.com.example;
import src.main.java.com.example.HelloService;

import org.junit.Test;
import static org.junit.Assert.*;

public class GetRandomTest{
    @Test
    public void testGetRandomInterest() {
        String[] interests = {"Interest 1", "Interest 2"};

        String randomInterest = HelloService.getRandomInterest(interests);

        boolean validInterest = false;
        for (String interest : interests) {
            if (randomInterest.equals(interest)) {
                validInterest = true;
                break;
            }
        }

        assertTrue(validInterest);
    }
}

