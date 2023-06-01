/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package no.vegvesen.tk.akf.akf_petstore_api;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import no.vegvesen.tk.akf.akf_petstore_api.utils.HTTPClient;
import no.vegvesen.tk.akf.akf_petstore_api.utils.HTTPRequest;
import no.vegvesen.tk.akf.akf_petstore_api.utils.JSON;
import no.vegvesen.tk.akf.akf_petstore_api.utils.SerializedBody;
import no.vegvesen.tk.akf.akf_petstore_api.utils.SpeakeasyHTTPClient;
import org.apache.http.NameValuePair;

/**
 * A sample API that uses a petstore as an example to demonstrate features in the OpenAPI 3.0 specification
 */
public class SDK {
	/**
	 * SERVERS contains the list of server urls available to the SDK.
	 */
	public static final String[] SERVERS = {
        "https://petstore.swagger.io/v2",
	};
	
	
	
	
  		

	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	
	private String _serverUrl;
	private String _language = "java";
	private String _sdkVersion = "1.14.0";
	private String _genVersion = "2.34.2";
	/**
	 * The Builder class allows the configuration of a new instance of the SDK.
	 */
	public static class Builder {
		private HTTPClient client;
		
		private String serverUrl;
		private java.util.Map<String, String> params = new java.util.HashMap<String, String>();

		private Builder() {
		}

		/**
		 * Allows the default HTTP client to be overridden with a custom implementation.
		 * @param client The HTTP client to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setClient(HTTPClient client) {
			this.client = client;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL.
		 * @param serverUrl The server URL to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl) {
			this.serverUrl = serverUrl;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL  with a templated URL populated with the provided parameters.
		 * @param serverUrl The server URL to use for all requests.
		 * @param params The parameters to use when templating the URL.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.serverUrl = serverUrl;
			this.params = params;
			return this;
		}
		
		/**
		 * Builds a new instance of the SDK.
		 * @return The SDK instance.
		 * @throws Exception Thrown if the SDK could not be built.
		 */
		public SDK build() throws Exception {
			return new SDK(this.client, this.serverUrl, this.params);
		}
	}

	/**
	 * Get a new instance of the SDK builder to configure a new instance of the SDK.
	 * @return The SDK builder instance.
	 */
	public static Builder builder() {
		return new Builder();
	}

	private SDK(HTTPClient client, String serverUrl, java.util.Map<String, String> params) throws Exception {
		this._defaultClient = client;
		
		if (this._defaultClient == null) {
			this._defaultClient = new SpeakeasyHTTPClient();
		}
		
		if (this._securityClient == null) {
			this._securityClient = this._defaultClient;
		}

		if (serverUrl != null && !serverUrl.isBlank()) {
			this._serverUrl = no.vegvesen.tk.akf.akf_petstore_api.utils.Utils.templateUrl(serverUrl, params);
		}
		
		if (this._serverUrl == null) {
			this._serverUrl = SERVERS[0];
		}

		if (this._serverUrl.endsWith("/")) {
            this._serverUrl = this._serverUrl.substring(0, this._serverUrl.length() - 1);
        }

		
	}

