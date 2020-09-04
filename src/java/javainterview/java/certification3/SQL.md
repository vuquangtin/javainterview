## [SQL](./SQL.md)



#### 1. Write SQL query to get the second highest salary among all Employees?

There are multiple ways to get the second highest salary among all Employees.

1. **Option 1**: Use Subquery
```sql
SELECT MAX(Salary)
FROM Employee
WHERE Salary NOT IN
  (SELECT MAX(Salary) FROM Employee
  );
```
In this approach, we are getting the maximum salary in a subquery and then excluding this from the rest of the resultset.

2. **Option 2**: Use Not equals
```sql
SELECT MAX(Salary)
FROM Employee
WHERE Salary <>
  (SELECT MAX(Salary) FROM Employee
  );
```
This is same as option 1 but we are using <> instead of NOT IN.


3. **Option 3**: It ranks the salaries in a decreasing order and selects the row(s) that have rank 2 (second highest).
```sql
SELECT a.salary
FROM
  (SELECT *,
    dense_rank() over (partition BY salary order by salary DESC) sal_max
  FROM emp_table
  ) a
WHERE a.sal_max = 2
```

4. **Option 4**:
```sql
SELECT id,
  salary
FROM employee
WHERE (SELECT COUNT(*) FROM employee e WHERE e.salary >= employee.salary) = 2
```
#### 2. How can we retrieve alternate records from a table in Oracle?

We can use rownum and MOD function to retrieve the alternate records from a table.

**To get Even number records**:
```sql
SELECT * FROM
  (SELECT rownum, ID, Name FROM Employee
  ) WHERE MOD(rownum,2)=0
```

**To get Odd number records**:
```sql
SELECT * FROM
  (SELECT rownum, ID, Name FROM Employee
  ) WHERE MOD(rownum,2)=1
```

#### 3. Write a SQL Query to find Max salary and Department name from each department.

This is a trick question. There can be some department without any employee. So we have to ask interviewer if they expect the name of such Department also in result.

If yes then we have to join Department table with Employee table by using foreign key DeptID. We have to use LEFT OUTER JOIN to print all the departments.

Query would be like as follows:
```sql
SELECT d.DeptName,
  MAX(e.Salary)
FROM Department d
LEFT OUTER JOIN Employee e
ON e.DeptId = d.ID
GROUP BY DeptName
```

#### 4. Write a SQL query to find records in Table A that are not in Table B without using NOT IN operator.



#### 5. What is the result of following query?

```sql
SELECT MAX(Salary)
FROM Employee
WHERE Salary <>
  (SELECT MAX(Salary) FROM Employee
  );
```

#### 6. Write SQL Query to find employees that have same name and email.

This is a simple question with one trick. The trick here is to use Group by on two columns Name and Email.

Query would be as follows:
```sql
SELECT name,
  email,
  COUNT(*)
FROM Employee
GROUP BY name,
  email
HAVING COUNT(*) > 1
```

#### 7. Write a SQL Query to find Max salary from each department.

We can first use group by DeptID on Employee table and then get the Max salary from each Dept group.
```sql
SELECT DeptID, MAX(salary) FROM Employee GROUP BY DeptID
```

#### 8. Write SQL query to get the nth highest salary among all Employees.

We can use following sub query approach for this:
Option 1: Use Subquery
```sql
SELECT *
FROM Employee emp1
WHERE (N-1) =
  (SELECT COUNT(DISTINCT(emp2.salary))
  FROM Employee emp2
  WHERE emp2.salary > emp1.salary
  );
```

Option 2: Using Rownum in Oracle

```sql
SELECT *
FROM
  (SELECT emp.*,
    row_number() OVER (ORDER BY salary DESC) rnum
  FROM Employee emp
  )
WHERE rnum = n;
```

#### 9. How can you find 10 employees with Odd number as Employee ID?

In Oracle we can use Top to limit the number of records. We can also use Rownum < 11 to get the only 10 or less number of records.

