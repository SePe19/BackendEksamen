package com.example.backendeksamenkommunalvalg.model;

import lombok.Data;

@Data
public class EditCandidate {

    private Integer candidateId;
    private String candidateName;
    private String partyName;

    public EditCandidate(Integer candidateId, String candidateName, String partyName) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.partyName = partyName;
    }
}
