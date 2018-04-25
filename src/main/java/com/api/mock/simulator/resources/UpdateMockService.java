/**
 * 
 */
package com.api.mock.simulator.resources;

import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.mock.simulator.databaseModel.MockMaster;
import com.api.mock.simulator.databaseModel.MockMasterRepository;

/**
 * @author vamsiravi
 *
 */
@RestController
public class UpdateMockService {

	private MockMasterRepository mockMasterRepository;
	
	@RequestMapping(value="mock/{uuid}/update", method=RequestMethod.PUT)
	public void getMockResponse(@PathVariable("uuid") UUID uuid, @PathVariable("path") String path, @RequestBody org.json.JSONObject payload){

		
		if(uuid!=null){
			// Retrieve the Mock Service with UUID 
			
						MockMaster mockMaster = mockMasterRepository.findByUuid(uuid);
						
						// Delete the Mock Service from the Database
//						mockMasterRepository.deleteById(uuid);
			
			
			// Update the 
						mockMaster.setStatusCode(200);
						
						
						mockMasterRepository.save(mockMaster);
		}else{
			// Throw Error
		}
		
		
	}
	
}
