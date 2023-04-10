package com.kodillalibrary.library.repository;

import com.kodillalibrary.library.domain.BorrowRegister;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowRepository extends CrudRepository<BorrowRegister, Long> {
}
