# Development requirements

This project required [GraalVM](https://www.graalvm.org/downloads/) as the SDK. Use the latest available.

This project uses GraalVM to build a native image. This has been configured in the pom.xml
and will take place during the _package_ lifecycle. Currently, this probably still needs a 
lot of work, but in its basic form, it should work.