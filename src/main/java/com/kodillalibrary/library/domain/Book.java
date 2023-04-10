package com.kodillalibrary.library.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "title")
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "id_title")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "publication_year")
    private Integer yearOfPublication;

    @OneToMany(
            targetEntity = CopyOfTheBook.class,
            mappedBy = "book",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<CopyOfTheBook> bookCopy = new ArrayList<>();

}
