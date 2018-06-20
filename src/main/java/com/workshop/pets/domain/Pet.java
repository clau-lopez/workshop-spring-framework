package com.workshop.pets.domain;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Pet {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String dateOfBirth;
    private String breed;


}
