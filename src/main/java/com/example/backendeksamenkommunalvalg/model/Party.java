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
@Table(name = "party")  //Table og Column annotationen bruges ikke, idet databasen og dets indhold oprettes af schema.sql og data.sql
public class Party {    //De beholdes i programmet midlertidigt indtil, der skulle findes en bedre metode

    @Id
    @Column(name = "party_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer partyId;

    @Column(name = "party_letter")
    private String partyLetter;

    @Column(name = "party_name")
    private String partyName;

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JoinColumn(name = "party_id")
    @JsonBackReference
    private Set<Candidate> candidatePartySet = new HashSet<>();

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
