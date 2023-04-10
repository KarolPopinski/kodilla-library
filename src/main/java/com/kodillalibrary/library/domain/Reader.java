package com.kodillalibrary.library.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "readers")
public class Reader {

    @Id
    @GeneratedValue
    @Column(name = "id_reader")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "account_date_of_creation")
    private Date accountDateOfCreation;
}
