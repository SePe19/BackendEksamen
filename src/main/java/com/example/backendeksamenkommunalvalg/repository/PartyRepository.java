package com.example.backendeksamenkommunalvalg.repository;

import com.example.backendeksamenkommunalvalg.model.Candidate;
import com.example.backendeksamenkommunalvalg.model.Party;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Qualifier("Party")
@Repository
public interface PartyRepository extends JpaRepository<Party, Integer> {

    Party findPartyByPartyName(String name);
    Set<Candidate> findCandidatesByPartyId(Integer id);
}
