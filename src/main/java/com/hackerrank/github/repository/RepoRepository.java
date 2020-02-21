package com.hackerrank.github.repository;

import com.hackerrank.github.model.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Spring Data  repository for the ContractAgreement entity.
 */
@Repository
public interface RepoRepository extends JpaRepository<Repo, Long> {
    @Query("select a from Repo a where a.id = :id")
    Optional<Repo> findById(Long id);
}
