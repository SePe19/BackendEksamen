package com.example.backendeksamenkommunalvalg.service;

import com.example.backendeksamenkommunalvalg.model.Party;
import com.example.backendeksamenkommunalvalg.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;

@Service
public class PartyService {

    private PartyRepository partyRepository;

    @Autowired
    public PartyService(PartyRepository partyRepository) {
        this.partyRepository = partyRepository;
    }

    public Party findById(Integer id) {
        return partyRepository.findById(id).orElseThrow(() -> new NoResultException("Party with id: " + id + " doesn't exist"));
    }
/*
    public Candidate saveCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    public Candidate updateCandidate(Candidate candidate, Integer id) {
        Candidate candidateData = candidateRepository.findById(id).orElseThrow(() -> new NoResultException("Candidate with id: " + id + " does not exist"));
        candidateData.setCandidateId(candidate.getCandidateId());
        candidateData.setCandidateName(candidate.getCandidateName());
        //candidateData.setParty(candidate.getParty);
        return candidateRepository.save(candidate);
    }

    public List<Candidate> findAllCandidates() {
        return candidateRepository.findAll();
    }*/

}
