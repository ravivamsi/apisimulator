/**
 * 
 */
package com.api.mock.simulator.converters;

import org.json.JSONException;
import org.json.JSONObject;

import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

/**
 * @author vamsiravi
 *
 */
public class JSONStringtoJSON {
	
	public JSONObject jsonStringToJSONObject(String jsonString) throws JSONException{
		JSONObject jsonObject = new JSONObject(jsonString);
		return jsonObject;
	}
	

	public JSONObject jsonStringToJSONObjectUsingParser(String jsonString) throws ParseException{
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(jsonString);
		return json;
	}
}