To find the Odd number Employee ID, we can use % function.

Sample Query with TOP:
```sql
SELECT TOP 10 ID FROM Employee WHERE ID % 2 = 1;
```
Sample Query with ROWNUM:
```sql
SELECT ID FROM Employee WHERE ID % 2 = 1 AND ROWNUM < 11;
```

#### 10. Write a SQL Query to get the names of employees whose date of birth is between 01/01/1990 to 31/12/2000.

This SQL query appears a bit tricky. We can use BETWEEN clause to get all the employees whose date of birth lies between two given dates.

Query will be as follows:
```sql
SELECT EmpName
FROM Employees
WHERE birth_date BETWEEN '01/01/1990' AND '31/12/2000';
```
Remember BETWEEN is always inclusive of both the dates.

#### 11. Write a SQL Query to get the Quarter from date.

We can use to_char function with ‘Q’ option for quarter to get quarter from a date.
**Use TO_CHAR with option ‘Q’ for Quarter**
```sql
SELECT TO_CHAR(TO_DATE('5/31/2016', 'MM/DD/YYYY'), 'Q') AS quarter FROM DUAL;
```
Result: 2

#### 12. Write Query to find employees with duplicate email.

We can use Group by clause on the column in which we want to find duplicate values.

Query would be as follows:

```sql
SELECT name,
  COUNT(email)
FROM Employee
GROUP BY email
HAVING ( COUNT(email) > 1 )
```

#### 13. Is it safe to use ROWID to locate a record in Oracle SQL queries?

ROWID is the physical location of a row. We can do very fast lookup based on ROWID. In a transaction where we first search a few rows and then update them one by one, we can use ROWID.

But ROWID of a record can change over time. If we rebuild a table a record can get a new ROWID.

If a record is deleted, its ROWID can be given to another record.

So it is not recommended to store and use ROWID in long term. It should be used in same transactions.

#### 14. What is a Pseudocolumn?

A Pseudocolumn is like a table column, but it is not stored in the same table. We can select from a Pseudocolumn, but we can not insert, update or delete on a Pseudocolumn.

A Pseudocolumn is like a function with no arguments.

Two most popular Pseudocolumns in Oracle are `ROWID` and `ROWNUM`.

`NEXTVAL` and `CURRVAL` are also pseudo columns.

#### 15. What are the reasons for de-normalizing the data?

We de-normalize data when we need better performance. Sometimes there are many joins in a query due to highly normalized data.

In that case, for faster data retrieval it becomes essential to de-normalize data.

#### 16. What is the feature in SQL for writing If/Else statements?

In SQL, we can use CASE statements to write If/Else statements.

We can also use DECODE function in Oracle SQL for writing simple If/Else logic.


#### 17. What is the difference between DELETE and TRUNCATE in SQL?

Main differences between DELETE and TRUNCATE commands are:

| Point          | DELETE                                                                                                       | TRUNCATE                                                                                                        |
| -------------- | ------------------------------------------------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------- |
| DML vs. DDL    | DELETE is a Data Manipulation Language (DML) command.                                                        | TRUNCATE is a Data Definition Language (DDL) command.                                                           |
| Number of Rows | We can use DELETE command to remove one or more rows from a table.                                           | TRUNCATE command will remove all the rows from a table.                                                         |
| WHERE clause   | DELETE command provides support for WHERE clause that can be used to filter the data that we want to delete. | TRUNCATE command can only delete all the rows. There is no WHERE clause in TRUNCATE command.                    |
| Commit         | After DELETE command we have to issue COMMIT or ROLLBACK command to confirm our changes.                     | After TRUNCATE command there is no need to run COMMIT. Changes done by TRUNCATE command can not be rolled back. |




#### 18. What is the difference between DDL and DML commands in SQL?

Main differences between Data Definition Language (DDL) and Data Manipulation Language (DML) commands are:

