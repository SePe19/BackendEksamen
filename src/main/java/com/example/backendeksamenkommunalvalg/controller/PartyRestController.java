package com.example.backendeksamenkommunalvalg.controller;

import com.example.backendeksamenkommunalvalg.service.PartyService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartyRestController {

    private PartyService partyService;

    public PartyRestController(PartyService partyService) {
        this.partyService = partyService;
    }


}
