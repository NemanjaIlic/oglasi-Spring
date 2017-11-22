package com.matf.oglasi.service;

import java.util.List;

import com.matf.oglasi.model.KorisnikModel;

public interface KorisnikService {
	boolean dodajKorisnik(KorisnikModel noviKorisnik);
	List<KorisnikModel> listaKorisnika();
	KorisnikModel vratiKorisnik(int id);
	List<KorisnikModel> pretragaKorisnika(String name);
}
