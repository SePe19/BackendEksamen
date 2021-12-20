package com.example.backendeksamenkommunalvalg.controller;

import com.example.backendeksamenkommunalvalg.model.Candidate;
import com.example.backendeksamenkommunalvalg.service.CandidateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin
public class CandidateRestController {

    private CandidateService candidateService;

    public CandidateRestController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }
/*
    @GetMapping("/showAllCandidatesFromParty/{id}")
    public ResponseEntity<List<Candidate>> findAllCandidatesFromParty(Integer id){
        List<Candidate> candidatesFromParty = candidateService.findAllCandidatesFromParty(id);
        return new ResponseEntity<>(candidatesFromParty, HttpStatus.OK);
    }*/

    @PostMapping("/candidate")
    public ResponseEntity<Candidate> createCandidate(@RequestBody Candidate candidate) throws URISyntaxException {
        Candidate result = null;
        result = candidateService.saveCandidate(candidate);
        return ResponseEntity.created(new URI("/candidate/" + result.getCandidateId())).body(result);
    }
/*
    @GetMapping("/showAllCandidates")
    public ResponseEntity<List<Candidate>> showAllProjects(){
        List<Candidate> projects = candidateService.findAllCandidates();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @PutMapping("/candidate/{id}")
    public ResponseEntity<Candidate> updateCandidate(@PathVariable Integer id, @RequestBody Candidate candidate) {
        Candidate tmpCandidate = candidateService.updateCandidate(candidate, id);
        return ResponseEntity.ok().body(tmpCandidate);
    }

    @DeleteMapping("/candidate/{id}")*/
}
