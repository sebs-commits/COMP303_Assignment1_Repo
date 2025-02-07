package com.example.sebastian_301241956_assignment1;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class AccountOpen {
    private String firstName;
    private String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    private String phoneNumber;
    private String phoneType;
    private String email;
    private String address;
    private String city;
    private String province;
    private String postalCode;
    private String country;
}
