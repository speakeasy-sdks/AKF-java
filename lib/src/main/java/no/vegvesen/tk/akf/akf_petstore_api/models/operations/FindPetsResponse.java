/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package no.vegvesen.tk.akf.akf_petstore_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class FindPetsResponse {
    
    public String contentType;

    public FindPetsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * unexpected error
     */
    
    public no.vegvesen.tk.akf.akf_petstore_api.models.shared.Error error;

    public FindPetsResponse withError(no.vegvesen.tk.akf.akf_petstore_api.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    /**
     * pet response
     */
    
    public no.vegvesen.tk.akf.akf_petstore_api.models.shared.Pet[] pets;

    public FindPetsResponse withPets(no.vegvesen.tk.akf.akf_petstore_api.models.shared.Pet[] pets) {
        this.pets = pets;
        return this;
    }
    
    
    public Integer statusCode;

    public FindPetsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public FindPetsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public FindPetsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
