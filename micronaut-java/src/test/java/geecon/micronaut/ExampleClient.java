package geecon.micronaut;

import io.micronaut.function.client.FunctionClient;
import io.reactivex.Single;

import javax.inject.Named;

@FunctionClient
public interface ExampleClient {

    @Named("example")
    Single<ExampleMessage> index();

}
