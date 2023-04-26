/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package no.vegvesen.tk.akf.akf_petstore_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import no.vegvesen.tk.akf.akf_petstore_api.utils.SpeakeasyMetadata;

public class FindPetByIdRequest {
    /**
     * ID of pet to fetch
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public Long id;
    public FindPetByIdRequest withId(Long id) {
        this.id = id;
        return this;
    }
    
    public FindPetByIdRequest(@JsonProperty("id") Long id) {
        this.id = id;
  }
}
