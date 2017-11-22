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
import com.matf.oglasi.service.AutomobilService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private AutomobilService automobilService;
	
	@RequestMapping(value = { "/", "/naslovna-strana" }, method = RequestMethod.GET)
	public String home() {
		logger.info("HOME PAGE - BEGIN");
		
		return "home";
	}
	
	@RequestMapping(value = "/o-nama", method = RequestMethod.GET)
	public String oNama(Model model) {
		logger.info("O NAMA - BEGIN");
		
		return "o-nama";
	}
	
	@RequestMapping(value = "/dodaj-automobil", method = RequestMethod.GET)
	public String dodajAutomobil(Model model) {
		logger.info("DODAJ AUTOMOBIL (GET) - BEGIN");
		
		model.addAttribute("noviAutomobil", new AutomobilModel());
		model.addAttribute("hasErrors", false);
		
		return "dodaj-automobil";
	}
	
	@RequestMapping(value = "/izmena-automobila", method = RequestMethod.GET)
	public String izmenaAutomobila(@RequestParam(required=true) Integer id, Model model) {
		logger.info("IZMENA AUTOMOBILA (GET) - BEGIN");
		
		model.addAttribute("noviAutomobil", automobilService.vratiAutomobil(id));
		model.addAttribute("hasErrors", false);
		
		return "dodaj-automobil";
	}
	
	@RequestMapping(value = "/obrisi-automobil", method = RequestMethod.GET)
	public String obrisiAutomobil(@RequestParam(required=true) Integer id, Model model) {
		logger.info("OBRISI AUTOMOBIL (GET) - BEGIN");
		
		automobilService.obrisiAutomobil(id);
		
		List<AutomobilModel> listaAutomobila = automobilService.listaAutomobila();
		model.addAttribute("listaAutomobila", listaAutomobila);
		
		return "lista-automobila";
	}
	
	@RequestMapping(value = "/dodaj-automobil", method = RequestMethod.POST)
	public String dodajAutomobil(@Valid @ModelAttribute("noviAutomobil") AutomobilModel noviAutomobil, 
			BindingResult bindingResult, Model model) {
		logger.info("DODAJ AUTOMOBIL (POST) - BEGIN");
		
		if (bindingResult.hasErrors()) {
			model.addAttribute("hasErrors", true);
			return "dodaj-automobil";
		}
		
		automobilService.dodajAutomobil(noviAutomobil);
		
		model.addAttribute("hasErrors", false);
		return "dodaj-automobil";
	}
	
	@RequestMapping(value = "/lista-automobila", method = RequestMethod.GET)
	public String listaAutomobila(Model model) {
		logger.info("LISTA AUTOMOBILA - BEGIN");
		
		List<AutomobilModel> listaAutomobila = automobilService.listaAutomobila();
		model.addAttribute("listaAutomobila", listaAutomobila);
		
		return "lista-automobila";
	}

	public AutomobilService getAutomobilService() {
		return automobilService;
	}

	public void setAutomobilService(AutomobilService automobilService) {
		this.automobilService = automobilService;
	}

}
