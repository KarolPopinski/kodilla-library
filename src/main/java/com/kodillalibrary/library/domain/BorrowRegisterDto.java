package com.kodillalibrary.library.domain;

import lombok.*;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BorrowRegisterDto {

    private Long id;
    private Date borrowDate;
    private Date returnDate;
}
