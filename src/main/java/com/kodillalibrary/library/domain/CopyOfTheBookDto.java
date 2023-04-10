package com.kodillalibrary.library.domain;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CopyOfTheBookDto {

    private Long id;
    private String status;
    private Long idBook;

}
