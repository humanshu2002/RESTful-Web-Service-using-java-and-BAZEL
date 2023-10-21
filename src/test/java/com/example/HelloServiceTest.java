package src.test.java.com.example;
import src.main.java.com.example.HelloService;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloServiceTest{
    @Test
    public void testGenerateResponse() {
        String name = "ABC";
        String[] interests = {"Interest1", "Interest2"};

        String response = HelloService.generateResponse(name, interests);

        String[] havearr = response.split("like ");
        String have = havearr[havearr.length-1];

        boolean validInterest = false;
        for (String interest : interests) {
            if (have.equals(interest)) {
                validInterest = true;
                break;
            }
        }

        if(!response.equals(String.format("Nice to meet you ABC, I also like %s",have)))
        {
            validInterest=false;
        }
        assertTrue(validInterest);
    }
}