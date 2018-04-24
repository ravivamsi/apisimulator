/**
 * 
 */
package com.api.mock.simulator.resources;

import java.util.UUID;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.mock.simulator.responseModels.MockModel;

/**
 * @author vamsiravi
 *
 */
@RestController
public class CreateMockService {
	
	@RequestMapping(value="mock/create", method=RequestMethod.POST)
	public MockModel createMockResponse() throws JSONException{
		MockModel mockModel = new MockModel();
//		JSONObject mockResponse = new JSONObject();
//		mockResponse.put("firstName", "Vamsi");
//		mockResponse.put("lastName", "Ravi");
//		
//		
//		JSONObject mockPayLoad = new JSONObject();
//		mockPayLoad.put("firstName", "Vamsi");
//		mockPayLoad.put("lastName", "Ravi");
		
		mockModel.setMockstatuscode("201");
//		mockModel.setMockresponse(mockResponse);
//		mockModel.setMockpayload(mockPayLoad);
		mockModel.setUuid(UUID.randomUUID());
		mockModel.setPath("/path/for/resource");
		
		return mockModel;
	}

}
