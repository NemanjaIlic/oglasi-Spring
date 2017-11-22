package com.matf.oglasi.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.matf.oglasi.dao.KorisnikDao;
import com.matf.oglasi.domain.Korisnik;

@Repository
public class KorisnikDaoImpl implements KorisnikDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void dodajKorisnik(Korisnik noviKorisnik) {
		getEm().merge(noviKorisnik);
	}
	
	@Override
	public List<Korisnik> listaKorisnika() {
		return getEm().createQuery("SELECT k FROM Korisnik k").getResultList();
	}
	
	@Override
	public List<Korisnik> pretragaKorisnika(String name) {

		TypedQuery query =em.createQuery("SELECT k FROM Korisnik k WHERE ime=?1",Korisnik.class);
		query.setParameter(1, name);

	    return query.getResultList();
	}
	
	@Override
	public Korisnik vratiKorisnik(int id) {
		return getEm().find(Korisnik.class, id);
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
