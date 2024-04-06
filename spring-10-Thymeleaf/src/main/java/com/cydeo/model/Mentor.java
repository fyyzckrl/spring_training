package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mentor {


    private String firstName;
    private String lastname;
    private String email;
    private String gender;
    private String batch;
    private boolean graduated;
    private String Company;
}
