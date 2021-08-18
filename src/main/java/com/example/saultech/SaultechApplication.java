package com.example.saultech;

import com.example.saultech.Enums.Role;
import com.example.saultech.Model.Employee;
import com.example.saultech.Services.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class SaultechApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaultechApplication.class, args);
    }
    public static void insertEmployee(EmployeeRepository employeeRepository) throws ParseException {
        java.util.Date dob = new SimpleDateFormat("yyyy-MM-dd").parse("2000-01-01");
        employeeRepository.save(new Employee(1,"Shadrach","Adamu","Male", dob, Role.ADMIN,"07067659632","AshakaCem","root","root"));
    }
    @Bean
    public CommandLineRunner run(EmployeeRepository repository) {
        return (args) -> {
            insertEmployee(repository);
            System.out.println(repository.findAll());
        };
    }

}


