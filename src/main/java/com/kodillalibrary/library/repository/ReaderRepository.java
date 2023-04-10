package com.kodillalibrary.library.repository;

import com.kodillalibrary.library.domain.Reader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends CrudRepository<Reader, Long> {
}
