package com.kodillalibrary.library.repository;

import com.kodillalibrary.library.domain.CopyOfTheBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CopyOfTheBookRepository extends CrudRepository<CopyOfTheBook, Long> {
}
