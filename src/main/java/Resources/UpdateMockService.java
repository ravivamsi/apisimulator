/**
 * 
 */
package Resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author vamsiravi
 *
 */
public class UpdateMockService {

	
	@RequestMapping(value="mock/{uuid}/update", method=RequestMethod.PUT)
	public void getMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path, @RequestBody org.json.JSONObject payload){
		
	}
	
}
