package geecon.micronaut

import io.micronaut.function.client.FunctionClient
import io.reactivex.Single

import javax.inject.Named

@FunctionClient
interface ExampleClient {

    @Named("example")
    Single<Map<String, String>> example()
}
