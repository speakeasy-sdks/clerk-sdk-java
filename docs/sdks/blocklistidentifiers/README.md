# BlocklistIdentifiers
(*blocklistIdentifiers()*)

## Overview

### Available Operations

* [list](#list) - List all identifiers on the block-list

## list

Get a list of all identifiers which are not allowed to access an instance

### Example Usage

```java
package hello.world;

import com.clerk.backend_api.Clerk;
import com.clerk.backend_api.models.errors.SDKError;
import com.clerk.backend_api.models.operations.ListBlocklistIdentifiersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Clerk sdk = Clerk.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
                .build();

            ListBlocklistIdentifiersResponse res = sdk.blocklistIdentifiers().list()
                .call();

            if (res.blocklistIdentifiers().isPresent()) {
                // handle response
            }
        } catch (com.clerk.backend_api.models.errors.ClerkErrors e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Response

**[ListBlocklistIdentifiersResponse](../../models/operations/ListBlocklistIdentifiersResponse.md)**

### Errors

| Error Object              | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClerkErrors | 401,402                   | application/json          |
| models/errors/SDKError    | 4xx-5xx                   | \*\/*                     |