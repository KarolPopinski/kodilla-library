package com.kodillalibrary.library.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "borrows")
public class BorrowRegister {

    @Id
    @GeneratedValue
    @Column(name = "id_borrow")
    private Long id;

    @Column(name = "date_borrow")
    private Date borrowDate;

    @Column(name = "date_return")
    private Date returnDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_reader")
    private Reader reader;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_book_copie")
    private CopyOfTheBook copyOfTheBook;
}
