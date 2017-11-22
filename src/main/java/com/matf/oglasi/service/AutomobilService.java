package com.matf.oglasi.service;

import java.util.List;

import com.matf.oglasi.model.AutomobilModel;

public interface AutomobilService {
	boolean dodajAutomobil(AutomobilModel noviAutomobil);
	List<AutomobilModel> listaAutomobila();
	AutomobilModel vratiAutomobil(int id);
	boolean obrisiAutomobil(int id);
}
