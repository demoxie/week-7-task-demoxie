package com.example.saultech;

import com.example.saultech.Enums.Role;
import com.example.saultech.Model.Employee;
import com.example.saultech.Services.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Configuration
class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) throws ParseException {
        java.util.Date dob = new SimpleDateFormat("yyyy-MM-dd").parse("2000-01-01");
        return args -> {
            log.info("Preloading " + repository.save(new Employee(1,"Shadrach","Adamu","Male", dob, Role.ADMIN,"07067659632","AshakaCem","root","root")));
        };
    }
}
