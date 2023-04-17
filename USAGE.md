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

            no.vegvesen.tk.akf.akf_petstore_api.models.shared.NewPet req = new NewPet() {{
                name = "Terrence Rau";
                tag = "nulla";
            }}            

            AddPetResponse res = sdk.addPet(req);

            if (res.pet.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->