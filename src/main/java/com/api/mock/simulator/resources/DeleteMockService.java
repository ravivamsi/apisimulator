/**
 * 
 */
package com.api.mock.simulator.resources;

import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author vamsiravi
 *
 */
public class DeleteMockService {
	
	@RequestMapping(value="mock/{uuid}/delete", method=RequestMethod.GET)
	public void retrieveMockServiceById(@PathVariable("uuid") UUID uuid){
		if(uuid!=null){
			// Delete the Mock Service from the Database
		}else{
			// Throw Error
		}
	}

}
