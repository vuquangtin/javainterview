# What is the difference between abstract classes and interfaces?
|Abstract Class|	Interfaces|
|----|----|
An abstract class can provide complete, default code and/or just the details that have to be overridden|	An interface cannot provide any code at all, just the signature
In the case of an abstract class, a class may extend only one abstract class|	A Class may implement several interfaces
An abstract class can have non-abstract methods|	All methods of an Interface are abstract
An abstract class can have instance variables|	An Interface cannot have instance variables
An abstract class can have any visibility: public, private, protected|	An Interface visibility must be public (or) none
If we add a new method to an abstract class then we have the option of providing default implementation and therefore all the existing code might work properly|	If we add a new method to an Interface then we have to track down all the implementations of the interface and define implementation for the new method
An abstract class can contain constructors|	An Interface cannot contain constructors
Abstract classes are fast|	Interfaces are slow as it requires extra indirection to find the corresponding method in the actual class