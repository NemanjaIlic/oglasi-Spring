package com.matf.oglasi.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.matf.oglasi.model.AutomobilModel;
import com.matf.oglasi.model.KorisnikModel;
import com.matf.oglasi.service.AutomobilService;
import com.matf.oglasi.service.KorisnikService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class KorisnikController {
	
	private static final Logger logger = LoggerFactory.getLogger(KorisnikController.class);
	
	@Autowired
	private KorisnikService korisnikService;
	
	@RequestMapping(value = "/dodaj-korisnik", method = RequestMethod.GET)
	public String dodajKorisnik(Model model) {
		logger.info("DODAJ KORISNIK (GET) - BEGIN");
		
		model.addAttribute("noviKorisnik", new KorisnikModel());
		model.addAttribute("hasErrors", false);
		
		return "dodaj-korisnik";
	}
	
	@RequestMapping(value = "/dodaj-korisnik", method = RequestMethod.POST)
	public String dodajKorisnik(@Valid @ModelAttribute("noviKorisnik") KorisnikModel noviKorisnik, 
			BindingResult bindingResult, Model model) {
		logger.info("DODAJ KORISNIKA (POST) - BEGIN");
		
		if (bindingResult.hasErrors()) {
			model.addAttribute("hasErrors", true);
			return "dodaj-korisnik";
		}
		
		korisnikService.dodajKorisnik(noviKorisnik);
		
		model.addAttribute("hasErrors", false);
		return "dodaj-korisnik";
	}

	@RequestMapping(value = "/lista-korisnika", method = RequestMethod.GET)
	public String listaKorisnika(Model model) {
		logger.info("LISTA KORISNIKA - BEGIN");
		
		List<KorisnikModel> listaKorisnika = korisnikService.listaKorisnika();
		model.addAttribute("listaKorisnika", listaKorisnika);
		
		return "lista-korisnika";
	}
	
	@RequestMapping(value = "/pretraga", method = RequestMethod.GET)
	public String trazeniKorisnik(@RequestParam("parametar") String parametar, Model model) {
		logger.info("PRETRAGA - BEGIN");
		
		List<KorisnikModel> listaKorisnika = korisnikService.pretragaKorisnika(parametar);
		model.addAttribute("listaKorisnika", listaKorisnika);
		
		return "lista-korisnika";
	}
	
		
	@RequestMapping(value = "/izmena-korisnika", method = RequestMethod.GET)
	public String izmenaKorisnika(@RequestParam(required=true) Integer id, Model model) {
		logger.info("IZMENA KORISNIKA (GET) - BEGIN");
		
		model.addAttribute("noviKorisnik", korisnikService.vratiKorisnik(id));
		model.addAttribute("hasErrors", false);
		
		return "dodaj-korisnik";
	}
	
	public KorisnikService getKorisnikService() {
		return korisnikService;
	}

	public void setKorisnikService(KorisnikService korisnikService) {
		this.korisnikService = korisnikService;
	}

}
