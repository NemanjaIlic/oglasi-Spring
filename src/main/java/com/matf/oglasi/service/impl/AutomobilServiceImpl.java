package com.matf.oglasi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matf.oglasi.dao.AutomobilDao;
import com.matf.oglasi.domain.Automobil;
import com.matf.oglasi.model.AutomobilModel;
import com.matf.oglasi.service.AutomobilService;

@Service
public class AutomobilServiceImpl implements AutomobilService {

	@Autowired
	private AutomobilDao automobilDao;
	
	@Override
	@Transactional
	public boolean dodajAutomobil(AutomobilModel noviAutomobil) {
		Automobil automobil = new Automobil();
		automobil.setId(noviAutomobil.getId());
		automobil.setProizvodjac(noviAutomobil.getProizvodjac());
		automobil.setModel(noviAutomobil.getModel());
		automobil.setGodinaProizvodnje(noviAutomobil.getGodinaProizvodnje());
		automobil.setPrviVlasnik(noviAutomobil.isPrviVlasnik());
		
		automobilDao.dodajAutomobil(automobil);
		
		return true;
	}

	@Override
	public List<AutomobilModel> listaAutomobila() {
		List<AutomobilModel> listaAutomobila = new ArrayList<AutomobilModel>();
		for (Automobil automobil : automobilDao.listaAutomobila()) {
			AutomobilModel automobilModel = new AutomobilModel();
			automobilModel.setId(automobil.getId());
			automobilModel.setProizvodjac(automobil.getProizvodjac());
			automobilModel.setModel(automobil.getModel());
			automobilModel.setGodinaProizvodnje(automobil.getGodinaProizvodnje());
			automobilModel.setPrviVlasnik(automobil.isPrviVlasnik());
			
			listaAutomobila.add(automobilModel);
		}
		
		return listaAutomobila;
	}

	public AutomobilDao getAutomobilDao() {
		return automobilDao;
	}

	public void setAutomobilDao(AutomobilDao automobilDao) {
		this.automobilDao = automobilDao;
	}

	@Override
	public AutomobilModel vratiAutomobil(int id) {
		Automobil automobil = automobilDao.vratiAutomobil(id);
		
		AutomobilModel automobilModel = new AutomobilModel();
		automobilModel.setId(automobil.getId());
		automobilModel.setProizvodjac(automobil.getProizvodjac());
		automobilModel.setModel(automobil.getModel());
		automobilModel.setGodinaProizvodnje(automobil.getGodinaProizvodnje());
		automobilModel.setPrviVlasnik(automobil.isPrviVlasnik());
		
		return automobilModel;
	}

	@Override
	@Transactional
	public boolean obrisiAutomobil(int id) {
		Automobil a = automobilDao.vratiAutomobil(id);
		automobilDao.obrisiAutomobil(a);
		
		return true;
	}

}
