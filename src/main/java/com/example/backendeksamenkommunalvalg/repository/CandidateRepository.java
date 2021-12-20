package com.example.backendeksamenkommunalvalg.repository;

import com.example.backendeksamenkommunalvalg.model.Candidate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Qualifier("Candidate")
@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

    @Query("SELECT c FROM Candidate c WHERE c.party.partyId=:id")
    List<Candidate> findCandidatesByPartyId(@Param("id") Integer id);
}
