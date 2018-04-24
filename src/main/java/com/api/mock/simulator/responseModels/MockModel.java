/**
 * 
 */
package com.api.mock.simulator.responseModels;

import java.util.UUID;

import org.json.JSONObject;

/**
 * @author vamsiravi
 *
 */
public class MockModel {
	
	

	/**
	 * @return the uuid
	 */
	public UUID getUuid() {
		return uuid;
	}

	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}


	/**
	 * @return the mockstatuscode
	 */
	public String getMockstatuscode() {
		return mockstatuscode;
	}

	/**
	 * @param mockstatuscode the mockstatuscode to set
	 */
	public void setMockstatuscode(String mockstatuscode) {
		this.mockstatuscode = mockstatuscode;
	}


	/**
	 * @return the mockresponse
	 */
	public JSONObject getMockresponse() {
		return mockresponse;
	}

	/**
	 * @param mockresponse the mockresponse to set
	 */
	public void setMockresponse(JSONObject mockresponse) {
		this.mockresponse = mockresponse;
	}

	/**
	 * @return the mockpayload
	 */
	public JSONObject getMockpayload() {
		return mockpayload;
	}

	/**
	 * @param mockpayload the mockpayload to set
	 */
	public void setMockpayload(JSONObject mockpayload) {
		this.mockpayload = mockpayload;
	}

	/**
	 * @return the mockheaders
	 */
	public String getMockheaders() {
		return mockheaders;
	}

	/**
	 * @param mockheaders the mockheaders to set
	 */
	public void setMockheaders(String mockheaders) {
		this.mockheaders = mockheaders;
	}

	public UUID uuid = null;
	
	
	public String path = null;
	
	
	public JSONObject mockresponse = null;
	
	
	public String mockstatuscode = null;
	
	
	public JSONObject mockpayload = null;
	
	
	public String mockheaders = null;
	
	public enum httpMethods {
		GET, POST, PUT, DELETE, PATCH, HEAD, OPTIONS, TRACE
	}
	

}
