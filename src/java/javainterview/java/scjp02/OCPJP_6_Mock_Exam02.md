# OCPJP 6 Mock Exam – 5
----
### Q 1 : Which of the following are the correct form of documentation comments?

1. //some text here
2. /*some text here*/
3. /**some text here*/
4. all the above

### Q 2 : State the correct formula for minimum/maximum values for integer primitives where no_of_bits is the size of the type in bits.

1. 2^(no_of_bits-1) / 2^(no_of_bits-1)+1
2. 2^(no_of_bits+1) / 2^(no_of_bits+1)+1
3. 2^(no_of_bits-1) / 2^(no_of_bits-1)-1
4. all the above

###Q 3 : Which of the following initializes boolean primitive?


1. Boolean flag=true;
2. boolean flag=true;
3. boolean flag=TRUE;
4. Boolean flag=TRUE;

### Q 4 : which of the following is the correct way to define a class that will be in the default package

1. package default;<br/>
import java.util.*;
2. import java.util.*;<br/>
 package default;
3. import java.util.*;
4. all the above

### Q 5 : Which of the following main method in a java application is correct?

1. public static void main(String[] args)
2. public void main(String args[])
3. public static void main (string[] args)
4. final public static void main (String[] args)
5. static public void main(String x[])
6. static void main (string[] args)
7. 1 and 5 only.
8. 7 and 4

### Q 6 : Which of the following is default integer primitive

1. short
2. int
3. byte
4. char
5. long

### Q 7 : Which of the following is not a reserved word in java
1. import
2. finally
3. **friend**
4. **goto**


### Q 8 : When writing a utility class, someclass, which extends mainclass class and will be used by several other classes in a large project. These other classes will be in different packages.Pick the correct class declaration

1. class someclass extends mainclass
2. protected class someclass extends mainclass
3. **public class someclass extends mainclass**
4. none


### Q 9 : Which of the following variable names are invalid?

1. example
2. **2sumup**
3. its4u
4. $money

### Q 10 : Take a look at the following code:

```java
       public static void main (String[] args){

       System.out.println(args[1]);

}
```
The above is compiled and then executed by the following command line.

```java
java test one two three four
```

1. one
2. two
3. three
4. four
5. none.

# Answers
----
Q 1 : 3 is correct.

Q 2 : 3 is correct. Substitute no_of_bits = ( 8 for byte , 16 for short, 16 for char, 32 for int, 64 for long, 32 for float, 64 for double).We get (2^7) / (2^7) -1 for int and so on for other types.

Q 3 : 2 is correct. primitive boolean keyword is ‘boolean’ and boolean can be only ‘true’ or ‘false’.

Q 4 : 3 is correct. there is nothing like explicit declaration for default package. The class is added to default package if there is no package statement..

Q 5 : 8 is correct. Valid declaration for the main() method must be public and static, have void as return type and take a single array of String objects as arguments. The order of public and static keywords is irrelevant. Also declaring the method final does not effect the method’s potential to be used as a main() method..

Q 6 : 2 is correct.

Q 7 : 3 is correct. There are no friend functions as in C++.

Q 8 : 3 is correct.

Q 9 : 2 is correct.

Q 10 : 2 is correct. Array index start from 0. So somearray[0] points to the first element in the array.

# OCPJP 6 Mock Exam – 6
----

### 1 . Please select signed integrals1. char, byte, and short2. byte, short, int, and long 
3. char, short, and long### 2 . Java characters are ...1. ASCII code 
2. Binary code 
3. Unicode4. ANSI code### 3 . Please select the size of an int type1. 32 bytes 
2. 16 bits 
3. 32 bits 
4. 16 bytes### 4 . Select default value of boolean type

1. true
2. false
3. 0
4. 1

https://javabeat.net/ocpjp-6-mock-exam-java-6/

### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 

### 


### 


### 


### 


### 




