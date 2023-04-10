package com.kodillalibrary.library.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@AllArgsConstructor
@Getter
public class BookDto {

    private Long id;
    private String author;
    private Integer yearOfPublication;
}
