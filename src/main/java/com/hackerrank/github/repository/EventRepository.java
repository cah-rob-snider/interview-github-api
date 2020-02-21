package com.hackerrank.github.repository;

import com.hackerrank.github.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Spring Data  repository for the ContractAgreement entity.
 */
@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    @Query("select a from Event a where a.id = :id")
    Optional<Event> findById(Long id);
}
