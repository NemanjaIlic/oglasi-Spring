package com.matf.oglasi.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class AutomobilModel {
	
	private Integer id;
	
	@Size(min = 3, max = 30, message = "Ime proizvođača ne sme da bude manje od 3, a veće od 30 karaktera.")
	private String proizvodjac;
	
	@Size(min = 3, max = 30, message = "Ime modela ne sme da bude manje od 3, a veće od 30 karaktera.")
	private String model;
	
	@Range(min = 1950, max = 2016, message = "Godina proizvodnje nije u korektnom formatu.")
	private Integer godinaProizvodnje;
	
	private boolean prviVlasnik;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProizvodjac() {
		return proizvodjac;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(Integer godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public boolean isPrviVlasnik() {
		return prviVlasnik;
	}

	public void setPrviVlasnik(boolean prviVlasnik) {
		this.prviVlasnik = prviVlasnik;
	}
	
}
