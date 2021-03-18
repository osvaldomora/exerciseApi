package com.jimenezlav.developers.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.jimenezlav.developers.domain.DeveloperDTO;
import com.jimenezlav.developers.entity.Developer;
import com.jimenezlav.developers.repository.DeveloperRepository;
import com.jimenezlav.developers.service.IDeveloperService;

@Service
public class DeveloperServiceImpl implements IDeveloperService {

	private final DeveloperRepository developerRepository;

	public DeveloperServiceImpl(DeveloperRepository developerRepository) {
		super();
		this.developerRepository = developerRepository;
	}

	@Override
	public Collection<DeveloperDTO> findAll() {
		return developerRepository.findAll().stream().map(new Function<Developer, DeveloperDTO>() {

			@Override
			public DeveloperDTO apply(Developer developer) {
				List<String> programmingLanguagesKnowAbout = developer.getProgrammingLanguages().stream()
						.map(pl -> new String(pl.getName())).collect(Collectors.toList());
				return new DeveloperDTO(developer.getName(), programmingLanguagesKnowAbout);
			}

		}).collect(Collectors.toList());
	}

	@Override
	public Collection<DeveloperDTO> findAllAndShowIfKnowPupularPrograminLanguage() {
		// TODO Obtener la lista de todos los desarrolladores existentes en la BD e
		// indicar si el desarrollador conoce o no el lenguaje de programacion mas
		// popular registrado en la BD.
		return null;
	}

}
