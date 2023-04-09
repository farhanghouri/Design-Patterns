## Type Of Design Pattern:

* Creational
* Structural
* Behavioural


Facade design pattern stands under the `structural` design pattern.

### Usage:

This design pattern is used when we have a set of interfaces and you want to interact only a single interface. Facade design pattern provides a `top-level (wrapper) interface`. The client only communicates this interface to fulfill his needs.

### Scenario:

Consider you need to perform some converter functionality and you have an xml and json converter. Both xml and json interface work differently. Facade design pattern provide an `wrapper interface` which interact these interfaces in abstract manner.

### Implementation:


![alt text](https://github.com/farhanghouri/Design-Patterns/blob/main/FascadeDP/fascade.png)
