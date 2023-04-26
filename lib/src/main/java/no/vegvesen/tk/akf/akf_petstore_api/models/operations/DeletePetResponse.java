/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package no.vegvesen.tk.akf.akf_petstore_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class DeletePetResponse {
    
    public String contentType;
    public DeletePetResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * unexpected error
     */
    
    public no.vegvesen.tk.akf.akf_petstore_api.models.shared.Error error;
    public DeletePetResponse withError(no.vegvesen.tk.akf.akf_petstore_api.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    
    public Integer statusCode;
    public DeletePetResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public DeletePetResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public DeletePetResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
