package ch.example.springgraphqlkeycloakboilerplate.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TestGraphQLController {

    @QueryMapping
    public String hello() {
        return "Hello World!";
    }
}