1. **DDL vs. DML**: DDL statements are used for creating and defining the Database structure. DML statements are used for managing data within Database.
2. **Sample Statements**: DDL statements are CREATE, ALTER, DROP, TRUNCATE, RENAME etc. DML statements are SELECT, INSERT, DELETE, UPDATE, MERGE, CALL etc.
3. **Number of Rows**: DDL statements work on whole table. CREATE will a create a new table. DROP will remove the whole table. TRUNCATE will delete all records in a table. DML statements can work on one or more rows. INSERT can insert one or more rows. DELETE can remove one or more rows.
4. **WHERE clause**: DDL statements do not have a WHERE clause to filter the data. Most of DML statements support filtering the data by WHERE clause.
5. **Commit**: Changes done by a DDL statement can not be rolled back. So there is no need to issue a COMMIT or ROLLBACK command after DDL statement. We need to run COMMIT or ROLLBACK to confirm our changes after running a DML statement.
6. **Transaction**: Since each DDL statement is permanent, we can not run multiple DDL statements in a group like Transaction. DML statements can be run in a Transaction. Then we can COMMIT or ROLLBACK this group as a transaction. E.g. We can insert data in two tables and commit it together in a transaction.
7. **Triggers**: After DDL statements no triggers are fired. But after DML statements relevant triggers can be fired.

#### 19. Why do we use Escape characters in SQL queries?

In SQL, there are certain special characters and words that are reserved for special purpose. E.g. & is a reserved character.

When we want to use these special characters in the context of our data, we have to use Escape characters to pass the message to database to interpret these as non Special / non Reserved characters. 

#### 20. What is the difference between Primary key and Unique key in SQL?

Main differences between Primary key and Unique key in SQL are:

1. **Number**: There can be only one Primary key in a table. There can be more than one Unique key in a table.
2. **Null value**: In some DBMS Primary key cannot be NULL. E.g. MySQL adds NOT NULL to Primary key. A Unique key can have null values.
3. **Unique Identifier**: Primary Key is a unique identifier of a record in database table. Unique key can be null and we may not be able to identify a record in a unique way by a unique key
4. **Changes**: It is not recommended to change a Primary key. A Unique key can be changed much easily.
5. **Usage**: Primary Key is used to identify a row in a table. A Unique key is used to prevent duplicate non-null values in a column.

#### 21. What is the difference between INNER join and OUTER join in SQL?

Let say we have two tables X and Y.

The result of an INNER JOIN of X and Y is X intersect. It is the INNER overlapping intersection part of a Venn diagram.

The result of an OUTER JOIN of X and Y is X union Y. It is the OUTER parts of a Venn diagram.

E.g.

Consider following two tables, with just one column x and y:

| x   | y   |
| --- | --- |
| 10  | 30  |
| 20  | 40  |
| 30  | 50  |
| 40  | 60  |

In above tables (10,20) are unique to table X, (30,40) are common, and (50,60) are unique to table Y.

**INNER JOIN**

An INNER JOIN by using following query will give the intersection of the two tables X and Y. The intersection is the common data between these tables.

```sql
select * from X INNER JOIN Y on X.x = Y.y;
```

| x   | y   |
| --- | --- |
| 30  | 30  |
| 40  | 40  |

**OUTER JOIN**

A full OUTER JOIN by using following query will us the union of X and Y. It will have all the rows in X and all the rows in Y. If some row in X has not corresponding value in Y, then Y side will be null, and vice versa.

```sql
select * from X FULL OUTER JOIN Y on X.x = Y.y;
```
| x    | y    |
| ---- | ---- |
| 10   | null |
| 20   | null |
| 30   | 30   |
| 40   | 40   |
| null | 60   |
| null | 50   |

