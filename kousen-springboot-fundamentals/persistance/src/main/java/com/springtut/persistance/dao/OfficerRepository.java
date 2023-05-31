package com.springtut.persistance.dao;

import com.springtut.persistence.entities.Officer;
import com.springtut.persistence.entities.Rank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfficerRepository extends JpaRepository<Officer, Integer> {
    List<Officer> findByRank(Rank rank);
    List<Officer> findByLastNameLikeAndRank(String like, Rank rank);
}