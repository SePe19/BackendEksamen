package com.example.backendeksamenkommunalvalg.service;

import com.example.backendeksamenkommunalvalg.model.Candidate;
import com.example.backendeksamenkommunalvalg.model.EditCandidate;
import com.example.backendeksamenkommunalvalg.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

@Service
public class CandidateService {

    private CandidateRepository candidateRepository;
    private PartyService partyService;

    @Autowired
    public CandidateService(CandidateRepository candidateRepository, PartyService partyService) {
        this.candidateRepository = candidateRepository;
        this.partyService = partyService;
    }

    public Candidate findById(Integer id) {
        return candidateRepository.findById(id).orElseThrow(() -> new NoResultException("Candidate with id: " + id + " doesn't exist"));
    }

    public List<Candidate> findAllCandidates() {
        return candidateRepository.findAll();
    }

    public List<Candidate> findAllCandidatesOnParty(Integer id) {
        return candidateRepository.findCandidatesByPartyId(id);
    }

    public Candidate saveCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    public Candidate updateCandidate(EditCandidate editCandidate, Integer id) {
        Candidate candidateData = candidateRepository.findById(id).orElseThrow(() -> new NoResultException("Candidate with id: " + id + " does not exist"));
        candidateData.setCandidateId(editCandidate.getCandidateId());
        candidateData.setCandidateName(editCandidate.getCandidateName());
        candidateData.setParty(partyService.findPartyByPartyName(editCandidate.getPartyName()));
        return candidateRepository.save(candidateData);
    }

    public void deleteCandidate(Integer id){
        candidateRepository.deleteById(id);
    }
}
