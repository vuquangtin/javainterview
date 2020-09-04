## JDBC

******************


#### 1. What is JDBC?

JDBC stands for Java database connectivity, it allows you to connect to database from java code.


#### 2. What are different type of JDBC drivers? And which all drivers you have used?

There are 4 types of JDBC driver. 
1. Type 1 JDBC driver -  JDBC-ODBC Bridge driver (Bridge driver)
2. Type 2 JDBC driver -  Native-API/partly Java driver (Native driver)
3. Type 3 JDBC driver -  All Java/Net-protocol driver (Middleware driver)
4. Type 4 JDBC driver -  All Java/Native-protocol driver (Pure java driver)


Type 1 JDBC driver -  JDBC-ODBC Bridge driver (Bridge driver)

Type 1 JDBC driver translates all JDBC calls into the ODBC calls.
Then send those ODBC calls to the ODBC driver.
ODBC driver sends those calls to database.


Type 2 JDBC driver -  Native-API/partly Java driver (Native driver)

Type 2 JDBC drivers converts all the JDBC calls into database specific calls.


Example: When we use Oracle database -
Type 2 JDBC drivers converts all the JDBC calls into Oracle database specific calls using the oracle native api’s.

Type 3 JDBC driver -  All Java/Net-protocol driver (Middleware driver)

In Type 3 JDBC driver, the database requests are passed to the middle-tier server through the network. 
Then middle-tier translates and sends the request to the database. (middle-tier server may use Type 1, Type 2 or Type 4 drivers)

Type 4 JDBC driver -  All Java/Native-protocol driver (Pure java driver)


Type JDBC 4 drivers uses java api’s to communicate directly with the database server.
Type JDBC 4 driver is most popular and widely used driver.
Type JDBC 4 drivers are purely written in java, 

And regarding driver you have used - These days probably you must be working in Type 4 JDBC driver, it’s the most popular and widely used driver.


#### 3. How to connect to database from java code using JDBC in java?

#### 4. What is Statement in JDBC java?
#### 5. What is PreparedStatement in JDBC java?

6. What is CallableStatement in JDBC java? When to use CallableStatement in java? 
7. How to execute database Stored procedures in JDBC java?
8. How to call database cursors from java?
9. What are differences between Statement, PreparedStatement and CallableStatement in JDBC java?
10. What is java.sql.ResultSet in detail in JDBC java?
11. What are ResultSet Types in JDBC java?

 Types of ResultSet in java >
TYPE_FORWARD_ONLY: 
In TYPE_FORWARD_ONLY cursor can only move forward on the result set, not backward.
It is default ResultSet type in java.


Note : TYPE_FORWARD_ONLY is the default ResultSet type in java. uuu


TYPE_SCROLL_INSENSITIVE: 
In TYPE_SCROLL_INSENSITIVE cursor can move (scroll) both forward and backward, 
Cursor can be moved to absolute/specific/relative position as well. 
TYPE_SCROLL_INSENSITIVE is not sensitive to the changes made to the data that underlies the ResultSet. (It means that if some thread modifies the data in the database which ResultSet currently holds won’t impact/change the already opened ResultSet’s data).


TYPE_SCROLL_SENSITIVE: 
In TYPE_SCROLL_SENSITIVE cursor can move (scroll) both forward and backward, 
Cursor can be moved to absolute/specific/relative position as well. 
TYPE_SCROLL_SENSITIVE is sensitive to the changes made to the data that underlies the ResultSet. (It means that if some thread modifies the data in the database which ResultSet currently holds will impact/change the already opened ResultSet’s data).
Must know : getType() - method returns ResultSet object type. It may be TYPE_FORWARD_ONLY (1003), TYPE_SCROLL_INSENSITIVE  (1004) or TYPE_SCROLL_SENSITIVE (1005)

12. What are ResultSet concurrency in JDBC java?

ResultSet concurrency read/update >
CONCUR_READ_ONLY -  CONCUR_READ_ONLY  mode means ResultSet object is read only it may not be updated.
CONCUR_UPDATABLE  - CONCUR_UPDATABLE mode means ResultSet object can be read and updated as well.
Note : All databases and drivers may not support CONCUR_UPDATABLE mode.
Must know : getConcurrency() - method returns concurrency mode of this ResultSet object. It may be CONCUR_READ_ONLY (1007) or CONCUR_UPDATABLE  (1008)

13. What are ResultSet holdability in JDBC java?

ResultSet holdability >
HOLD_CURSORS_OVER_COMMIT -  HOLD_CURSORS_OVER_COMMIT holdability indicates that open ResultSet objects will remain open when the current transaction is committed.
CLOSE_CURSORS_AT_COMMIT -  CLOSE_CURSORS_AT_COMMIT holdability indicates that open ResultSet objects will be closed when the current transaction is committed.
Note : All databases and drivers may not support ResultSet holdability.
Must know : getHoldability() - method returns holdability of this ResultSet object. It may be HOLD_CURSORS_OVER_COMMIT (1) or CLOSE_CURSORS_AT_COMMIT (2)


