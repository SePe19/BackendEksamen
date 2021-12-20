package com.example.backendeksamenkommunalvalg.repository;

import com.example.backendeksamenkommunalvalg.model.Candidate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Qualifier("Candidate")
@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

}
