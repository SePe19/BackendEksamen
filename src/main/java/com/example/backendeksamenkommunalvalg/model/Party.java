package com.example.backendeksamenkommunalvalg.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "party")
public class Party {

    @Id
    @Column(name = "party_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer partyId;

    @Column(name = "party_name")
    private String partyName;

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JoinColumn(name = "candidate_id")
    @JsonBackReference
    private Set<Candidate> candidateSet = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Party party = (Party) o;
        return Objects.equals(partyId, party.partyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partyId);
    }
}
