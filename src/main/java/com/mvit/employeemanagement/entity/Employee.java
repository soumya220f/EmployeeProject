package com.mvit.employeemanagement.entity;



import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "Employee")
@Data
public class Employee {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeID;

    @Setter
    @Getter
    @Column(name = "FirstName",nullable = false, length = 50)
    private String firstName;

    @Setter
    @Getter
    @Column(name = "LastName",nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Getter
    @Setter
    @Column(name = "HireDate", nullable = true)
    private Date hireDate;

    @Column(length = 50)
    private String department;

    @Column(precision = 10, scale = 2)
    private BigDecimal  salary;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", hireDate=" + hireDate +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }


}
