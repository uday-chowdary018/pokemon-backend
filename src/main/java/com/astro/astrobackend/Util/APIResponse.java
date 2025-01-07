package com.astro.astrobackend.Util;



public class APIResponse {

    private APIResponseStatus responseStatus;
    private Object responseData;
    
	public APIResponseStatus getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(APIResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}
	public Object getResponseData() {
		return responseData;
	}
	public void setResponseData(Object responseData) {
		this.responseData = responseData;
	}
    
}
