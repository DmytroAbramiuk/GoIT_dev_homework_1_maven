package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        Human me = new Human("Dmytro", "Abramiuk");

        ObjectMapper om = new ObjectMapper();

        try {
            System.out.println(om.writeValueAsString(me));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}