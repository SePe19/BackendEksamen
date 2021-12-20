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

    public Party findPartyByPartyName(String name) {
        return partyRepository.findPartyByPartyName(name);
    }
/*
    public Candidate saveCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }
*/
    public Party updateParty(Party party, Integer id) {
        Party partyData = partyRepository.findById(id).orElseThrow(() -> new NoResultException("Candidate with id: " + id + " does not exist"));
        partyData.setPartyId(party.getPartyId());
        partyData.setPartyName(party.getPartyName());
        return partyRepository.save(party);
    }
    /*

    public List<Candidate> findAllCandidates() {
        return candidateRepository.findAll();
    }*/

}