14. What are some important and most frequently used ResultSet methods in JDBC java?

ResultSet methods - To navigate over ResultSet >
first() - first method makes cursor to point to the first row in the ResultSet object.
last() - last method makes cursor to point to the last row in the ResultSet object.


next() - next method makes cursor to point to the next row in the ResultSet object.
previous() - previous method makes cursor to point to the previous row in the ResultSet object.


beforeFirst() - beforeFirst method makes cursor to point to the front of the ResultSet object, just before the first row.
afterLast() - afterLast method makes cursor to point to the last/end of the ResultSet object, just after the last row.


absolute(int row) - absolute method moves the cursor to the specified row number in this ResultSet object. 
relative(int rows ) - relative method moves the cursor a relative number of rows, either positive or negative.


ResultSet information methods >
isFirst() - method returns true if cursor points to first row in ResultSet object.
isBeforeFirst() - method returns true if cursor is before the first row in ResultSet object.
isAfterLast() - method returns true if cursor is after the last row in ResultSet object.


getRow() - method retrieves the current row number. The first row is number 1, the second number 2.


getType() - method returns ResultSet object type. It may be TYPE_FORWARD_ONLY (1003), TYPE_SCROLL_INSENSITIVE  (1004) or TYPE_SCROLL_SENSITIVE (1005)
getConcurrency() - method returns concurrency mode of this ResultSet object. It may be CONCUR_READ_ONLY (1007) or CONCUR_UPDATABLE  (1008)
getHoldability() - method returns holdability of this ResultSet object. It may be HOLD_CURSORS_OVER_COMMIT (1) or CLOSE_CURSORS_AT_COMMIT (2)

 refreshRow() - method refreshes the current row with its most recent value available in the database.


15. What is difference between TYPE_SCROLL_INSENSITIVE and TYPE_SCROLL_SENSITIVE ResultSet type in java? 


16. How to store and retrieve image from database?

BLOB data type is used to store and retrieve IMAGE (Storing in and retrieving out from database)
IMAGE - Storing in and retrieving out from database


18. What are Difference between CLOB and BLOB data type in Oracle?

| **CLOB data type**                                                                                           | **BLOB data type**                                              |
| :---------------------------------------------------------------------------------------------------------- | :------------------------------------------------------------- |
| CLOB stands for Character Large Object.                                                                      | BLOB stands for Binary Large Object.                            |
| CLOB stores values in character streams.                                                                     | BLOB stores values in bitstreams.                               |
| CLOB is used for storing single-byte character data (Character string made up of single-byte character data) | BLOB is used for storing binary data.                           |
| CLOB data type is appropriate for storing text information. Example ><ol><li>text files</li><li>pdf</li><li>doc</li><li>docx.</li><li>odf formats</li></ol>                                        | BLOB data type is appropriate for storing following >text files <ol><li>image</li><li>graphical</li><li>voice</li><li>some application specific data.</li></ol>




#### 19. What are JDBC Transactions in java?

If any transaction fails in between then rollback the transaction by calling con.rollback(), commit the transaction by using con.commit() only if it went successful.


We can set autocommit mode of connection to false using connection.setAutoCommit(false) and then accordingly use connection.commit() or connection.rollback()


Example - 
Let's say we have to update salary of two employees, and salary of both employees must be updated simultaneously in database.


And let's say salary of first employee is updated successfully. But, if anything goes wrong in updating salary of second employee than any updation done to first employee's salary will be rolled back. 


#### 20. What is DriverManager class in java?

 `java.sql.DriverManager` is the basic service for managing set of JDBC drivers
1. DriverManager helps in establishing connection between driver and database.
2. java.sql.DriverManager class allows user to customize the JDBC Drivers used in the application by because the java.sql.DriverManager class attempts to load the driver classes referenced in the 'jdbc.drivers' system property. 
3. When getConnection method is called, the DriverManager attempts to locate suitable driver from amongst those which were loaded at initialization and those which were loaded explicitly using the same classloader as the current applet or application.




#### 21. What is Connection class in java JDBC ?

`java.sql.Connection` helps in establishing connection/session with database.
java.sql.Connection extends java.lang.AutoCloseable interface from which java 7
Important methods >
Database information related methods - 

1. `getMetaData` - Method returns DatabaseMetaData. DatabaseMetaData can be used to obtain information about the database as a whole.

Transaction related methods - 

1. `setAutoCommit(boolean autoCommit)` = for setting autocommit mode of transactions
2. `commit()` - method can be used to commit the transactions.
3. `rollback()` - method can be used to rollback the transactions.
4. `close()` - It closes the connection

