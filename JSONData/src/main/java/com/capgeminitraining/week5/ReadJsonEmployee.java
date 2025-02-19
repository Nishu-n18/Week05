package com.capgeminitraining.week5;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadJsonEmployee {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode rootNode = objectMapper.readTree(new File("C:\\backup\\Week05\\JSONData\\src\\main\\java\\com\\capgeminitraining\\week5\\Employee.json"));

            String name =   rootNode.get("name").asText();
            String email =   rootNode.get("email").asText();

            System.out.println("Name :"+name);
            System.out.println("Email :"+email);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
