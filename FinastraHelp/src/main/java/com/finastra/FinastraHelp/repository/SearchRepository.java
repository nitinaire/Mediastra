package com.finastra.FinastraHelp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.finastra.FinastraHelp.models.Solution;

public interface SearchRepository extends JpaRepository<Solution, Long>, JpaSpecificationExecutor<Solution> {

}
