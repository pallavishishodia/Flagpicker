package com.org.flagpicker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.flagpicker.model.Contient;
import com.org.flagpicker.model.Country;
import com.org.flagpicker.service.FlagPickerService;

/**
 * This is FlagPickerController class
 * 
 * @author Pallavi Shishodia
 * @version 1.0
 **/

@RestController
@RequestMapping("flagpicker")
public class FlagPickerController {

	@Autowired
	private FlagPickerService flagPickerService;

	@RequestMapping(value = "/continent", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> retrieveContinent() {
		return flagPickerService.getContient();
	}

	@RequestMapping(value = "/country", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> retrieveCountry(String continent) {
		return flagPickerService.getCountryUsingContient(continent);
	}
}
