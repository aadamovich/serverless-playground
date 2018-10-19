package com.serverless;

import java.util.Collections;
import java.util.Map;

import org.apache.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Map<String, Object>, ExampleMessage> {

	private static final Logger LOG = Logger.getLogger(Handler.class);

	@Override
	public ExampleMessage handleRequest(Map<String, Object> input, Context context) {
		LOG.info("received: " + input);
		return new ExampleMessage("Gotcha!");
	}
}
