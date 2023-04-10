package com.kodillalibrary.library.domain;

import lombok.*;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReaderDto {

    private Long id;
    private String name;
    private String surname;
    private Date accountDateOfCreation;
}
