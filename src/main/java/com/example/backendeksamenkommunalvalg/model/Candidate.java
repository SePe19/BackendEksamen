package com.example.backendeksamenkommunalvalg.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "candidate")  //Table og Column annotationen bruges ikke, idet databasen og dets indhold oprettes af schema.sql og data.sql
public class Candidate {    //De beholdes i programmet midlertidigt, men skal nok fjernes

    @Id
    @Column(name = "candidate_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer candidateId;

    @Column(name = "candidate_name")
    private String candidateName;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "party_id")
    public Party party;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(candidateId, candidate.candidateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candidateId);
    }
}
