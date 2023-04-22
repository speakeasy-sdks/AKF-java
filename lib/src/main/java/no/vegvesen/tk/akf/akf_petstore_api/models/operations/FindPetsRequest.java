/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package no.vegvesen.tk.akf.akf_petstore_api.models.operations;

import no.vegvesen.tk.akf.akf_petstore_api.utils.SpeakeasyMetadata;

public class FindPetsRequest {
    /**
     * maximum number of results to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Integer limit;
    public FindPetsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * tags to filter by
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tags")
    public String[] tags;
    public FindPetsRequest withTags(String[] tags) {
        this.tags = tags;
        return this;
    }
    

    public FindPetsRequest(){}
}
