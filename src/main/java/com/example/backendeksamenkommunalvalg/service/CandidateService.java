package com.example.backendeksamenkommunalvalg.service;

import com.example.backendeksamenkommunalvalg.model.Candidate;
import com.example.backendeksamenkommunalvalg.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

@Service
public class CandidateService {

    private CandidateRepository candidateRepository;

    @Autowired
    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public Candidate findById(Integer id) {
        return candidateRepository.findById(id).orElseThrow(() -> new NoResultException("Candidate with id: " + id + " doesn't exist"));
    }

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
    }
}
