package com.capgeminitraining.week5;
import com.fasterxml.jackson.databind.ObjectMapper;


public class CarDetails {
    public String brand;
    public int price;
    public int year;
    CarDetails(String brand,int price, int year){
        this.brand=brand;
        this.price=price;
        this.year=year;
    }
    public static void main(String[] args) {
        try{
            ObjectMapper objectmapper=new ObjectMapper();
            CarDetails car=new CarDetails("Innova",4000000,2005);
            String jsonstring=objectmapper.writeValueAsString(car);
            System.out.println(jsonstring);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
