package com.example.backendeksamenkommunalvalg.controller;

import com.example.backendeksamenkommunalvalg.model.Candidate;
import com.example.backendeksamenkommunalvalg.model.EditCandidate;
import com.example.backendeksamenkommunalvalg.model.Party;
import com.example.backendeksamenkommunalvalg.service.CandidateService;
import com.example.backendeksamenkommunalvalg.service.PartyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin
public class CandidateRestController { //Bruges til alt omhandlende candidates

    private CandidateService candidateService;
    private PartyService partyService;

    public CandidateRestController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/candidate/{id}")
    public ResponseEntity<Candidate> getProject(@PathVariable Integer id){
        Candidate project = candidateService.findById(id);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }

    @GetMapping("/showAllCandidates")
    public ResponseEntity<List<Candidate>> showAllProjects(){
        List<Candidate> projects = candidateService.findAllCandidates();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @PostMapping("/candidate")
    public ResponseEntity<Candidate> createCandidate(@RequestBody Candidate candidate) throws URISyntaxException {
        Candidate result = null;
        result = candidateService.saveCandidate(candidate);
        return ResponseEntity.created(new URI("/candidate/" + result.getCandidateId())).body(result);
    }

    @PutMapping("/candidate/{id}")
    public ResponseEntity<Candidate> updateCandidate(@PathVariable Integer id, @RequestBody EditCandidate editCandidate) {
        Candidate tmpCandidate = candidateService.updateCandidate(editCandidate, id);
        return ResponseEntity.ok().body(tmpCandidate);
    }
}
