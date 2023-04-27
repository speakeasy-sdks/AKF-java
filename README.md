# Petstore-API

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'no.vegvesen.tk.akf.akf_petstore_api:Petstore-API:1.4.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import no.vegvesen.tk.akf.akf_petstore_api.SDK;
import no.vegvesen.tk.akf.akf_petstore_api.models.operations.AddPetResponse;
import no.vegvesen.tk.akf.akf_petstore_api.models.shared.NewPet;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            no.vegvesen.tk.akf.akf_petstore_api.models.shared.NewPet req = new NewPet("corrupti") {{
                tag = "provident";
            }};            

            AddPetResponse res = sdk.addPet(req);

            if (res.pet != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations

### [SDK](docs/sdk/README.md)

* [addPet](docs/sdk/README.md#addpet) - Creates a new pet in the store. Duplicates are allowed
* [deletePet](docs/sdk/README.md#deletepet) - deletes a single pet based on the ID supplied
* [findPetById](docs/sdk/README.md#findpetbyid) - Returns a user based on a single ID, if the user does not have access to the pet
* [findPets](docs/sdk/README.md#findpets) - Returns all pets from the system that the user has access to
Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.

Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien.

<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
