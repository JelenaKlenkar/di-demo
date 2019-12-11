package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;


    @Before
    public void setUp() throws Exception{
        this.constructorInjectedController= new ConstructorInjectedController(new GreetingServiceImpl());
    }

   @Test
    public void testGreeting() throws Exception{
       assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
   }
}
