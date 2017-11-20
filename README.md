# jacpclib (java annual computer poker competition library)
A library implementing the latest acpc protocol (annual computer poker competition) in java

Basically this does the following: 
* implements a simplified ANTLR grammar for the acpc competition grammar (http://www.computerpokercompetition.org/downloads/documents/protocols/protocol.pdf).
* implements a model representing the match state including all required information
* implements a client being able to encode and send information game information (e.g. player actions) to the acpc server as well as retrieve and decode match state information received from the server

This is currently **work in progress!** So no guaranteed for anything to stay as it is nor work as expected! 
