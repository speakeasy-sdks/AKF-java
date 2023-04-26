# SDK

## Overview

A sample API that uses a petstore as an example to demonstrate features in the OpenAPI 3.0 specification

### Available Operations

* [addPet](#addpet) - Creates a new pet in the store. Duplicates are allowed
* [deletePet](#deletepet) - deletes a single pet based on the ID supplied
* [findPetById](#findpetbyid) - Returns a user based on a single ID, if the user does not have access to the pet
* [findPets](#findpets) - Returns all pets from the system that the user has access to
Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.

Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien.


## addPet

Creates a new pet in the store. Duplicates are allowed

### Example Usage

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

            no.vegvesen.tk.akf.akf_petstore_api.models.shared.NewPet req = new NewPet("distinctio") {{
                tag = "quibusdam";
            }};            

            AddPetResponse res = sdk.sdk.addPet(req);

            if (res.pet != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## deletePet

deletes a single pet based on the ID supplied

### Example Usage

```java
package hello.world;

import no.vegvesen.tk.akf.akf_petstore_api.SDK;
import no.vegvesen.tk.akf.akf_petstore_api.models.operations.DeletePetRequest;
import no.vegvesen.tk.akf.akf_petstore_api.models.operations.DeletePetResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            DeletePetRequest req = new DeletePetRequest(602763L);            

            DeletePetResponse res = sdk.sdk.deletePet(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## findPetById

Returns a user based on a single ID, if the user does not have access to the pet

### Example Usage

```java
package hello.world;

import no.vegvesen.tk.akf.akf_petstore_api.SDK;
import no.vegvesen.tk.akf.akf_petstore_api.models.operations.FindPetByIdRequest;
import no.vegvesen.tk.akf.akf_petstore_api.models.operations.FindPetByIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            FindPetByIdRequest req = new FindPetByIdRequest(857946L);            

            FindPetByIdResponse res = sdk.sdk.findPetById(req);

            if (res.pet != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## findPets

Returns all pets from the system that the user has access to
Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.

Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien.


### Example Usage

```java
package hello.world;

import no.vegvesen.tk.akf.akf_petstore_api.SDK;
import no.vegvesen.tk.akf.akf_petstore_api.models.operations.FindPetsRequest;
import no.vegvesen.tk.akf.akf_petstore_api.models.operations.FindPetsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            FindPetsRequest req = new FindPetsRequest() {{
                limit = 544883;
                tags = new String[]{{
                    add("vel"),
                    add("error"),
                    add("deserunt"),
                    add("suscipit"),
                }};
            }};            

            FindPetsResponse res = sdk.sdk.findPets(req);

            if (res.pets != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
