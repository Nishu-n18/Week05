package com.capgeminitraining.week5;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

class Persons{
    public String name;
    public int age;
    public String city;

    public Persons(String name,int age,String city){
        this.name = name;
        this.age =age;
        this.city = city;
    }
}
public class ListToJson {
    public static void main(String[] args) throws JsonProcessingException {
        List<Persons> persons = new ArrayList<>();
        persons.add(new Persons("Vishal", 25, "Bhopal"));
        persons.add(new Persons("Shobhit", 20, "Sagar"));
        persons.add(new Persons("Nishu", 21, "Patna"));

        ObjectMapper objectMapper = new ObjectMapper();

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(persons);
        System.out.println(jsonString);
    }
}
