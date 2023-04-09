## Type Of Design Pattern:

* Creational
* Structural
* Behavioural

Factory design pattern stands under the `creational` design pattern.

### Usage:

This design pattern is used when we have a parent-child relationship and at runtime based on an input, we are used these child classes. We have a single factory class which takes responsibility for the instantiation of all child classes. We only need to call `get method` of the factory class.

### Scenario:

Consider you need to use windows and mac button. You can either instantiate these button yourself in your code or you can either call button factory class which takes responsibility to fulfill the dependency.

### Implementation:

![alt text](https://github.com/farhanghouri/Design-Pattern/blob/master/FactoryDP/factory.png)
