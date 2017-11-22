package com.matf.oglasi.dao;

import java.util.List;

import com.matf.oglasi.domain.Automobil;

public interface AutomobilDao {
	void dodajAutomobil(Automobil noviAutomobil);
	List<Automobil> listaAutomobila();
	Automobil vratiAutomobil(int id);
	void obrisiAutomobil(Automobil automobil);
}
