package com.jimenezlav.developers.service;

import java.util.Collection;

import com.jimenezlav.developers.entity.ProgrammingLanguage;

public interface ILenguagesRepository {
	Collection<ProgrammingLanguage> findAll();
}
