## Type Of Design Pattern:

* Creational
* Structural
* Behavioural

Proxy design pattern stands under the `Structural` design pattern.

### Usage:

This design pattern is useful when we want to provide limit resources of a class. Proxy design pattern provide a `proxy class` which act as a placeholder class of original class. The `proxy class` restrict some functionality of original class.

### Scenario:

Consider you have a file system class which performs read/write functionality but you want to restrict file write functionality against unknown user. A `proxy class` fulfill this kind of need.

### Implementation:

![alt text](https://github.com/farhanghouri/Design-Pattern/blob/master/ProxyPattern/proxy.png)
