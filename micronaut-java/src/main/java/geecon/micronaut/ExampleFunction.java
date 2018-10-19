package geecon.micronaut;

import io.micronaut.function.FunctionBean;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@FunctionBean("example")
public class ExampleFunction implements Supplier<ExampleMessage> {

    private static final Logger LOG = LoggerFactory.getLogger(ExampleFunction.class); 

    @Override
    public ExampleMessage get() {
        LOG.debug("I'm in");
        return new ExampleMessage("Gotcha!");
    }
}
