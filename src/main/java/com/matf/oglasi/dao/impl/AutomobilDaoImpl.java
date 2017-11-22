package com.matf.oglasi.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.matf.oglasi.dao.AutomobilDao;
import com.matf.oglasi.domain.Automobil;

@Repository
public class AutomobilDaoImpl implements AutomobilDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void dodajAutomobil(Automobil noviAutomobil) {
		getEm().merge(noviAutomobil);
	}

	@Override
	public List<Automobil> listaAutomobila() {
		return getEm().createQuery("SELECT a FROM Automobil a").getResultList();
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public Automobil vratiAutomobil(int id) {
		return getEm().find(Automobil.class, id);
	}
	
	@Override
	public void obrisiAutomobil(Automobil automobil) {
		getEm().remove(automobil);
	}

}
