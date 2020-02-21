package com.hackerrank.github.repository;

import com.hackerrank.github.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Spring Data  repository for the ContractAgreement entity.
 */
@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
    @Query("select a from Actor a where a.id = :id")
    Optional<Actor> findById(Long id);
}
