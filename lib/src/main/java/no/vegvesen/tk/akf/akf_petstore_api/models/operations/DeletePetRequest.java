/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package no.vegvesen.tk.akf.akf_petstore_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import no.vegvesen.tk.akf.akf_petstore_api.utils.SpeakeasyMetadata;

public class DeletePetRequest {
    /**
     * ID of pet to delete
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public Long id;

    public DeletePetRequest withId(Long id) {
        this.id = id;
        return this;
    }
    
    public DeletePetRequest(@JsonProperty("id") Long id) {
        this.id = id;
  }
}
