package com.example.backendeksamenkommunalvalg.model;

import lombok.Data;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EditCandidate that = (EditCandidate) o;
        return Objects.equals(candidateId, that.candidateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candidateId);
    }
}
