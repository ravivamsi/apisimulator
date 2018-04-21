/**
 * 
 */
package Resources;

import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vamsiravi
 *
 */
@RestController
public class RetrieveMockService {

	@RequestMapping(value="mock/{uuid}/details", method=RequestMethod.GET)
	public void retrieveMockServiceById(@PathVariable("uuid") UUID uuid){
		if(uuid!=null){
			// Retrive the Details from the Database
		}else{
			// Throw Error
		}
	}
}
