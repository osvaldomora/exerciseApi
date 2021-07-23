package com.jimenezlav.developers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jimenezlav.developers.entity.ProgrammingLanguage;

public interface LenguagesRepository extends JpaRepository<ProgrammingLanguage, Integer> {

}
