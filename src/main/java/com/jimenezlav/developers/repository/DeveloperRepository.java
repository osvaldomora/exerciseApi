package com.jimenezlav.developers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jimenezlav.developers.entity.Developer;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Integer> {

}
