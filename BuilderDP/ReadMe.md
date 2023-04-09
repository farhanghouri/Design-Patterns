## Type Of Design Pattern:

* Creational
* Structural
* Behavioural

Builder design pattern stands under the `creational` design pattern.

### Usage:

This design pattern is used when the creation of an object is heavy and complex and you want to build object `step by step` (incremental way) and after building call the  `build method` which return the final object.

### Scenario:

Consider you need to construct a network packet. Builder pattern provides a builder class to construct this packet in an incremental way by calling the packet builder class methods.

### Implementation:

![alt text](https://github.com/farhanghouri/Design-Pattern/blob/master/BuilderDP/builder.png)
