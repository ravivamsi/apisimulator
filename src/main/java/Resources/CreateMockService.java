/**
 * 
 */
package Resources;

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
public class CreateMockService {
	


	@RequestMapping(value="mock/create", method=RequestMethod.POST)
	public void getMockResponse(@PathVariable("uuid") String uuid, @PathVariable("path") String path, @RequestBody org.json.JSONObject payload){
		
	}
	


}
