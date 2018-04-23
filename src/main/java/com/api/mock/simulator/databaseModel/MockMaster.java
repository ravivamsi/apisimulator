/**
 * 
 */
package com.api.mock.simulator.databaseModel;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author vamsiravi
 *
 */
@Entity
public class MockMaster {
	
	@Id
    private UUID uuid;
	
	private String httpMethod;
    private String requestBody;
    private String responseBody;
    private int statusCode;
    private String path;
    
    
    public MockMaster(){}

    public MockMaster(String httpMethod, String requestBody, String responseBody, String path, int statusCode){
        this.httpMethod = httpMethod;
        this.requestBody = requestBody;
        this.responseBody = responseBody;
        this.statusCode = statusCode;
        this.path = path;
    }

	/**
	 * @return the uuid
	 */
	public UUID getUuid() {
		return uuid;
	}

	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the httpMethod
	 */
	public String getHttpMethod() {
		return httpMethod;
	}

	/**
	 * @param httpMethod the httpMethod to set
	 */
	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}

	/**
	 * @return the requestBody
	 */
	public String getRequestBody() {
		return requestBody;
	}

	/**
	 * @param requestBody the requestBody to set
	 */
	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}

	/**
	 * @return the responseBody
	 */
	public String getResponseBody() {
		return responseBody;
	}

	/**
	 * @param responseBody the responseBody to set
	 */
	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}

	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

    
    
}
