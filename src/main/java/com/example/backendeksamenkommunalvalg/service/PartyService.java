package com.example.backendeksamenkommunalvalg.service;

import com.example.backendeksamenkommunalvalg.model.Candidate;
import com.example.backendeksamenkommunalvalg.model.Party;
import com.example.backendeksamenkommunalvalg.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.Set;

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

    public List<Party> findAllParties() {
        return partyRepository.findAll();
    }

    public Party findPartyByPartyName(String name) {
        return partyRepository.findPartyByPartyName(name);
    }

    public Party updateParty(Party party, Integer id) {
        Party partyData = partyRepository.findById(id).orElseThrow(() -> new NoResultException("Party with id: " + id + " does not exist"));
        partyData.setPartyId(party.getPartyId());
        partyData.setPartyName(party.getPartyName());
        return partyRepository.save(party);
    }



}