    /**
     * Creates a new pet in the store. Duplicates are allowed
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public no.vegvesen.tk.akf.akf_petstore_api.models.operations.AddPetResponse addPet(no.vegvesen.tk.akf.akf_petstore_api.models.shared.NewPet request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = no.vegvesen.tk.akf.akf_petstore_api.utils.Utils.generateURL(baseUrl, "/pets");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = no.vegvesen.tk.akf.akf_petstore_api.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        no.vegvesen.tk.akf.akf_petstore_api.models.operations.AddPetResponse res = new no.vegvesen.tk.akf.akf_petstore_api.models.operations.AddPetResponse(contentType, httpRes.statusCode()) {{
            pet = null;
            error = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (no.vegvesen.tk.akf.akf_petstore_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                no.vegvesen.tk.akf.akf_petstore_api.models.shared.Pet out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), no.vegvesen.tk.akf.akf_petstore_api.models.shared.Pet.class);
                res.pet = out;
            }
        }
        else {
            if (no.vegvesen.tk.akf.akf_petstore_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                no.vegvesen.tk.akf.akf_petstore_api.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), no.vegvesen.tk.akf.akf_petstore_api.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * deletes a single pet based on the ID supplied
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public no.vegvesen.tk.akf.akf_petstore_api.models.operations.DeletePetResponse deletePet(no.vegvesen.tk.akf.akf_petstore_api.models.operations.DeletePetRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = no.vegvesen.tk.akf.akf_petstore_api.utils.Utils.generateURL(no.vegvesen.tk.akf.akf_petstore_api.models.operations.DeletePetRequest.class, baseUrl, "/pets/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        no.vegvesen.tk.akf.akf_petstore_api.models.operations.DeletePetResponse res = new no.vegvesen.tk.akf.akf_petstore_api.models.operations.DeletePetResponse(contentType, httpRes.statusCode()) {{
            error = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
        }
        else {
            if (no.vegvesen.tk.akf.akf_petstore_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                no.vegvesen.tk.akf.akf_petstore_api.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), no.vegvesen.tk.akf.akf_petstore_api.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Returns a user based on a single ID, if the user does not have access to the pet
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public no.vegvesen.tk.akf.akf_petstore_api.models.operations.FindPetByIdResponse findPetById(no.vegvesen.tk.akf.akf_petstore_api.models.operations.FindPetByIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = no.vegvesen.tk.akf.akf_petstore_api.utils.Utils.generateURL(no.vegvesen.tk.akf.akf_petstore_api.models.operations.FindPetByIdRequest.class, baseUrl, "/pets/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        no.vegvesen.tk.akf.akf_petstore_api.models.operations.FindPetByIdResponse res = new no.vegvesen.tk.akf.akf_petstore_api.models.operations.FindPetByIdResponse(contentType, httpRes.statusCode()) {{
            pet = null;
            error = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (no.vegvesen.tk.akf.akf_petstore_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                no.vegvesen.tk.akf.akf_petstore_api.models.shared.Pet out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), no.vegvesen.tk.akf.akf_petstore_api.models.shared.Pet.class);
                res.pet = out;
            }
        }
        else {
            if (no.vegvesen.tk.akf.akf_petstore_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                no.vegvesen.tk.akf.akf_petstore_api.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), no.vegvesen.tk.akf.akf_petstore_api.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Returns all pets from the system that the user has access to - Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia. -  - Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. - 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public no.vegvesen.tk.akf.akf_petstore_api.models.operations.FindPetsResponse findPets(no.vegvesen.tk.akf.akf_petstore_api.models.operations.FindPetsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = no.vegvesen.tk.akf.akf_petstore_api.utils.Utils.generateURL(baseUrl, "/pets");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = no.vegvesen.tk.akf.akf_petstore_api.utils.Utils.getQueryParams(no.vegvesen.tk.akf.akf_petstore_api.models.operations.FindPetsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        no.vegvesen.tk.akf.akf_petstore_api.models.operations.FindPetsResponse res = new no.vegvesen.tk.akf.akf_petstore_api.models.operations.FindPetsResponse(contentType, httpRes.statusCode()) {{
            pets = null;
            error = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (no.vegvesen.tk.akf.akf_petstore_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                no.vegvesen.tk.akf.akf_petstore_api.models.shared.Pet[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), no.vegvesen.tk.akf.akf_petstore_api.models.shared.Pet[].class);
                res.pets = out;
            }
        }
        else {
            if (no.vegvesen.tk.akf.akf_petstore_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                no.vegvesen.tk.akf.akf_petstore_api.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), no.vegvesen.tk.akf.akf_petstore_api.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
}