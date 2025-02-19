package com.capgeminitraining.week5;
import org.json.JSONArray;
import org.json.JSONObject;

public class StudentDetail {
    public static void main(String[] args) {
        JSONArray Subject=new JSONArray();
        Subject.put("Maths");
        Subject.put("English");
        Subject.put("Computer science");
        JSONObject student=new JSONObject();
        student.put("name", "Nishu");
        student.put("Age",21);
        student.put("Subject",Subject);
        System.out.println(student.toString());
    }


}
