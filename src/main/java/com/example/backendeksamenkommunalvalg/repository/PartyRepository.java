package com.example.backendeksamenkommunalvalg.repository;

import com.example.backendeksamenkommunalvalg.model.Party;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends JpaRepository<Party, Long> {

}
