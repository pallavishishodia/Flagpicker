package com.org.flagpicker.service;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *  FlagPickerService class is use for loading json for continent and Country
 * 
 * @author Pallavi Shishodia
 * @version 1.0
 **/
public class FlagPickerServiceImpl implements FlagPickerService {
	private static final Logger LOGGER = LogManager.getLogger(FlagPickerServiceImpl.class);

	@Override
	public List<String> getContient() {
		return getContient();
	}

	@Override
	public List<String> getCountryUsingContient(String continent) {
		// TODO Auto-generated method stub
		return getCountry(continent);
	}
	private static List<String> getContients() {

		JSONParser parser = new JSONParser();
		List<String> list = new ArrayList<String>();
		try {

			Object obj = parser.parse(new FileReader("src/main/resources/continents.json"));
			JSONArray objArray = (JSONArray) obj;
			if (!objArray.isEmpty()) {
				for (int i = 0; i < objArray.size(); i++) {
					JSONObject continentList = (JSONObject) objArray.get(i);
					list.add(continentList.get("continent").toString());
				}
			}

		} catch (Exception e) {

			LOGGER.error("Error in getContients method" +e);
			e.printStackTrace();
			
		}
		return list;
	}

	private static List<String> getCountry(String continent) {

		JSONParser parser = new JSONParser();
		List<String> list = new ArrayList<String>();
		try {

			Object obj = parser.parse(new FileReader("src/main/resources/continents.json"));
			JSONArray objArray = (JSONArray) obj;
			if (objArray.equals(continent)) {
				for (int i = 0; i < objArray.size(); i++) {
					JSONObject countryList = (JSONObject) objArray.get(i);

					list.add(countryList.get("countries").toString());
				}

			}

			return list;
		} catch (Exception e) {
			LOGGER.error("Error in getCountry method" +e);
			e.printStackTrace();
		}
		return list;
	}

	
}
