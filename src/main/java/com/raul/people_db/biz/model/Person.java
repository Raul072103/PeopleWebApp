package com.raul.people_db.biz.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Data
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private BigDecimal salary;
}
