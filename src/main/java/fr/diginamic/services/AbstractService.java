package fr.diginamic.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

@Service
public abstract class AbstractService {

	@PersistenceContext
	protected EntityManager em;

	public AbstractService() {
		super();
	}
}