![joins and set operations](https://madhukiranb.files.wordpress.com/2012/11/joins.jpg)

#### 22. What is the difference between Left OUTER Join and Right OUTER Join?

Let say we have two tables X and Y.

The result of an LEFT OUTER JOIN of X and Y is all rows of X and common rows between X and Y.

The result of an RIGHT OUTER JOIN of X and Y is all rows of Y and common rows between X and Y.

E.g.

Consider following two tables, with just one column x and y:

| x   | y   |
| --- | --- |
| 10  | 30  |
| 20  | 40  |
| 30  | 50  |
| 40  | 60  |

In above tables (10,20) are unique to table X, (30,40) are common, and (50,60) are unique to table Y.

LEFT OUTER JOIN

A left OUTER JOIN by using following query will give us all rows in X and common rows in X and Y.

select * from X LEFT OUTER JOIN Y on X.x = Y.y;

| x   | y    |
| --- | ---- |
| 10  | null |
| 20  | null |
| 30  | 30   |
| 40  | 40   |

RIGHT OUTER JOIN

A right OUTER JOIN by using following query will give all rows in Y and common rows in X and Y.

select * from X RIGHT OUTER JOIN Y on X.x = Y.y;

| x    | y   |
| ---- | --- |
| 30   | 30  |
| 40   | 40  |
| null | 50  |
| null | 60  |

![sql joins](https://pbs.twimg.com/media/CQ-gXYcWgAAPGRh.png:large)
![](https://i.stack.imgur.com/iKBL4.png)

#### 23. What is the datatype of ROWID?

ROWID Pseudocolumn in Oracle is of ROWID datatype. It is a string that represents the address of a row in the database. 

#### 24. What is the difference between where clause and having clause?

We use where clause to filter elements based on some criteria on individual records of a table.

E.g. We can select only employees with first name as John.
```sql
SELECT ID, Name
FROM Employee
WHERE name = ‘John’
```
We use having clause to filter the groups based on the values of aggregate functions.

E.g. We can group by department and only select departments that have more than 10 employees.
```sql
SELECT deptId, count(1)

FROM Employee GROUP BY deptId HAVING count(*) > 10.
```

#### 25. What is cardinality in SQL?

In SQL, Cardinality is the uniqueness of data values in a column. If cardinality is low then a column will have more duplicated values.

Database use Cardinality of a column to determine the optimal query plan for a query.

of elements in a set. Thinking in the database world, cardinality has to do with the counts in a relationship, one-to-one, one-to-many, or many-to-many.

#### 26. What is Merge statement in SQL?

Merge statement is a combination of INSERT and UPDATE statements. If data is already present in a table, it can update the existing data. If data is not present in a table, then it can insert the data.

Merge is a DML statement. So we need to run commit or rollback command after this.

Sample syntax for MERGE is:
```sql
MERGE INTO target_table tg_table USING source_table src_table 
    ON ( src_table.id = tg_table.id )
WHEN MATCHED THEN
  UPDATE SET tg_table.name = src_table.name WHEN NOT MATCHED THEN
  INSERT
    ( tg_table.id, tg_table.name
    ) VALUES
    ( src_table.id, src_table.name
    );
```

#### 27. What is the difference between UNION and UNION ALL?

Main difference between UNION and UNION ALL is that UNION removes duplicate records, but UNION ALL does not remove duplicate records.

E.g. Consider two tables A and B

| A   | B   |
| --- | --- |
| 10  | 15  |
| 20  | 20  |

UNION of A and B = 10, 20, 15

UNION ALL of A and B = 10, 12, 15, 20

Performance of UNION ALL is considered better than UNION, since UNION ALL does not require additional work of removing duplicates.

#### 28. What will be the result of following query?

Consider following tables:

<table>
<tr><th>Employee</th><th>Department</th></tr>
<tr><td>

| ID  | Emp_name |
| --- | -------- |
| 1   | Jane     |
| 2   | George   |
| 3   | John     |

</td><td>


| ID  | Dept_name  | Emp_id |
| --- | ---------- | ------ |
| 1   | Marketing  | 1      |
| 2   | Finance    | 2      |
| 3   | Technology | null   |

</td></tr> </table>

```sql
SELECT * FROM Employee WHERE id NOT IN
  (SELECT Emp_id FROM Department
  )
```
Answer: The above query will return no records. The reason for this is presence of null value in Emp_id column of Department table.

When we do SELECT Emp_id FROM Department, we get null value also. Now in main query we compare NOT IN with null value, then it does not return any result.

The correct query is:

```sql
SELECT *
FROM Employee
WHERE id NOT IN
  (SELECT Emp_id FROM Department WHERE Emp_id IS NOT NULL
  )
```
#### 29. What is the wrong with this SQL query?

The `with` clause provides a way of defining a temporary view whose definition is available only to the query in which the with clause occurs.


#### 30. What is wrong with this query to get the list of employees not in Dept 1?



#### 31. What is the use of Execution plan in SQL?



#### 32. How many records are returned by following query?



#### 33. Write a query for this problem?



#### 34. Write SQL Query to get Employee Name, Manager ID and number of employees in the department?



#### 35. Write SQL Query to find duplicate rows in a database?



#### 36. Write SQL query to delete duplicate rows in a table?



#### 37. Why is the difference between NVL and NVL2 functions in SQL?

The nvl function only has two parameters while the nvl parameter has three arguments.  The nvl2 like like combining an nvl with a decode because you can transform a value:

NVL ( expr1 , expr2 ): If expr1 is null, then NVL returns expr2. If expr1 is not null, then NVL returns expr1.

NVL2 ( expr1 , expr2 , expr3 ): If expr1 is null, then NVL2 returns expr3. If expr1 is not null, then NVL2 returns expr2

As we see, the vanilla nvl transformation takes a NULL value and replaces it with a printable, useable value, such as a zero or spaces:

```sql
select nvl(b.buffer_gets,0) - NVL replaces a NULL value with a zero
select nvl(current_status, ?Not disclosed?) - NVL replaces a NULL value with a string
Conversely, the NVL2 clause accepts three arguments, but ALWAYS transforms the input argument. 
```

select NVL2(supplier_city, 'Completed', 'n/a') from suppliers;

In this example, these statements are equivalent because the nvl2 re-sets the input argument back to the original value:

select nvl(commission_pct,0) 2 from employees;

select nvl2(commission_pct,commission_pct,0) 2 from employees;

#### 38. What are ACID properties in a SQL transaction?

**A**tomicity, **C**onsistency, **I**solation, **D**urability are set of properties that guarantee database transactions are processed reliably. In the context of databases, a single logical operation on the data is called a transaction. 

For example, a transfer of funds from one bank account to another, even though that might involve multiple changes (such as debiting one account and crediting another), is a single transaction.


#### 39. What is the main difference between RANK and DENSE_RANK functions in Oracle?

RANK gives you the ranking within your ordered partition. Ties are assigned the same rank, with the next ranking(s) skipped. So, if you have 3 items at rank 2, the next rank listed would be ranked 5.

DENSE_RANK again gives you the ranking within your ordered partition, but the ranks are consecutive. No ranks are skipped if there are ranks with multiple items.

As for nulls, it depends on the ORDER BY clause. Here is a simple test script you can play with to see what happens:

```sql
with q as (
select 10 deptno, 'rrr' empname, 10000.00 sal from dual union all
select 11, 'nnn', 20000.00 from dual union all
select 11, 'mmm', 5000.00 from dual union all
select 12, 'kkk', 30000 from dual union all
select 10, 'fff', 40000 from dual union all
select 10, 'ddd', 40000 from dual union all
select 10, 'bbb', 50000 from dual union all
select 10, 'xxx', null from dual union all
select 10, 'ccc', 50000 from dual)
select empname, deptno, sal
     , rank() over (partition by deptno order by sal nulls first) r
     , dense_rank() over (partition by deptno order by sal nulls first) dr1
     , dense_rank() over (partition by deptno order by sal nulls last) dr2
 from q; 
```
| EMP | DEPTNO | SAL   | R    | DR1  | DR2  |
| --- | -----: | ----: | ---: | ---: | ---: |
| xxx | 10     |       | 1    | 1    | 4    |
| rrr | 10     | 10000 | 2    | 2    | 1    |
| fff | 10     | 40000 | 3    | 3    | 2    |
| ddd | 10     | 40000 | 3    | 3    | 2    |
| ccc | 10     | 50000 | 5    | 4    | 3    |
| bbb | 10     | 50000 | 5    | 4    | 3    |
| mmm | 11     | 5000  | 1    | 1    | 1    |
| nnn | 11     | 20000 | 2    | 2    | 2    |
| kkk | 12     | 30000 | 1    | 1    | 1    |

`9 rows selected.`

#### 40. What is the use of WITH clause in SQL?

The SQL WITH clause was introduced by Oracle in the Oracle 9i release 2 database. The SQL WITH clause allows you to give a sub-query block a name (a process also called sub-query refactoring), which can be referenced in several places within the main SQL query. The name assigned to the sub-query is treated as though it was an inline view or table. The SQL WITH clause is basically a drop-in replacement to the normal sub-query.

Syntax For The SQL WITH Clause

The following is the syntax of the SQL WITH clause when using a single sub-query alias.

```sql
WITH <alias_name> AS (sql_subquery_statement)
SELECT column_list FROM <alias_name>[,table_name]
[WHERE <join_condition>]
```
When using multiple sub-query aliases, the syntax is as follows.
```sql
WITH <alias_name_A> AS (sql_subquery_statement),
<alias_name_B> AS(sql_subquery_statement_from_alias_name_A
or sql_subquery_statement )
SELECT <column_list>
FROM <alias_name_A>, <alias_name_B> [,table_names]
[WHERE <join_condition>]
```
In the syntax documentation above, the occurrences of alias_name is a meaningful name you would give to the sub-query after the AS clause. Each sub-query should be separated with a comma Example for WITH statement. The rest of the queries follow the standard formats for simple and complex SQL SELECT queries.

#### 41. Which SQL feature can be used to view data in a table sequentially?



#### 42. Write SQL Query to get Student Name and number of Students in same grade.



#### 43. Write SQL Query to get the list of grades with total score more than average score.



#### 44. What are the differences between CASE and DECODE in SQL?



#### 45. Write a Query to get Unique names of products without using DISTINCT keyword.



#### 46. Write a SQL query to maximum Zipcode from a table without using MAX or MIN aggregate functions.



#### 47. Given a list of student names and grade. Write a query to print a comma separated list of student names in a grade.



#### 48. What is the difference between Correlated and Un-correlated Sub query?



#### 49. Given an Employee table with Manager_ID as column, print First name, Manager ID and Level of employees in Organization Structure?



#### 50. Write a query to create an empty table from an existing table?

```sql
Select * into studentcopy from student where1=2
```

#### 51. Write a Query to find all Employee whose name contains the word "Rich", regardless of case. E.g. Rich, RICH, rich.


We can use UPPER function for comparing the both sides with uppercase.
```sql
SELECT *
FROM Employees
WHERE  UPPER(emp_name) like '%RICH%'
```

#### What is a constraint?

Constraint can be used to specify the limit on the data type of table. Constraint can be specified while creating or altering the table statement. Sample of constraint are.

1. NOT NULL.
2. CHECK.
3. DEFAULT.
4. UNIQUE.
5. PRIMARY KEY.
6. FOREIGN KEY.

#### What is Self-Join?

Self-join is set to be query used to compare to itself. This is used to compare values in a column with other values in the same column in the same table. ALIAS ES can be used for the same table comparison.

#### What is Cross-Join?

Cross join defines as Cartesian product where number of rows in the first table multiplied by number of rows in the second table. If suppose, WHERE clause is used in cross join then the query will work like an INNER JOIN.