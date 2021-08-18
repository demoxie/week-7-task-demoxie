package com.example.saultech.Model;

import com.example.saultech.Enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id", nullable = false)
    private Integer empID;
    private String firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;
    private Role role;
    private String phoneNumber;
    private String address;
    private String username;
    private String password;

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }
}
