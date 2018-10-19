package geecon.micronaut

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.Specification

class ExampleFunctionSpec extends Specification {

    void "test example function"() {
        given:
        EmbeddedServer server = ApplicationContext.run(EmbeddedServer)
        ExampleClient client = server.getApplicationContext().getBean(ExampleClient)

        expect:
        client.example().blockingGet() == [ message: "Gotcha!" ]

        cleanup:
        if(server != null) server.stop()
    }
}
