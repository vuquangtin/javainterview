
## JUnit

************

_JUnit_ 5 is the next generation of JUnit. The goal is to create an up-to-date foundation for developer-side testing on the JVM. This includes focusing on Java 8 and above, as well as enabling many different styles of testing.

JUnit 5 is the result of JUnit Lambda and its crowdfunding campaign on Indiegogo.

#### What is assert keyword - How to use Assertions in java?

* assert is keyword in java, it was added in java 4.
* Generally during testing phase we use assert keyword to avoid Runtime Exceptions in java.
* Assertions makes our code easy to debug at runtime in java.
* Assertions makes our code production ready.

1. `assertEquals([String message], expected, actual)` –any kind of object can be used for testing equality –native types and objects, also specify tolerance when checking for equality in case of floating point numbers.
2. `assertNull([String message], java.lang.Objectobject)` –asserts that a given object is null
3. `assertNotNull([String message], java.lang.Objectobject)` –asserts that a given object isnotnull
4. `assertTrue([String message], Boolean condition)` –Asserts that the given Boolean condition is true
5. `assertFalse([String message], Boolean condition)` –Asserts that the given Boolean condition is false
6. `fail([String message])` –Fails the test immediately with the optional message 


#### What are the useful JUnit extensions?
1. JWebUnit
2. XMLUnit
3. Cactus
4. MockObject

#### What are parameterized tests?

Parameterized tests enable developer to perform the same test over and again using different values.

#### What Is Junit TestSuite?

JUnit TestSuite is a container class under package junit.framework.TestSuite. It allows us to group multiple test cases into a collection and run them together. (JUnit 4.4 does not support TestSuite class now).

#### What is Junit Test Fixture?

A test fixture is a fixed state of a set of objects used as a baseline for running tests. Their purpose is to ensure that there is a well known and fixed environment in which tests are run so that results are repeatable. Examples of fixtures:

1. Loading a database with a specific, known set of data
2. Copying a specific known set of files
3. Preparation of input data and setup/creation of fake or mock objects.

If a group of tests shares the same fixtures, you should write a separate setup code to create the common test fixture. If a group of tests requires different test fixtures, you can write code inside the test method to create its own test fixture.

#### How do you test a “protected” method?

A protected method can only be accessed within the same package where the class is defined. So, testing a protected method of a target class means we need to define your test class in the same package as the target class.

#### How do you test a “private” method?

A private method only be accessed within the same class. So there is no way to test a “private” method of a target class from any test class. A way out is that you can perform unit testing manually or can change your method from “private” to “protected”.

#### When objects are garbage collected after a test is executed?

By design, the tree of Test instances is built in one pass. Then the tests are executed in a second pass. The test runner holds strong references to all Test instances for the duration of the test execution. This means that for a very long test run with many Test instances, none of the tests may be garbage collected until the end of the entire test run. Therefore, if you allocate external or limited resources in a test, you are responsible for freeing those resources. Explicitly setting an object to null in the tearDown() method, for example, allows it to be garbage collected before the end of the entire test run.


#### What is Test Driven Development (TDD)?

TDD is an iterative software development process where you first write the test with the idea that it must fail.

This is a different approach to the traditional development where you write the application functionality first and then write test cases. The major benefit of this approach is that the code becomes thoroughly unit tested (you can use JUnit or other unit testing frameworks).

<img src="https://www.researchgate.net/profile/Shabib_Aftab/publication/316273992/figure/fig1/AS:485130474135552@1492675526440/Work-flow-of-Test-Driven-Development-1-TDD-Life-Cycle-Test-driven-development-life.ppm" width="400" height="600"> 

* STEP: 1 write some tests for a specific business requirement.
* STEP: 2 write some basic structural code so that your test compiles but the test should fail (failures are the
* pillars of success). For example just create the necessary classes and corresponding methods with skeletal code.
* STEP: 3 write the required business code to pass the tests which you wrote in step 1.
* STEP: 4 finally refactor the code you just wrote to make it is as simple as it can be. You can refactor your code
* with confidence that if it breaks the business logic then you have unit test cases that can quickly detect it.
* STEP: 5 run your tests to make sure that your refactored code still passes the tests.
* STEP: 6 Repeat steps 1-5 for another business requirement.

To write tests efficiently some basic guidelines need to be followed:

* You should be able to run each test in isolation and in any order.
* The test code should not have any duplicate business logic.
* You should test for all the pre and post conditions as well as exceptions.
* Each test should concentrate on one business requirement as mentioned earlier.
* There are many ways to write test conditions so proper care and attention should be taken. In some cases pair programming can help by allowing two brains to work in collaboration. You should have strategies to overcome issues around state of data in RDBMS (Should you persist sample test data, which is a snapshot of your actual data prior to running your tests? Or should you hard code data? Or Should you combine both strategies? Etc).