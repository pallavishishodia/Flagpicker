package com.org.flagpicker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.flagpicker.model.Contient;
import com.org.flagpicker.model.Country;


@Service
public interface FlagPickerService {

	public List<String> getContient();
	
	public List<String> getCountryUsingContient(String continent);
	
}
