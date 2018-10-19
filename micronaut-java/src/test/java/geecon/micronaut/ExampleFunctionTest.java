package geecon.micronaut;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleFunctionTest {

    @Test
    public void testFunction() throws Exception {
        EmbeddedServer server = ApplicationContext.run(EmbeddedServer.class);

        ExampleClient client = server.getApplicationContext().getBean(ExampleClient.class);

        assertEquals(client.index().blockingGet(), new ExampleMessage("Gotcha!"));
        server.stop();
    }
}
