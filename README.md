# Mojarra JSF Javascript Bug

This repository provides a very basic web application to demonstrate a bug in the Mojarra JSF Javascript implementation

## Details of the Bug

JIRA Issue: https://java.net/jira/browse/JAVASERVERFACES-3471

When the JSF AJAX Javascript library discovers a form with an encoding type of **multipart/form-data**, it creates an iframe for all f:ajax requests.

When the iframe is created (lazily done on the first f:ajax trigger), the form's tag is updated with a target attribute to point to the iframe.  This causes all form submits to be posted to the iframe, from which the results are pulled and the page is updated.

The bug lies in that the target continues to point to the iframe.  This then causes all non-ajax form submissions to still go to the iframe, meaning successful form submissions are hidden, as well as all form validation errors are hidden, without the user knowing a thing (without looking at the server console).

## Patching the Bug

The patch is quite simple... return the form's target back to its original value after the form has been submitted.

## To Run the Demo

Simply checkout the code and run

```
mvn wildfly:run
```

A Wildfly instance will download, startup, and then deploy your app.  You can then access it at http://localhost:8080/demo.  From there, you'll have the option to view the bugged or patched demos.

