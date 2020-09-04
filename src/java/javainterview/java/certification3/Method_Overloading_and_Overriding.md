## Method Overloading and Overriding

******
#### 40. What is the other name of Method Overloading?

Method Overloading is also known as Static Polymorphism.

#### 41. How will you implement method overloading in Java?

In Java, a class can have multiple methods with same name but different arguments. It is called Method Overloading. To implement method overloading we have to create two methods with same name
in a class and do one/more of the following:

 1. Different number of parameters
 2. Different data type of parameters
 3. Different sequence of data type of parameters

#### 42. What kinds of argument variations are allowed in Method Overloading?
Method in:
 1. Overloading allows two methods with same name to differ
 2. Number of parameters
 3. Data type of parameters Sequence of data type of parameters

#### 43. Why it is not possible to do method overloading by changing return type of method in java?
If we change the return type of overloaded methods then it will lead to ambiguous behavior. How will clients know which method will return what type. Due to this different return type are not allowed in
overloaded methods.

#### 44. Is it allowed to overload main() method in Java?
Yes, Java allows users to create many methods with same name ‘main’. But only public static void main(String[] args) method is used for execution.

#### 45. How do we implement method overriding in Java?
To override a method, we just provide a new implementation of a method with same name in subclass. So there will be at least two implementations of the method with same name. One implementation is in parent class. And another implementation is in child class.

#### 46. Are we allowed to override a static method in Java?
No. Java does not allow overriding a static method. If you create a static method with same name in subclass, then it is a new method, not an overridden method.

#### 47. Why Java does not allow overriding a static method?
To override a method, you need an instance of a class. Static method is not associated with any instance of the class. So the concept of overriding does not apply here.
Therefore, Java does not allow overriding a static method.

#### 48. Is it allowed to override an overloaded method?
Yes. You can override an overloaded method in Java.

#### 49. What is the difference between method overloading and method overriding in Java?
Differences between method overloading and overriding are:
1. Method overloading is static polymorphism. Method overriding is runtime polymorphism.
2. Method overloading occurs within the same class. Method overriding happens in two classes with hierarchy relationship.
3. Parameters must be different in method overloading.Parameters must be same in method overriding.
4. Method overloading is a compile time concept. Method overriding is a runtime concept.

#### 50. Does Java allow virtual functions?
Yes. All instance methods in Java are virtual functions by default. Only class methods and private instance methods are not virtual
methods in Java.

'''
In object-oriented programming, a virtual function or virtual method is a function or method whose behaviour can be overridden within an inheriting class by a function with the same signature to provide the polymorphic behavior.

'''
Therefore according to definition, every non-static method in JAVA is by default virtual method except final and private methods. The methods which cannot be inherited for polymorphic behavior is not a virtual method.

#### 51. What is meant by covariant return type in Java?

A covariant return type of a method is one that can be replaced by a "narrower" type when the method is overridden in a subclass.

Let say class B is child of class A. There is a get() method in class A as well as class B. get() method of class A can return an instance of A, and get() method of class B return an instance of B. Here class B overrides get() method, but the return type is different.

Before Java 5, any method that overrides the method of parent class would have same return type.

From Java 5 onwards, a child class can override a method of parent class and the child class method can return an object that is child of object return by parent class method.
