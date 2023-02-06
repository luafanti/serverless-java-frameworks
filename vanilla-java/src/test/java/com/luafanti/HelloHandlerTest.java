package com.luafanti;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HelloHandlerTest {
    @Test
    public void successfulResponse() {
        HelloHandler app = new HelloHandler();
        APIGatewayProxyResponseEvent result = app.handleRequest(null, null);
        assertEquals(200, result.getStatusCode().intValue());
        assertEquals("application/json", result.getHeaders().get("Content-Type"));
        String content = result.getBody();
        assertTrue(content.equals("Hello Vanilla Java Lambda"));
    }
}
