package com.kodillalibrary.library.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "book_copies")
public class CopyOfTheBook {

    @Id
    @GeneratedValue
    @Column(name = "id_book_copy")
    private Long id;

    @Column(name = "copy_status")
    private String copyStatus;

    @ManyToOne
    @JoinColumn(name = "id_title")
    private Book book;

}
