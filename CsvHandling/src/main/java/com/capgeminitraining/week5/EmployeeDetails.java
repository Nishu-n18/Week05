package com.capgeminitraining.week5;
import java.io.FileWriter;
import java.io.IOException;


public class EmployeeDetails {
        public static void main(String[] args) {
            //file path
            String filePath = "C:\\ideaProjects\\CsvHandling\\src\\main\\java\\com\\capgeminitraining\\week5\\employeefile";
            // Sample employee records
            String[] employees = {
                    "101,Nishu Kumari,IT,60000",
                    "102,Nimish Rathi,HR,55000",
                    "103,Mohan Agrawal,Finance,70000",
                    "104,Kapil Tiwari,Marketing,50000",
                    "105,Kalpesh Doble,Sales,65000"
            };

            try (FileWriter writer = new FileWriter(filePath)) {
                // Writing the header
                writer.append("ID,Name,Department,Salary\n");

                // Writing employee records
                for (String emp : employees) {
                    writer.append(emp).append("\n");
                }

                System.out.println("CSV file created successfully!");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        }

}
