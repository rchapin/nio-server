# Extensible Java NIO Server

**By:** Ryan Chapin <rchapin@nbinteractive.com>

This is a NIO Server that provides a simple framework for setting up a NIO Java server to enable clients to connect to and send data.  The primary reason for being in Java is to provide a platform/language independent entry point for the collection of data to then be ingested into a JMS/Java based messaging system.

The architecture enables users to develop their own message processor plugins such that any type of message processing algorithm which can be written in Java can be implemented.

It also provides for multi-threaded processing of messages via a producer/consumer pattern with a configurable set of consumer threads.

## Development Environment Set-up

This project was developed with Eclipse Kepler, but can be compiled from the command line with maven.

### To set up to develop and run from within Eclipse (requires m2e and m2e slf4j Eclipse plugins)

1. From within Eclipse, go to File -> Import and select, Maven -> Existing Maven Projects and click 'Next'.
2. Then browse to the nio-server/ dir and select it.

### Running from within Eclipse

There is an eclipse launcher file included in ```src/test/resources/launchers/NioServer.launch```.

## Building a Distribution

To build, simply run the following command in the nio-server directory

```
# mvn clean package && mvn assembly:assembly
```

This will build the project and create a distribution .tar.gz file in the target/ directory

## To Run

TBD

