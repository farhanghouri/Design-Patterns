

## Type Of Design Pattern:

* Creational
* Structural
* Behavioural

Abstract Factory design pattern stands under the `creational` design pattern.

### Usage:

This design pattern is used when we have a parent-child relationship and at runtime based on an input, we are used these child classes. We have a factory class against each child class which takes responsibility for the instantiation of a child class. We
only need to call `get method` of particular factory class.


### Scenario:

Consider you need to use windows and mac button. You can either instantiate these button yourself in your code or you can either call specific type of button factory class which takes responsibility to fulfill the dependency.


### Implementation:


![alt text](https://github.com/farhanghouri/Design-Pattern/blob/master/AbstractFactoryDP/abstractfactory.png)
