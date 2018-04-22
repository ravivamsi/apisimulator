/**
 * 
 */
package com.api.mock.simulator.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vamsiravi
 *
 */
@RestController
public class CreateMockService {
	
	@RequestMapping(value="mock/create", method=RequestMethod.POST)
	public String createMockResponse(){
		return  "Hello";	
	}

}
