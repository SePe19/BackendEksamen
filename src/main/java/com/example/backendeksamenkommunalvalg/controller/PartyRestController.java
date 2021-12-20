package com.example.backendeksamenkommunalvalg.controller;

import com.example.backendeksamenkommunalvalg.model.Candidate;
import com.example.backendeksamenkommunalvalg.model.Party;
import com.example.backendeksamenkommunalvalg.service.PartyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PartyRestController {

    private PartyService partyService;

    public PartyRestController(PartyService partyService) {
        this.partyService = partyService;
    }

    @GetMapping("/showAllParties")
    public ResponseEntity<List<Party>> showAllParties(){
        List<Party> parties = partyService.findAllParties();
        return new ResponseEntity<>(parties, HttpStatus.OK);
    }

}
