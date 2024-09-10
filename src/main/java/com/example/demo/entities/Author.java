package com.example.demo.entities;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Author {
    private int id ;
    private String name;
    private String surname;
    private String email;
    private LocalDate dateOfBirth;
    private String avatar;
}
