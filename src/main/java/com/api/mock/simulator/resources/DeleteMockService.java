/**
 * 
 */
package com.api.mock.simulator.resources;

import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
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
public class DeleteMockService {
	
	private MockMasterRepository mockMasterRepository;
	
	@RequestMapping(value="mock/{uuid}/delete", method=RequestMethod.DELETE)
	public void retrieveMockServiceById(@PathVariable("uuid") UUID uuid){
		if(uuid!=null){
			// Find the Record
			MockMaster mockMaster = mockMasterRepository.findByUuid(uuid);
			
			// Delete the Mock Service from the Database
			mockMasterRepository.deleteById(mockMaster.getUuid());
		}else{
			// Throw Error
			
		}
	}

}
