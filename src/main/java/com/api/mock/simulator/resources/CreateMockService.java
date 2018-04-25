/**
 * 
 */
package com.api.mock.simulator.resources;

import java.util.UUID;

import org.json.JSONException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.mock.simulator.databaseModel.MockMaster;
import com.api.mock.simulator.databaseModel.MockMasterRepository;
import com.api.mock.simulator.responseModels.MockModel;
import com.api.mock.simulator.responseModels.POSTResponse;

/**
 * @author vamsiravi
 *
 */
@RestController
public class CreateMockService {
	

	private MockMasterRepository mockMasterRepository;
	
	@RequestMapping(value="mock/create", method=RequestMethod.POST)
	public POSTResponse createMockResponse(@RequestBody MockModel mockModel) throws JSONException{
		POSTResponse reponse = new POSTResponse();
		MockMaster mockMaster = new MockMaster();
		mockMaster.setHttpMethod(mockModel.getMockstatuscode());
		mockMaster.setUuid(UUID.randomUUID());
		
		mockMasterRepository.save(mockMaster);
		
		return reponse;
	}

}