Statement related methods - 
1. `createStatement()` -
2. `prepareStatement(String sql)` -


 #### 22. What is ResultSetMetaData in JDBC java?


 `java.sql.ResultSetMetaData` is an interface in java. 
java.sql.ResultSetMetaData object can be used to get information about the types and properties of the columns in a java.sql.ResultSet object.
java.sql.ResultSetMetaData extends java.sql.Wrapper.
ResultSetMetaData important methods -
 getColumnCount = To find out total number of columns in table
 getColumnName =  Display table's column type 
 getColumnTypeName=  Display table's column type 

#### 23. What is DatabaseMetaData in JDBC java?

 `java.sql.DatabaseMetaData` is an interface. 
`java.sql.DatabaseMetaData` can be used to obtain information about the database as a whole.
`java.sql.DatabaseMetaData` extends `java.sql.Wrapper`.

DatabaseMetaData important methods -
1. `getDriverName()` - Returns driver name.
2. `getDriverVersion()` - returns driver version.
3. `getDatabaseProductName()` - returns database name
4. `getDatabaseProductVersion()` - returns database version
5. `getUserName()` - returns username used to connect to database.
6. `getURL()` - returns URL used to connect to database.
7. `getDatabaseMinorVersion()` - returns database’s minor/initial version.
8. `getDatabaseMajorVersion()` - returns current database version.

#### 24. How to do pagination in JDBC java OR How can you read all the records from database table with huge records?

Sql query used to perform pagination>

```sql
select emp.id, emp.name from 
  ( select rownum rn, e.* from EMPLOYEE e) emp
 where rn >=? and rn< =? ;
```

Replace both occurrence of ? with range from which to which you want to fetch data.

Example >

```sql
select emp.id, emp.name from 
  ( select rownum rn, e.* from EMPLOYEE e) emp
 where rn >=6 and rn< =10 ;
 ```
Above query will fetch rows between 6-10 (including) from Oracle database.

**Pagination in ORACLE** 

Alternatively you can use following query to fetch rows between 6-10 (including)in Oracle database

```sql
(select * from EMPLOYEE
where ROWNUM < 11 )
MINUS
(select * from EMPLOYEE
where ROWNUM < 6);
 ```

OR,

 ```sql
select emp.id, emp.name from ( select rownum rn, e.* from EMPLOYEE e) emp
 where rn >=6 and rn< =10 ;
 ```

**Pagination in MySql**
Fetch rows between 6-10 (including) in MySql database
```sql
select * from my_schema.employee limit 5  OFFSET 5;
```

#### 25. How to fetch/retrieve top n records from table in java?

`preparedStatement.setMaxRows(2)` method sets the limit for the maximum number of rows that any ResultSet object generated by this Statement object can contain to the specified number. If in case limit is exceeded then excess number of rows are dropped without intimating user.


This can also be done by using rownum in oracle database query >
```sql
select * from EMPLOYEE where ROWNUM<3;
```
This query will fetch top 2 rows from oracle database.


Fetch top 2 rows in MySql database >
```sql
select * from my_schema.employee limit 2;
select * from my_schema.employee limit 2  OFFSET 0;
```


#### 26. How to Insert date in JDBC java?

In database >
```sql
create table EMPLOYEE(CREATION_DATE DATE);
```

For inserting date in Jdbc use -
```java
new java.sql.Date(new java.util.Date().getTime())
```

Example -
```java
prepStmt.setDate(1, new java.sql.Date(new java.util.Date().getTime()));
```

#### 27. How to Insert timestamp in JDBC java?



#### 28. What is RowSet in JDBC java JDBC? What are connected and disconnected implementations of RowSet in java?

`javax.sql.RowSet` is an interface which can be used as a  
> JavaBeans component in a visual Bean development environment, 
It can be created and configured at design time and can be executed at run time in JDBC java.

`RowSet` interface extends `ResultSet` interface in JDBC java.

Following classes implements `RowSet` interface in java>
Connected implementations of `RowSet` (connected rowset means it continues to maintain its connection with database after retrieval of data as well)
`javax.sql.rowset.JdbcRowSet`


Disconnected implementations of RowSet in JDBC java
1. `javax.sql.rowset.CachedRowSet`
2. `javax.sql.rowset.WebRowSet`
3. `javax.sql.rowset.FilteredRowSet`
4. `javax.sql.rowset.JoinRowSet`



#### 29. What is Connected implementations of RowSet in JDBC java ??

connected rowset means it continues to maintain its connection with database after retrieval of data as well.

#### 30. What is Disconnected implementations of RowSet in JDBC java ?

 `javax.sql.RowSet` is an interface which can be used as a JavaBeans component in a visual Bean development environment, It can be created and configured at design time and can be executed at runtime in java.

 
