package com.matf.oglasi.dao;

import java.util.List;

import com.matf.oglasi.domain.Korisnik;

public interface KorisnikDao {
	void dodajKorisnik(Korisnik noviKorisnik);
	List<Korisnik> listaKorisnika();
	Korisnik vratiKorisnik(int id);
	List<Korisnik> pretragaKorisnika(String name);
}
