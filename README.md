# GroupDocs.Annotation Cloud SDK for Java

This repository contains GroupDocs.Annotation Cloud SDK for Java source code. This SDK allows you to work with GroupDocs.Annotation Cloud REST APIs in your Java applications.

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add following repository and dependency to your project's POM

```xml
<repository>
    <id>groupdocs-artifact-repository</id>
    <name>GroupDocs Artifact Repository</name>
    <url>http://artifact.groupdocs.cloud/repo</url>
</repository>
```

```xml
<dependency>
    <groupId>com.groupdocs</groupId>
    <artifactId>groupdocs-annotation-cloud</artifactId>
    <version>21.6</version>
    <scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

```shell
mvn package
```

Then manually install the following JARs:

* target/groupdocs-annotation-cloud-21.6.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.api.AnnotateApi;

import java.io.File;
import java.util.*;

public class AnnotateApiExample {

    public static void main(String[] args) {
        //TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free registration is required).
        String appSid = "XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX";
        String appKey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

        AnnotateApi apiInstance = new AnnotateApi(appSid, appKey);
        AnnotateOptions options = new AnnotateOptions(); // AnnotateOptions | Annotation options
        try {
            AnnotationApiLink result = apiInstance.annotate(options);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotateApi#annotate");
            e.printStackTrace();
        }
    }
}

```

## Licensing

All GroupDocs.Annotation Cloud SDKs are licensed under [MIT License](LICENSE).

## Resources

+[**Website**](https://www.groupdocs.cloud)
+[**Product Home**](https://products.groupdocs.cloud/annotation/cloud)
+[**Documentation**](https://docs.groupdocs.cloud/annotation/)
+[**Free Support Forum**](https://forum.groupdocs.cloud/c/annotation)
+[**Blog**](https://blog.groupdocs.cloud/category/groupdocs-annotation-cloud-product-family)

## Contact Us

Your feedback is very important to us. Please feel free to contact us using our [Support Forums](https://forum.groupdocs.cloud/c/annotation).
