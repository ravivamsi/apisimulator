/**
 * 
 */
package com.api.mock.simulator.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vamsiravi
 *
 */
@RestController
public class UpdateMockService {
	
	@RequestMapping(value="mock/{uuid}/update", method=RequestMethod.PUT)
	public void getMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path, @RequestBody org.json.JSONObject payload){

		
		if(uuid!=null){
			// Retrieve the Mock Service with UUID 
			
			
			
			// Update the 
		}else{
			// Throw Error
		}
		
		
	}
	
}
