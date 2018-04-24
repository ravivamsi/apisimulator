/**
 * 
 */
package com.api.mock.simulator.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vamsiravi
 *
 */
@RestController
public class ConsumeMockService {

	@RequestMapping(value="mock/{uuid}/consume/{path}", method=RequestMethod.GET)
	public void getMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path){
		
	}
	
	@RequestMapping(value="mock/{uuid}/consume/{path}", method=RequestMethod.POST)
	public void postMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path){
		
	}
	
	@RequestMapping(value="mock/{uuid}/consume/{path}", method=RequestMethod.PUT)
	public void putMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path){
		
	}
	
	@RequestMapping(value="mock/{uuid}/consume/{path}", method=RequestMethod.DELETE)
	public void deleteMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path){
		
	}
	
	@RequestMapping(value="mock/{uuid}/consume/{path}", method=RequestMethod.OPTIONS)
	public void optionsMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path){
		
	}
	
	@RequestMapping(value="mock/{uuid}/consume/{path}", method=RequestMethod.PATCH)
	public void patchMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path){
		
	}
	
	@RequestMapping(value="mock/{uuid}/consume/{path}", method=RequestMethod.HEAD)
	public void headerMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path){
		
	}
	
	@RequestMapping(value="mock/{uuid}/consume/{path}", method=RequestMethod.TRACE)
	public void traceMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path){
		
	}
	
	
	
	// Yet to Implement 
	/*@RequestMapping(value="mock/{uuid}/consume/{path}", method=RequestMethod.DELETE)
	public void copyMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path){
		
	}
	
	@RequestMapping(value="mock/{uuid}/consume/{path}", method=RequestMethod.DELETE)
	public void linkMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path){
		
	}
	
	@RequestMapping(value="mock/{uuid}/consume/{path}", method=RequestMethod.DELETE)
	public void unlinkMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path){
		
	}
	
	@RequestMapping(value="mock/{uuid}/consume/{path}", method=RequestMethod.DELETE)
	public void purgeMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path){
		
	}
	
	@RequestMapping(value="mock/{uuid}/consume/{path}", method=RequestMethod.DELETE)
	public void lockMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path){
		
	}
	
	@RequestMapping(value="mock/{uuid}/consume/{path}", method=RequestMethod.DELETE)
	public void unlockMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path){
		
	}
	
	@RequestMapping(value="mock/{uuid}/consume/{path}", method=RequestMethod.DELETE)
	public void viewMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path){
		
	}
	
	@RequestMapping(value="mock/{uuid}/consume/{path}", method=RequestMethod.DELETE)
	public void propFindMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path){
		
	}*/
}
